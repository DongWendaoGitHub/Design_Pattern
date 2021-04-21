package factory_pattern.abstract_factory;

public class XiaoMiPcFactory implements AbstractFactory{
    @Override
    public Phone makePhone() {
        return new XiaoMi();
    }

    @Override
    public PC makePC() {
        return new MiPC();
    }
}
