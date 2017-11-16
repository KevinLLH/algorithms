package designPattern.weatherObserverPattern;

/**
 * Created by luhui.liu on 17-11-16.
 */


import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，他知道观察它的观察者，并提供注册（添加）和删除观察者的接口
 */
public class WeatherSubject {

    //用来保存注册的观察者对象
    private List<Observer> observers = new ArrayList<Observer>();

    //attach detach notifyObservers
    //把订阅天气的人添加金列表中

    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除集合中的指定观察者
     *
     * @param observer
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有已经订阅了天气的人
     */
/*    protected void notifyObservers(){
        for (Observer observer : observers) {
            observer.update(this);//推

        }
    }*/
    protected void notifyObservers(String context) {
        for (Observer observer : observers) {
            observer.update(context);//推

        }
    }
}
