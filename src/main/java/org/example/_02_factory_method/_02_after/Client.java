package org.example._02_factory_method._02_after;

public class Client {

    public static void main(String[] args) {
        // --2부까지
        // 다만, 클라이언트 코드는 계속 바뀐다. -> 팩토리가 계속 생김
        // 집중해야할 것은 Ship, ShipFactory 코드가 바뀌지 않는다는 점이다.
        // --


        Client client = new Client();
        client.print(new WhiteshipFactory(), "Whiteship", "keesum@mail.com");
        client.print(new BlackshipFactory(), "Blackship", "keesum@mail.com");
    }

    // --3부
    // '클라이언트 코드는 계속 바뀐다'의 해결점: 이 메서드 안에선 인터페이스 기반 메소드로 코딩을 하므로써 코드가 바뀌지 않는다
    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}
