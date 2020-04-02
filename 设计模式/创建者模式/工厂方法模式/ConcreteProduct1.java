package 设计模式.创建者模式.工厂方法模式;

/**
 * 具体产品1，实现抽象产品中的抽象方法
 */
public class ConcreteProduct1 implements Product {
    @Override
    public void show() {
        System.out.println("具体产品1具体实现");
    }
}
