import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test8.Money;


import static org.junit.jupiter.api.Assertions.*;

public class MultiCurrency8Test {

    /*
        - $5 + 10 CHF = $10
        - Money의 반올림
        - equals()
        - Equal null
        - Equal object
        - Dollar/Franc 중복
        - 공용 times
        - 통화
        - testFrancMultiplication 제거

        불필요한 하위 클래스인 Franc와 Dollar를 삭제하기 위해 통화(currency) 개념을 도입한다

     */

    @DisplayName("7. Dollar 참조 제거 및 Money 팩토리 메서드 사용하도록 변경")
    @Test
    void testMultiplication(){
        test7.Money five = test7.Money.dollar(5);
        assertEquals(new test7.Dollar(10), five.times(2));
        assertEquals(new test7.Dollar(15), five.times(3));
    }

    @DisplayName("7. 팩토리 메서드를 사용해 객체를 생성하도록 수정")
    @Test
    void testFrancMultiplication(){
        test7.Franc five = test7.Money.franc(5);
        assertEquals(test7.Money.franc(10), five.times(2));
        assertEquals(test7.Money.franc(15), five.times(3));
    }

    @DisplayName("7. 팩토리 메서드를 사용해 객체를 생성하도록 수정")
    @Test
    void testEquality(){
        assertTrue(test7.Money.dollar(5).equals(test7.Money.dollar(5)));
        assertFalse(test7.Money.dollar(5).equals(test7.Money.dollar(6)));
        assertTrue(test7.Money.franc(5).equals(test7.Money.franc(5)));
        assertFalse(test7.Money.franc(5).equals(test7.Money.franc(6)));
        assertFalse(test7.Money.franc(5).equals(test7.Money.dollar(5)));
    }

    // 통화 개념을 구현하기 위해 Money에 currency 변수를 추가해 Franc인지 Dollar인지 설정
    @DisplayName("8. 통화 구현")
    @Test
    void testCurrency(){
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
