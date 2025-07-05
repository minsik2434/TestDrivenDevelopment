package test6;

/*
    Franc 과 Dollar의 공통 인스턴스 변수인 amount를 상위 객체인 Money로 옮김

    이제 amount를 상위 객체로 옮겼으므로 amount를 사용하는 equals()를 상위객체 Money 로 옮김
 */
public class Dollar extends Money {

    public Dollar(int amount){
        this.amount = amount;
    }

    public Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }

}
