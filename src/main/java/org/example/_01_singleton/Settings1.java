package org.example._01_singleton;

public class Settings1 {

    private static Settings1 instance;

    private Settings1() { } // 외부에서 생성자를 못 만들게 하기 위해 쓰임

    public static Settings1 getInstance() { // 생성자를 만들지 않으면서 글로벌 접근이 가능하게 하려면 static이 필요하다.
        // 아래와 같은 방법은 멀티쓰레드 환경에서 안전하지 않다.
        // if문에서 동시에 쓰레드가 접근한다면 인스턴스는 2개가 생성되기 때문이다.
        if (instance == null) {
            instance = new Settings1();
        }

        return instance;
    }
}
