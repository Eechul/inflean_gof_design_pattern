package org.example._01_singleton;

// 권장하는 싱글톤 패턴
public class Settings {

    private Settings() {}

    static class SettingsHolder {
        private static final Settings SETTINGS = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.SETTINGS;
    }
}
