package day408.QiaoJie;

public class test01 {
    public static void main(String[] args) {
        Implementor imple=new ConcreteImplementroA();
        imple.OperationImpl();
        Abstraction abs=new RefinedAbstraction(imple);
        abs.Operation();
    }
}
