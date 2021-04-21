package duckduckduck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        //第一次调用performFly会被委托给flyBehavior对象
        model.performFly();
        //调用set方法  使模型鸭具有火箭动力！
        model.setFlyBehavior(new FlyRocketPowered());
        //如果成功   意味着模型鸭可以动态改变它的飞行行为
        model.performFly();
    }
}
