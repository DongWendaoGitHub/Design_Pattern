package observer_mode;

public interface Observer {
    //当气象观测值改变， 主题会将这些状态值当作方法的参数，传递给观察者
    //所有的观察者都必须实现update()方法， 以实现观察者接口
    public void update(float temp , float humidity, float pressure);
}
