package test6;

public class Money {
    protected int amount;

    // Franc은 Franc 끼리만 Dollar는 Dollar 끼리만 비교되도록 수정
    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }
}
