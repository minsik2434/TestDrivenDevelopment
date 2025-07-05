package test1;

/*
    1. $5 * 2 = $10 테스트를 수행하기 위해 테스트 스텁을 구현
 */
public class Dollar {
    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public void times(int multiplier){
        this.amount = amount * multiplier;
    }

}
