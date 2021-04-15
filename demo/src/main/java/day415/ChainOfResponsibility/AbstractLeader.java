package day415.ChainOfResponsibility;

public abstract class AbstractLeader {
    private AbstractLeader leader;

    public AbstractLeader getLeader() {
        return leader;
    }

    public void setLeader(AbstractLeader leader) {
        this.leader = leader;
    }

    public abstract void handleRequest(int leaveDays);
}
