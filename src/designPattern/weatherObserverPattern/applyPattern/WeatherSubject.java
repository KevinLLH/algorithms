package designPattern.weatherObserverPattern.applyPattern;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by luhui.liu on 17-11-16.
 */
public abstract class WeatherSubject {
    //用来保存注册的观察者对象
    public List<Observer> observers = new ArrayList<Observer>();

    //attach detach abstarct notifyObservers
    //把订阅天气的人/观察者添加到订阅者列表中
    public void attach(Observer observer){
        observers.add(observer);
    }
    //删除集合中指定的订阅天气的人
    public void detach(Observer observer){
        observers.remove(observer);
    }

    protected abstract void notifyObservers();





}
