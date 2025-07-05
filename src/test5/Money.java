package test5;

/*
    Franc와 Dollar의 공통변수 amount를 상위객체 Money로 옮긴 후 접근제어자를 protected로 변경
 */
public class Money {
    protected int amount;

    // Franc 과 Dollar의 공통구현 equals() 를 상위 객체 Money로 옮김
    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount;
    }
}
