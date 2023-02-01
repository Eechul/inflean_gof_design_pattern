package org.example._03_abstract_factory._02_after;

import org.example._03_abstract_factory._01_before.WhiteAnchor;
import org.example._03_abstract_factory._01_before.WhiteWheel;

// 구체적인 팩토리
public class WhiteshipPartsFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
