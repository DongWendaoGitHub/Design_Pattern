package factory_pattern.abstract_factory;

//增加PC产品制造接口
public interface AbstractFactory {
    Phone makePhone();
    PC makePC();
}
