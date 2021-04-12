package day40809.Danli;

public class test01 {
    public static void main(String[] args) {
        HungrySingleton h1=HungrySingleton.getInstance();
        HungrySingleton h2=HungrySingleton.getInstance();
        if(h1==h2){
            System.out.println("创建成功");
        }else {
            System.out.println("创建失败");
        }


    }
}
