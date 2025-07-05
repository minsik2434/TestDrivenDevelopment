import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test2.Dollar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MultiCurrency2Test {
    /*
        2.
        현재 Dollar 는 times()를 실행할때마다 값이 바뀜
        값 객체는 객체의 인스턴스 변수가 생성자를 통해 일단 설정된 후에는 변경되면 안된다
        서로 다른 객체에게 dollar 객체를 넘긴 후 서로 다른 객체들은 이 dollar는 별도의 dollar로 처리하길 바라지 dollar가 변경되면
        모든 객체에서 이가 바뀔것이라고 예상하지 않음
        a 인스턴스 five 객체 참조
        b 인스턴스 five 객체 참조

        b 인스턴스의 five 객체의 값을 변경하면 a 인스턴스에서 참조하고 있던 five도 동일한 five를 참조하고 있으므로
        a 인스턴스는 원하지 않은 값 변경이 일어난다

        Dollar five = new Dollar(5) => five 객체는 생성자를 통해 amount 가 5로 생성되었으므로 amount 가 반드시 5 여야함
        수정전의 five 객체는 times() 를 실행할때마다 값이 바뀜
     */
    @DisplayName("1. $5 + 2 = $10")
    @Test
    void testMultiplication_수정전(){
        test1.Dollar five = new test1.Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
        five.times(3);
        assertNotEquals(15, five.amount); // five 객체는 times(3)을 실행하면 15여야 한다
    }

    /*
        Dollar의 times() 메서드가 자신의 amount 에 multiplier 을 곱하는게 아닌
        자신의 amount 와 multiplier 를 곱해 새로운 객체를 반환하도록 설정
     */
    @DisplayName("2. 별칭 문제 해결")
    @Test
    void testMultiplication_수정후(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }
}
