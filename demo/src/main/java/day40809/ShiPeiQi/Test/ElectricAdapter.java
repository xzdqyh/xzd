package day40809.ShiPeiQi.Test;

public class ElectricAdapter implements Motor{
    private ElectricMotor emotor;

    public ElectricAdapter(){
        emotor=new ElectricMotor();
    }

    @Override
    public void drive() {
        emotor.electricDrive();
    }
}
