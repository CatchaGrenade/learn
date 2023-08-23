package proxy;

/**
 * 真实类
 */
public class Lenovo implements SaleComputer{
    @Override
    public String sale(double money) {
        System.out.print("花了"+money+"元买啦");
        return "联想电脑";
    }

    @Override
    public void show() {
        System.out.println("展示电脑");
    }
}
