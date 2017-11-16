package designPattern.weatherObserverPattern;

import designPattern.observerPatternCommon.ConcreteSubject;

/**
 * Created by luhui.liu on 17-11-16.
 */
public class Client {
    public static void main(String[] args) {
        //1创建目标
        ConcreteWeatherSubject weather = new ConcreteWeatherSubject();
        //2创建观察者
        ConcreteObserver observerGirl = new ConcreteObserver();
        observerGirl.setObserverName("黄明的女朋友");
        observerGirl.setRemindThing("是我们的第一次约会，地点是街心公园，不见不散哦");

        ConcreteObserver observerMum = new ConcreteObserver();
        observerMum.setObserverName("老妈");
        observerMum.setRemindThing("是一个购物的好日子，明天去天虹扫货");


        //3注册观察者
        weather.attach(observerGirl);
        weather.attach(observerMum);


        //4目标发布天气
        weather.setWeatherConatent("明天天气晴朗");
    }
}
