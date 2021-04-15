package day415.Strategy;

public class StrategyTest {
    public static void main(String[] args) {
        Context contextA=new Context();
        Strategy strategy=new AStrategyImpl();
        contextA.setStrategy(strategy);
        contextA.strategyMethod();
        System.out.println("--分界线--");
        Context contextB=new Context();
        Strategy strategy1=new BStrategyImpl();
        contextB.setStrategy(strategy1);
        contextB.strategyMethod();
    }
}
