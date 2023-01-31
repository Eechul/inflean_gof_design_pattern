package org.example._01_singleton;

public class Settings2 {

    private static Settings2 instance;

    private Settings2() { } // 외부에서 생성자를 못 만들게 하기 위해 쓰임

    // synchronized 키워드 사용: 이 메서드에 한 번에 하나의 쓰레드만 들어오게끔 만들어줌
    // 단점: getInstance 메서드를 호출할때 마다 synchronized가 실행되기 때문에 성능이 안좋을 수 있다.
    public static synchronized Settings2 getInstance() {
        if (instance == null) {
            instance = new Settings2();
        }

        return instance;
    }
}
