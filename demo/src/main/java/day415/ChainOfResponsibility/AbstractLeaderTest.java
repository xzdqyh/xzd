package day415.ChainOfResponsibility;

public class AbstractLeaderTest {
    public static void main(String[] args) {
        AbstractLeader leader=new ClassAdviser();
        AbstractLeader leader1=new DepartmentHead();
        AbstractLeader leader2=new DeanOfStudies();

        leader.setLeader(leader1);
        leader1.setLeader(leader2);

        leader.handleRequest(1);
        leader.handleRequest(3);
        leader.handleRequest(8);
        leader.handleRequest(90);
    }
}
