package functionalInterface;

/*
    @Override: 检查方法是否是重写的方法 是：编译成功　否：　编译失败

    @FunctionalInterface: 可以检测接口是否是一个函数式接口（有且只有一个抽象方法）
 */
@FunctionalInterface
public interface MyFunctionalInterface {

    void method();

}
