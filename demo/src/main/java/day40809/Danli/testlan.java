package day40809.Danli;

public class testlan {
    public static void main(String[] args) {
        lan l1=lan.getInstance();
        lan l2=lan.getInstance();
        if (l1==l2){
            System.out.println("成功了");
        }else{
            System.out.println("失败了");
        }
        System.out.println("----------");
       ehan e1=ehan.getInstance();
       ehan e2=ehan.getInstance();
       if(e1==e2){
           System.out.println("成功了");
       }else {
           System.out.println("失败了");
       }


    }
}
