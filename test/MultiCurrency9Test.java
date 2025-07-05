import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test9.Money;

import static org.junit.jupiter.api.Assertions.*;

public class MultiCurrency9Test {

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

        불필요한 클래스인 Dollar, Franc 를 제거하기 위해 공통구현인 times()를 상위 객체인 Money로 옮겨
        Dollar, Franc 를 제거한다

     */

    @DisplayName("7. Dollar 참조 제거 및 Money 팩토리 메서드 사용하도록 변경")
    @Test
    void testMultiplication(){
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @DisplayName("7. 팩토리 메서드를 사용해 객체를 생성하도록 수정")
    @Test
    void testFrancMultiplication(){
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @DisplayName("7. 팩토리 메서드를 사용해 객체를 생성하도록 수정")
    @Test
    void testEquality(){
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    // 통화 개념을 구현하기 위해 Money에 currency 변수를 추가해 Franc인지 Dollar인지 설정
    @DisplayName("8. 통화 구현")
    @Test
    void testCurrency(){
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
