package decorator_pattern;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha摩卡咖啡";
    }

    //计算带摩卡饮料的价钱，
    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
