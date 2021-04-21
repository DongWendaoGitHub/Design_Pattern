package factory_pattern.factory_method;

public class XiaoMi implements Phone {

    public XiaoMi(){
        this.make();
    }

    @Override
    public void make() {
        System.out.println("工厂方法  --  在这里制造小米手机！");
    }
}
