package designPattern.strategy;

import designPattern.strategy.imp.FlyWithWin;

/**
 * Created by luhui.liu on 17-11-16.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        super();
        super.setFlyingStrategy(new FlyWithWin());
    }

    @Override
    public void dispaly() {
        System.out.println("MallardDuck");
    }

}
