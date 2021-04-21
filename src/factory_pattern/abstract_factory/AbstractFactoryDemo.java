package factory_pattern.abstract_factory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory xiaoMiPcFactory = new XiaoMiPcFactory();
        AbstractFactory huaWeiPcFactory = new HuaWeiPcFactory();
        xiaoMiPcFactory.makePhone();            // 制造小米手机
        xiaoMiPcFactory.makePC();                // 制造小米手机 PC!
        huaWeiPcFactory.makePhone();        // 制造华为手机!
        huaWeiPcFactory.makePC();            //制造华为手机  pc!
    }
}
