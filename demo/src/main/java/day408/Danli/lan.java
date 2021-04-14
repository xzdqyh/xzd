package day408.Danli;

public class lan {
    private static lan instance=null;

    lan(){
        System.out.println("创建成功");
    }

    public static lan getInstance(){
        if(instance==null){
            instance=new lan();
        }else{
            System.out.println("已存在");
        }
        return null;
    }

}
