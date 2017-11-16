package designPattern.observerPatternCommon;

/**
 * Created by luhui.liu on 17-11-16.
 */

import designPattern.weatherObserverPattern.ConcreteWeatherSubject;
import designPattern.weatherObserverPattern.WeatherSubject;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的观察者对象，实现更新的方法，是自身的状态和目标的状态保持一致
 */
public class ConcreteObserver implements Observer {



    //观察者状态
    private String observerState;

    /**
     * 获取目标类的状态同步到观察者的状态中
     * @param subject
     */
    @Override
    public void update(Subject subject) {
        observerState = ((ConcreteSubject)subject).getSubjectState();
    }


}
