package day408.Danli;

public class ehan {
    private static ehan instance=new ehan();

    private ehan(){
        System.out.println("εε»Ίζε");
    }

    public static ehan getInstance(){
        return instance;
    }
}
