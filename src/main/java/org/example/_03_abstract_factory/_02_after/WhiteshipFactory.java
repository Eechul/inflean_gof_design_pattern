package org.example._03_abstract_factory._02_after;


import org.example._02_factory_method._02_after.DefaultShipFactory;
import org.example._02_factory_method._02_after.Ship;
import org.example._02_factory_method._02_after.Whiteship;
import org.example._03_abstract_factory._01_before.WhiteAnchor;
import org.example._03_abstract_factory._01_before.WhiteWheel;

// Client 코드
public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        // 팩토리를 통해 anchor와 wheel을 만들어준다
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
