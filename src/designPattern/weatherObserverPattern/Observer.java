package designPattern.weatherObserverPattern;

/**
 * Created by luhui.liu on 17-11-16.
 */

import designPattern.observerPatternCommon.Subject;

/**
 * 这是一个观察者接口，定义一个更新的接口给那些在目标发生改变的到时候被通知的对象
 */
public interface Observer {
    /**
     * 更新的接口
     * @param
     */
     /*void update(WeatherSubject subject);//拉模型，传递对象*/
     void update(String content);//推模型，传递具体需要的内容

}
