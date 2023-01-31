package org.example._02_factory_method._02_after;

public class Whiteship extends Ship {

    // 클래스는 확장에 열려있어야 하며(Ship 클래스를 확장함), 변경에 닫혀있어야(Ship을 변경하지 않고 확장했다.) 한다
    public Whiteship() {
        setName("whiteship");
        setLogo("\uD83D\uDEE5️");
        setColor("white");
    }
}
