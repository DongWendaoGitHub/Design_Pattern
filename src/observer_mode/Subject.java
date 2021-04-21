package observer_mode;

public interface Subject {
    //观察者用于注册和删除
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    //用于通知所有的观察者
    public void notifyObservers();

}
