package designPattern.strategy;

/**
 * Created by luhui.liu on 17-11-15.
 */
public abstract class Duck {

    public void quack(){
        System.out.println("gagaga");

    }
    public abstract void dispaly();

    private FlyingStrategy flyingStrategy;

    public void setFlyingStrategy(FlyingStrategy flyingStrategy) {
        this.flyingStrategy = flyingStrategy;
    }
}
