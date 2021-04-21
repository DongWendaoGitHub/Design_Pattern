package factory_pattern.simple_product;

//手机代工厂（Factory）
public class PhoneFactory {
    public Phone makePhone(String phoneType) {
        /**
         *equalsIgnoreCase 方法用于将字符串与指定的对象比较，不考虑大小写。
         * */
        if(phoneType.equalsIgnoreCase("XiaoMi")){
            return new XiaoMi();
        }
        else if(phoneType.equalsIgnoreCase("HuaWei")) {
            return new HuaWei();
        }
        return null;
    }
}
