package org.example._02_factory_method._02_after;

public class WhiteshipFactory implements ShipFactory{

    @Override
    public Ship createShip() {
        // 알맞는 Product 클래스를 만든 후, 리턴해준다.
        return new Whiteship();
    }
}
