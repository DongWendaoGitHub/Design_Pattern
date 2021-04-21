package factory_pattern.simple_product;

public class XiaoMi implements Phone {

    public XiaoMi(){
        this.make();
    }

    @Override
    public void make() {
        System.out.println("简单工厂  --   在这里制造小米手机！");
    }
}
