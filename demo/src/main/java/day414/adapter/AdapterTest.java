package day414.adapter;

//适配器模式
public class AdapterTest {
    public static void main(String[] args) {
        System.out.println("适配器模式测试");
        TargetIntreface target= new TargetIntrefaceImpl();
        target.request();
    }
}
