import java.util.HashMap;
import java.util.Map;

public class AppSettings {

    private static AppSettings instance;

    private Map<String, String> settings = new HashMap<>();

    private AppSettings() {
        settings.put("theme", "Dark");
        settings.put("language", "Russian");
        settings.put("filePath", "C:/Files");
    }

    public static synchronized AppSettings getInstance() {
        if (instance == null) {
            instance = new AppSettings();
        }
        return instance;
    }

    public void setSetting(String key, String value) {
        settings.put(key, value);
    }

    public String getSetting(String key) {
        return settings.get(key);
    }
}
