package test2;

public class Dollar {
    public int amount;

    public Dollar(int amount){
        this.amount = amount;
    }
    // 값 객체 인스턴스가 변하지 않는 amount 를 갖도록 하기 위해 새로운 Dollar 객체를 생성해서 반환
    public Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }
}
