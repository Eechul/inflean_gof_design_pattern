package org.example._03_abstract_factory._02_after;

import org.example._02_factory_method._02_after.DefaultShipFactory;
import org.example._02_factory_method._02_after.Ship;

public class WhiteshipPartsProFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
