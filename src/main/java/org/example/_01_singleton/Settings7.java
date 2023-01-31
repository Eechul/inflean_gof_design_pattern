package org.example._01_singleton;

public enum Settings7 {
    // enum은 리플렉션 불가능, 그래서 유일한 인스턴스 가질 수 있다.
    // 직렬화 & 역직렬화에 안전하다
    // 단점은 인스턴스를 미리 만들어 준다는것, 상속을 못받는것,
    INSTANCE;

    Settings7() {

    }
}
