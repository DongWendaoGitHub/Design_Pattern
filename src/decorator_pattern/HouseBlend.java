package decorator_pattern;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        description = "HouseBlend 混合咖啡";
    }

    @Override
    public double cost() {
        return 1;
    }
}
