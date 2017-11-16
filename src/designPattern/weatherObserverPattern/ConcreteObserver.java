package designPattern.weatherObserverPattern;

/**
 * Created by luhui.liu on 17-11-16.
 */

import designPattern.observerPatternCommon.ConcreteSubject;
import designPattern.observerPatternCommon.Subject;

/**
 * 具体的观察者对象，实现更新的方法，是自身的状态和目标的状态保持一致
 */
public class ConcreteObserver implements Observer {
    //观察者的名字，是谁收到了这个讯息，黄明的女朋友还是他老妈
    private String observerName;

    //天气内容的情况，这个消息从目标处获取
    private String weatcherContent;

    //提醒的内容，黄明的女朋友提醒约会，而他老妈则提醒购物
    private String remindThing;

    /**
     * 获取目标类的状态同步到观察者的状态中
     * @param subject
     */
    @Override
    /*public void update(WeatherSubject subject) {*///推模型
    //拉模型
    public void update(String context) {
        //weatcherContent = ((ConcreteWeatherSubject)subject).getWeatherConatent();
        weatcherContent = context;
        System.out.println(observerName+"收到了"+weatcherContent+"内容："+remindThing);
    }


    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getWeatcherContent() {
        return weatcherContent;
    }

    public void setWeatcherContent(String weatcherContent) {
        this.weatcherContent = weatcherContent;
    }

    public String getRemindThing() {
        return remindThing;
    }

    public void setRemindThing(String remindThing) {
        this.remindThing = remindThing;
    }
}
