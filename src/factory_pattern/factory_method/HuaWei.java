package factory_pattern.factory_method;

public class HuaWei implements Phone {

    public HuaWei(){
        this.make();
    }

    @Override
    public void make() {
        System.out.println("工厂方法  --  在这里制造华为手机！");
    }
}
