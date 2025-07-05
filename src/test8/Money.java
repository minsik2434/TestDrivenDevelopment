package test8;

// 1.통화 개념을 구현하기 위해 Money에 currency 추상 메서드를 구현해 서브 클래스에서 구현하도록 함
// 3. Franc 와 Dollar 의 currency() 가 동일하다 따라서 Money에서 이를 구현하도록 수정

public abstract class Money {
    protected int amount;
    //currency 변수 추가
    protected String currency;
    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }
    // 5. 하위 객체의 생성자가 변경되었음 Money에서 팩토리 메서드로 객체를 생성할때 하위 객체의 currency를 상위 객체에서 지정
//    public static Dollar dollar(int amount){
//        return new Dollar(amount);
//    }
//
//    public static Franc franc(int amount){
//        return new Franc(amount);
//    }

    public Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public static Dollar dollar(int amount){
        return new Dollar(amount, "USD");
    }

    public static Franc franc(int amount){
        return new Franc(amount, "CHF");
    }

    public abstract Money times(int multiplier);

    public String currency(){
        return currency;
    }

}
