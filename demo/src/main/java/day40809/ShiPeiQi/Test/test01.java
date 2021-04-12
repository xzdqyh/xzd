package day40809.ShiPeiQi.Test;

public class test01 {
    public static void main(String[] args) {
        System.out.println("适配器模式测试：");
        //适配光能驱动
        Motor motor= (Motor) new OpticalAdapter();
        motor.drive();
        //适配电能驱动
        Motor motor1= (Motor) new ElectricAdapter();
        motor1.drive();

    }
}
