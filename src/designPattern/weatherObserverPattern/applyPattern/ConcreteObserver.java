package designPattern.weatherObserverPattern.applyPattern;

/**
 * Created by luhui.liu on 17-11-16.
 */
public class ConcreteObserver implements Observer {

    //观察者名称
    private String observerName;

    //天气情况的内容
    private String weatherContent;

    //提醒事项
    private String remindThing;

    @Override
    public void update(WeatherSubject subject) {
        weatherContent = ((ConcreteWeatherSubject)subject).getWeatherContent();
        System.out.println(observerName+"收到了"+weatherContent+","+remindThing);
    }

    @Override
    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public String getObserverName() {
        return observerName;
    }

    public String getRemindThing() {
        return remindThing;
    }

    public void setRemindThing(String remindThring) {
        this.remindThing = remindThring;
    }

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
    }
}
