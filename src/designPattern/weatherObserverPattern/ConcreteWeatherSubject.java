package designPattern.weatherObserverPattern;

/**
 * Created by luhui.liu on 17-11-16.
 */

/**
 * 具体的目标对象，负责把有关状态存入到相应的观察者对象中
 */
public class ConcreteWeatherSubject extends WeatherSubject {

    //获取天气的内容信息
    private String weatherConatent;

    public String getWeatherConatent() {
        return weatherConatent;
    }

    public void setWeatherConatent(String weatherConatent) {
        this.weatherConatent = weatherConatent;
        //内容有了，说明天气更新了，通知所有订阅的人
        this.notifyObservers(weatherConatent);
    }
}
