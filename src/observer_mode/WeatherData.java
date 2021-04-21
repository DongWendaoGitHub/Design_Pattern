package observer_mode;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;


public class WeatherData extends Observable{

    private float temperature;
    private float humidity;
    private float pressure;

    //用一个ArrayList来记录观察者
    public WeatherData(){
    }

    //当从气象站得到更新的观测值时， 我们通知观察者
    public void measurementsChanged(){
        //在调用notifyObservers前，用setChanged指示状态已经改变
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    public float getTemperature(){
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}

//非java内置的观察者模式
/**
 * package observer_mode;
 *
 * import java.util.ArrayList;
 *
 * public class WeatherData implements Subject{
 *
 *     private ArrayList observers;
 *     private float temperature;
 *     private float humidity;
 *     private float pressure;
 *
 *     //用一个ArrayList来记录观察者
 *     public WeatherData(){
 *         observers = new ArrayList();
 *     }
 *
 *     @Override
 *     public void registerObserver(Observer o) {
 *         observers.add(o);
 *     }
 *
 *     @Override
 *     public void removeObserver(Observer o) {
 *         int i = observers.indexOf(o);
 *         if(i >= 0){
 *             observers.remove(o);
 *         }
 *     }
 *
 *     @Override
 *     public void notifyObservers() {
 *         for(int i =0; i<observers.size(); i++){
 *             Observer observer = (Observer) observers.get(i);
 *             observer.update(temperature, humidity, pressure);
 *         }
 *     }
 *
 *     //当从气象站得到更新的观测值时， 我们通知观察者
 *     public void measurementsChange(){
 *         notifyObservers();
 *     }
 *
 *     public void setMeasurements(float temperature, float humidity, float pressure){
 *         this.temperature = temperature;
 *         this.humidity = humidity;
 *         this.pressure = pressure;
 *
 *         measurementsChange();
 *     }
 * }*/
