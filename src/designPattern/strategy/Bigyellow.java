package designPattern.strategy;

import designPattern.strategy.imp.FlyNoWay;

/**
 * Created by luhui.liu on 17-11-16.
 */
public class Bigyellow extends Duck {

    public Bigyellow() {
        super();
        super.setFlyingStrategy(new FlyNoWay());
    }

    @Override
    public void dispaly() {
        System.out.println("大黄鸭");

    }
}
