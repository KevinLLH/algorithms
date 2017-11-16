package designPattern.strategy;

import designPattern.strategy.imp.FlyNoWay;

/**
 * Created by luhui.liu on 17-11-16.
 */
public class RubbleDuck extends Duck {

    public RubbleDuck(){
        super();
        super.setFlyingStrategy(new FlyNoWay());
    }

    @Override
    public void dispaly() {
        System.out.println("RubbleDuck");

    }

    public void quack(){
        System.out.println("不叫");
    }


}
