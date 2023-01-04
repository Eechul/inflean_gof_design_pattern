package org.example.singleton;

public class Settings3 {

    private static final Settings3 INSTANCE = new Settings3(); // 이른 초기화(eager initialization)을 사용하는 방법
    private Settings3() { }

    // thread-safe하다. 멀티 쓰레드라도 미리 만들어진 것만 쓰이기 때문
    // 이른 초기화 단점: 미리 만든다는것 자체가 단점일 수 있다. 애플리케이션 로딩때 만들게 되는데, 만약 잘 안쓴다면? 메모리 낭비
    public static Settings3 getInstance() {
        return INSTANCE;
    }
}
