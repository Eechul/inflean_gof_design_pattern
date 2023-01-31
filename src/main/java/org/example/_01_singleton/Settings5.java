package org.example._01_singleton;

import java.io.Serializable;

public class Settings5 implements Serializable { // 싱글톤 패턴 구현 방법 깨트리기 예제를 위한 Serializable

    private Settings5() { }

    // static inner 클래스 사용하기
    private static class SettingsHolder {
        private static final Settings5 INSTANCE = new Settings5();

    }

    // 멀티 쓰레드 환경에서 안전, lazy 로딩 가능
    public static Settings5 getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
