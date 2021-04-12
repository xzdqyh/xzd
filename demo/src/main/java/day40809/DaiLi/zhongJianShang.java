package day40809.DaiLi;

public class zhongJianShang implements yuanChanDi{
  private chanWu c1;
    @Override
    public void show() {
        if (c1==null){
            c1=new chanWu();
        }
        show1();
        c1.show();
        show2();
    }

    public void show1(){
        System.out.println("中间商来了");
    }

    public void show2(){
        System.out.println("中间商走了");
    }
}
