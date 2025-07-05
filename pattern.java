package project1;

class ConfigManager {
    private static ConfigManager instance;

    private ConfigManager() {
        System.out.println("Singleton Instance Created");
    }

    public static ConfigManager getInstance() {
        if (instance == null)
            instance = new ConfigManager();
        return instance;
    }
}

public class pattern {  
    public static void main(String[] args) {
        ConfigManager c1 = ConfigManager.getInstance();
        ConfigManager c2 = ConfigManager.getInstance();
        System.out.println(c1 == c2);  // true
    }
}
