package decorator_pattern;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Whip 奶泡    ";
    }

    @Override
    public double cost() {
        return 100 + beverage.cost();
    }
}
