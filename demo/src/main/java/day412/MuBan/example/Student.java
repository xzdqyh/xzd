package day412.MuBan.example;

abstract class Student {
    //模板方法
    public void TemplateMethod(){
        schoolName();
        professional();
        Banji();
        //需要具体实现的方法
        sName();
        sSex();
        sSid();
    }

    //具体方法
    public void schoolName(){
        System.out.println("学校：咸阳师范学院");
    }

    public void professional(){
        System.out.println("专业：计算机科学与技术");
    }

    public void Banji(){
        System.out.println("班级：计科1701班");
    }

    //抽象方法
    abstract void sSex();
    abstract void sSid();
    abstract void sName();

}
