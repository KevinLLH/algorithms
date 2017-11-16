package designPattern.weatherObserverPattern.applyPattern;



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
        observerGirl.setRemindThing("下雨了，安静的待在家里吧");

        ConcreteObserver observerMum = new ConcreteObserver();
        observerMum.setObserverName("老妈");
        observerMum.setRemindThing("不管下雨下雪，都不出去了");


        //3注册观察者
        weather.attach(observerGirl);
        weather.attach(observerMum);


        //4目标发布天气
        weather.setWeatherContent("下雨");
        weather.setWeatherContent("下雪");
    }
}
