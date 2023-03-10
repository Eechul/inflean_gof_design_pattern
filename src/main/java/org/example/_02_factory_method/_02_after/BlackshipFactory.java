package org.example._02_factory_method._02_after;

public class BlackshipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        // 알맞는 Product 클래스를 만든 후, 리턴해준다.
        return new Blackship();
    }

    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }
}
