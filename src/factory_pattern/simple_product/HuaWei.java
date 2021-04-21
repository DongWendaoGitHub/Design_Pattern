package factory_pattern.simple_product;

public class HuaWei implements Phone {

    public HuaWei(){
        this.make();
    }

    @Override
    public void make() {
        System.out.println("简单工厂  --  在这里制造华为手机！");
    }
}
