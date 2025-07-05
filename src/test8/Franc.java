package test8;

// 2.Dollar와 Franc의  currency() 메서드는 지정된 문자열을 반환함 따라서 currency 인스턴스 변수를 선언후 이를 반환하도록 설정
public class Franc extends Money {
    //동일 구현인 currency를 상위 객체로 옮김
//    private String currency;

    // 4. 문자열 USD, CHF를 정적 팩토리 메서드로 옮기면 하위 클래스의 생성자가 동일해질것이고 그러면 공통구현을 만들 수 있으므로 하위 클래스의 생성자를 변경
//    public Franc(int amount){
//        this.amount = amount;
//        this.currency = "CHF";
//    }

    // Franc , Dollar 모두 currency를 생성자 인수로 받아 객체를 생성하므로 Franc와 Dollar의 생성자가 동일해짐 => 동일 구현
    // Franc , Dollar 의 생성자가 동일 따라서 상위 객체로 옮길 수 있음
//    public Franc(int amount, String currency){
//        this.amount = amount;
//        this.currency = currency;
//    }

    //이제 상위 클래스 생성자를 통해 생성됨
    public Franc(int amount, String currency){
        super(amount, currency);
    }

    // times 메서드가 팩토리 메서드를 사용해 객체를 반환하도록 수정
    public Money times(int multiplier){
        return Money.franc(amount * multiplier);
    }

//    @Override
//    public String currency() {
//        return "CHF";
//    }

    @Override
    public String currency() {
        return currency;
    }
}
