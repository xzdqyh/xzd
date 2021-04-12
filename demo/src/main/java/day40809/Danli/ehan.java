package day40809.Danli;

public class ehan {
    private static ehan instance=new ehan();

    private ehan(){
        System.out.println("创建成功");
    }

    public static ehan getInstance(){
        return instance;
    }
}
