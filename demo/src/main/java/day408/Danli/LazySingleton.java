package day408.Danli;

public class LazySingleton {
    private static volatile LazySingleton instance=null;

    private LazySingleton(){
        System.out.println("饿汉模式创建完毕");
    }

    public  static  synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        } else {
            System.out.println("单例已经存在了");
        }
            return instance;
    }
}
