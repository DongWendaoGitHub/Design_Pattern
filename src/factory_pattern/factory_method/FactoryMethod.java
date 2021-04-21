package factory_pattern.factory_method;

public class FactoryMethod {
    public static void main(String[] args) {
        XiaoMiFactory xiaomiFactory = new XiaoMiFactory();
        HuaWeiFactory huaweiFactory = new HuaWeiFactory();
        xiaomiFactory.makePhone(); //工厂方法  --  在这里制造小米手机！
        huaweiFactory.makePhone(); //工厂方法  --  在这里制造华为手机！
    }
}
