package factory_pattern.factory_method;

public class XiaoMiFactory implements AbstractFactory {


    @Override
    public Phone makePhone() {
        return (Phone) new  XiaoMi();
    }
}
