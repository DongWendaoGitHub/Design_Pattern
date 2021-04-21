package factory_pattern.factory_method;

public class HuaWeiFactory implements AbstractFactory {

    @Override
    public Phone makePhone() {
        return new HuaWei();
    }
}
