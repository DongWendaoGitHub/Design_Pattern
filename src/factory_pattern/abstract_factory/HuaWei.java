package factory_pattern.abstract_factory;

public class HuaWei implements Phone {

    public HuaWei(){
        this.make();
    }

    @Override
    public void make() {
        System.out.println("抽象工厂  --  在这里制造华为手机！");
    }
}
