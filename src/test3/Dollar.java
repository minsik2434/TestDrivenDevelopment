package test3;

public class Dollar {
    // equals() 구현으로 Dollar 끼리 값을 비교할 수 있으므로 amount 변수 private 로 수정
    private int amount;

    public Dollar(int amount){
        this.amount = amount;
    }

    public Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }

    //값 객체끼리의 비교를 위해 equals() 메서드를 구현
    public boolean equals(Object object){
        Dollar target = (Dollar) object;
        return amount == target.amount;
    }
}
