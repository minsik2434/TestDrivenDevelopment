package test4;

// testFrancMultiplication 을 위한 테스트 스텁을 구현
public class Franc {
    private int amount;

    public Franc(int amount){
        this.amount = amount;
    }
    public Franc times(int multiplier){
        return new Franc(amount * multiplier);
    }

    public boolean equals(Object object){
        Franc target = (Franc) object;
        return amount == target.amount;
    }
}
