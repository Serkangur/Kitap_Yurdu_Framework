package utilities;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import java.io.FileReader;

public class LocatorReader {
    public static By getLocator(String pageName, String key) {
        try {
            String filePath = "src/test/resources/locators/" + pageName + ".json";
            JSONParser parser = new JSONParser();
            FileReader reader = new FileReader(filePath);
            JSONObject locators = (JSONObject) parser.parse(reader);
            reader.close();

            JSONObject locator = (JSONObject) locators.get(key);
            if (locator == null) {
                throw new RuntimeException("Locator bulunamadı: " + key + " (" + pageName + ")");
            }

            String type = (String) locator.get("type");
            String value = (String) locator.get("value");

            switch (type.toLowerCase()) {
                case "id":
                    return By.id(value);
                case "name":
                    return By.name(value);
                case "classname":
                case "class":
                    return By.className(value);
                case "xpath":
                    return By.xpath(value);
                case "css":
                    return By.cssSelector(value);
                case "linktext":
                    return By.linkText(value);
                case "partiallinktext":
                    return By.partialLinkText(value);
                case "tagname":
                    return By.tagName(value);
                default:
                    throw new RuntimeException("Geçersiz locator türü: " + type);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("JSON dosyası okunurken hata oluştu: " + pageName);
        }
    }
}
