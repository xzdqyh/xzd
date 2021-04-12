package day40809.Danli;

public class test02 {
    public static void main(String[] args) {
        LazySingleton l1=LazySingleton.getInstance();
        LazySingleton l2=LazySingleton.getInstance();
        if (l1==l2){
            System.out.println("懒汉模式创建完毕");
        }else {
            System.out.println("创建失败");
        }
    }
}
