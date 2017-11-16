package designPattern.strategy;

import designPattern.strategy.imp.FlyNoWay;

/**
 * Created by luhui.liu on 17-11-16.
 */
public class SpaceDuck extends Duck {
    public SpaceDuck(){
        super();
        super.setFlyingStrategy(new FlyNoWay());
    }
    @Override
    public void dispaly() {
        System.out.println("SpaceDuck");
    }
    public void quack(){
        System.out.println("我通过无线点与你通信");
    }
}
