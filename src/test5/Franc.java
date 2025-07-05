package test5;

// testFrancMultiplication 을 위한 테스트 스텁을 구현
public class Franc extends Money{

    public Franc(int amount){
        this.amount = amount;
    }
    public Franc times(int multiplier){
        return new Franc(amount * multiplier);
    }

}
