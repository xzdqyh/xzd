package day415.ChainOfResponsibility;
//系主任类
public class DepartmentHead extends AbstractLeader{
    @Override
    public void handleRequest(int leaveDays) {
        if(leaveDays<=7){
            System.out.println("系主任批准请假"+leaveDays+"天");
        }else {
            if (getLeader()!=null){
                getLeader().handleRequest(leaveDays);
            }else {
                System.out.println("超出权限");
            }
        }
    }
}
