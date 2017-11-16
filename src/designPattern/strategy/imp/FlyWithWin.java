package designPattern.strategy.imp;

import designPattern.strategy.FlyingStrategy;

/**
 * Created by luhui.liu on 17-11-16.
 */
public class FlyWithWin implements FlyingStrategy {

    @Override
    public void performFly() {
        System.out.println("靠翅膀飞行");
    }
}
