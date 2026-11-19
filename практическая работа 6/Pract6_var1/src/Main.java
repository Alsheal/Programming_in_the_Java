public class Main {
    public static void main(String[] args) throws InterruptedException {

        AppSettings settings = AppSettings.getInstance();
        settings.setSetting("theme", "Light");
        settings.setSetting("language", "English");
        System.out.println("Тема: " + settings.getSetting("theme"));
        System.out.println("Язык: " + settings.getSetting("language"));
        System.out.println("Путь: " + settings.getSetting("filePath"));

        AppSettings settings2 = AppSettings.getInstance();
        System.out.println("Один объект: " + (settings == settings2));

        Thread t1 = new Thread(() -> {
            AppSettings s = AppSettings.getInstance();
            System.out.println("Поток 1: " + s.getSetting("theme")
                    + ", тот же объект: " + (s == settings));
        });
        Thread t2 = new Thread(() -> {
            AppSettings s = AppSettings.getInstance();
            System.out.println("Поток 2: " + s.getSetting("language")
                    + ", тот же объект: " + (s == settings));
        });
        Thread t3 = new Thread(() -> {
            AppSettings s = AppSettings.getInstance();
            System.out.println("Поток 3: " + s.getSetting("filePath")
                    + ", тот же объект: " + (s == settings));
        });

        t1.start(); t2.start(); t3.start();
        t1.join(); t2.join(); t3.join();
    }
}