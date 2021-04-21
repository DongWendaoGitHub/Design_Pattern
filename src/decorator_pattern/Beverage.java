package decorator_pattern;

//基类
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
