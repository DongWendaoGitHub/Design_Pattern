package factory_pattern.abstract_factory;

public class HuaWeiPcFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new HuaWei();
    }

    @Override
    public PC makePC() {
        return new HuaWeiPC();
    }
}
