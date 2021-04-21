package factory_pattern.abstract_factory;

public class HuaWeiPC implements PC {

    public HuaWeiPC(){
        this.make();
    }

    @Override
    public void make() {
        System.out.println("抽象工厂  --  在这里制作华为电脑端产品");
    }
}
