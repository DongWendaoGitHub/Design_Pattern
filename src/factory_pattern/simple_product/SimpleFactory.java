package factory_pattern.simple_product;

public class SimpleFactory  {
    public static void main(String[] args){
        PhoneFactory phoneFactory = new PhoneFactory();
        //Phone xiaomi = phoneFactory.makePhone("XiaoMi");
        //Phone huawei = phoneFactory.makePhone("HuaWei");
        /**
         * PhoneFactory 中的 makePhone 方法
         * */
        XiaoMi xiaomi = (XiaoMi)phoneFactory.makePhone("XiaoMi");
        HuaWei huawei = (HuaWei) phoneFactory.makePhone("HuaWei");
    }
}
