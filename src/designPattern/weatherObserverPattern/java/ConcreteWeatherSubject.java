package designPattern.weatherObserverPattern.java;

import java.util.Observable;

/**
 * Created by luhui.liu on 17-11-16.
 */

//天气目标的具体实现类
public class ConcreteWeatherSubject extends Observable {

    //天气情况的内容
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;

        //天气情况有了，就要通知所有的观察者
        //注意在通知之前，在用java中的observer模型的时候，下面这句话不可少
        this.setChanged();
        //然后主动通知，这里我们先用推的方式来是实现
        this.notifyObservers(content);

        //如果是拉方法
//        this.notifyObservers();
    }
}
