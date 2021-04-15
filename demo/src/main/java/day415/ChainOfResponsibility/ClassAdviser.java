package day415.ChainOfResponsibility;
//班主任类
public class ClassAdviser extends AbstractLeader{
    @Override
    public void handleRequest(int leaveDays) {
        if(leaveDays<=2){
            System.out.println("班主任批准可以请假"+leaveDays+"天");
        }else {
            if(getLeader()!=null){
                getLeader().handleRequest(leaveDays);
            }else {
                System.out.println("超出权限");
            }
        }
    }
}
