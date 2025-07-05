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
        Dollar five = new Dollar(5) => five 객체는 생성자를 통해 amount 가 5로 생성되었으므로 amount 가 반드시 5 여야함
        수정전의 Dollar 객체는 times() 를 실행할때마다 값이 바뀜
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

    @DisplayName("1. $5 + 2 = $10")
    @Test
    void testMultiplication(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }
}
