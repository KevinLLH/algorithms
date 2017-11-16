package designPattern.observerPatternCommon;

/**
 * Created by luhui.liu on 17-11-16.
 */

/**
 * 这是一个观察者接口，定义一个更新的接口给那些在目标发生改变的到时候被通知的对象
 */
public interface Observer {
    /**
     * 更新的接口
     * @param subject
     */
    void update(Subject subject);
}
