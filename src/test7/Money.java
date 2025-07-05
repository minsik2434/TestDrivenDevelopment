package test7;

// 하위 객체를 반환하는 팩토리 메서드를 구현
// Money 클래스를 추상 클래스로 변경 후 하위 클래스에서 times() 메서드를 구현하도록 추상 메서드를 선언
public abstract class Money {
    protected int amount;

    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }
    // 팩토리 메서드 Dollar 객체는 이 팩토리 메서드를 통해 생성
    public static Dollar dollar(int amount){
        return new Dollar(amount);
    }

    public static Franc franc(int amount){
        return new Franc(amount);
    }

    public abstract Money times(int multiplier);
}
