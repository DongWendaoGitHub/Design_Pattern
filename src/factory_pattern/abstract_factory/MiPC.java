package factory_pattern.abstract_factory;

public class MiPC implements PC {
    public MiPC() {
        this.make();
    }
    @Override
    public void make() {
        System.out.println("抽象工厂  --  在这里制作小米电脑端产品");
    }
}
