package day415.ChainOfResponsibility;
//院长类
public class DeanOfStudies extends AbstractLeader{
    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays<=20){
            System.out.println("院长批准请假"+leaveDays+"天");
        }else {
            if (getLeader()!=null){
                getLeader().handleRequest(leaveDays);
            }else {
                System.out.println("时间过长，请退学");
            }
        }
    }
}
