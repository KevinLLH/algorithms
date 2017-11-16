package designPattern.strategy;

import designPattern.strategy.imp.FlyWithWin;

/**
 * Created by luhui.liu on 17-11-16.
 */
public class RedheadDuck extends Duck {

    public RedheadDuck(){
        super();
        super.setFlyingStrategy(new FlyWithWin());
    }

    @Override
    public void dispaly() {
        System.out.println("this is RedheadDuck");
    }


}
