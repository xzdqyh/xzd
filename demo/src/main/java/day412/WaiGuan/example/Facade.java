package day412.WaiGuan.example;

public class Facade {
    private JD jd=new JD();
    private MS ms=new MS();

    public void method(){
        jd.method1();
        System.out.println("----------------");
        ms.method2();
    }

}

class JD{
    public void method1(){
        System.out.println("西安旅游景点：\n华清宫\n兵马俑\n大唐不夜城\n" +
                                          "明长城\n钟鼓楼\n大雁塔");
    }
}
class MS{
    public void method2(){
        System.out.println("西安美食景点：\n回民街\n永新坊\n洒金桥\n" +
                                           "小寨\n大悦城\nMoMoPark");
    }
}

