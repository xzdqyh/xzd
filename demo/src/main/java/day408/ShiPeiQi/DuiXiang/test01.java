package day408.ShiPeiQi.DuiXiang;

import day408.ShiPeiQi.Lei.Adaptee;
import day408.ShiPeiQi.Lei.Target;

public class test01 {
    public static void main(String[] args) {
        System.out.println("对象适配器模式测试：");
        Adaptee adaptee=new Adaptee();
        Target target=new ObjectAdapter(adaptee);
        target.request();
    }
}
