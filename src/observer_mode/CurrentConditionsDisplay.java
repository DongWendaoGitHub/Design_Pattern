package observer_mode;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("当前情况: " + temperature + "F 度 and " + humidity + "% 湿度");
    }
}

//非java内置的观察者模式
/**
 * package observer_mode;
 *
 * public class CurrentConditionsDisplay implements Observer, DisplayElement {
 *
 *     private float temperature;
 *     private float humidity;
 *     private Subject weatherData;
 *
 *     public CurrentConditionsDisplay(Subject weatherData){
 *         this.weatherData = weatherData;
 *         weatherData.registerObserver(this);
 *     }
 *
 *     @Override
 *     public void display() {
 *         System.out.println("当前情况: " + temperature + "F 度 and " + humidity + "% 湿度");
 *     }
 *
 *     @Override
 *     public void update(float temp, float humidity, float pressure) {
 *         this.temperature = temp;
 *         this.humidity = humidity;
 *
 *         display();
 *
 *     }
 * }
 *
 * */
