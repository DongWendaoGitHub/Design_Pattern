package factory_pattern.abstract_factory;

public class XiaoMi implements Phone {

    public XiaoMi(){
        this.make();
    }

    @Override
    public void make() {
        System.out.println("抽象工厂  --  在这里制造小米手机！");
    }
}
