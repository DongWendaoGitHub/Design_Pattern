package duckduckduck;

public abstract class Duck {

    //每只鸭子都会引用实现QuackBehavior接口的对象
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck(){

    }
    public abstract void display();

    //飞行
    public void performFly(){
        flyBehavior.fly();
    }

    //嘎嘎叫  鸭子对象不亲自处理嘎嘎叫行为，而是委托给quackBehavior引用的对象
    public void performQuack(){
        quackBehavior.quack();
    }

    //游泳
    public void swim(){
        System.out.println("all duck can Swiming!");
    }

    //调入两个新方法  可以通过调用这两个新方法随时改变鸭子的行为
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
