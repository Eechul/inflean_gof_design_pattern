package org.example.singleton;

public class Settings4 {

    private static volatile Settings4 instance; // 이 방법은 자바 1.5 이상에서 실행되기 위해 volatile 키워드를 사용해야 한다/

    private Settings4() { }

    // null 체크 후, block형태의 synchronized를 통해 다시 한번 체크해준다.(double checked locking)
    // 단점: volatile 의 이해가 필요. 1.4 이하 버전은 지원하지 않음.
    // 권장하는 방법은 다음 Setting5 에서.
    public static Settings4 getInstance() {
        if (instance == null) {
            synchronized (Settings4.class) {
                if (instance == null) {
                    instance = new Settings4();
                }
            }
        }
        return instance;
    }
}
