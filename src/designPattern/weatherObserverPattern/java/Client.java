package designPattern.weatherObserverPattern.java;

/**
 * Created by luhui.liu on 17-11-16.
 */
public class Client {
    public static void main(String[] args) {
        //创建天气作为一个目标
        ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
        //创建黄明的女朋友作为观察者
        ConcreteObserver girl  = new ConcreteObserver();
        girl.setObserverName("黄明的女朋友");
        //创建黄明的老妈作为观察者
        ConcreteObserver mum= new ConcreteObserver();
        mum.setObserverName("黄明的老妈");

        //注册观察者
        subject.addObserver(girl);
        subject.addObserver(mum);

        //目标更新天气情况
        subject.setContent("天气晴朗");
    }
}
