package day408.Danli;

public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    HungrySingleton(){
        System.out.println("饿汉模式创建成功");
    }

    public static HungrySingleton getInstance(){
        return instance;
    }

}
