package test9;

public class Money {
    protected int amount;
    protected String currency;
    // 검사해야할 것은 클래스가 같은지가 아니라 currency가 같은지이므로 이를 수정한다
    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount && currency().equals(money.currency());
    }

    public Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    //이제 서로 다른 통화는 currency 로 비교되므로 Money 를 반환하도록 수정
    public static Money dollar(int amount){
        return new Money(amount, "USD");
    }

    public static Money franc(int amount){
        return new Money(amount, "CHF");
    }

    public Money times(int multiplier){
        return new Money(amount * multiplier, currency);
    }

    public String currency(){
        return currency;
    }

    //에러를 출력하기 위해 사용
    public String toString(){
        return amount + " " + currency;
    }
}
