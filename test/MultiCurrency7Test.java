import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test7.Dollar;
import test7.Franc;
import test7.Money;

import static org.junit.jupiter.api.Assertions.*;

public class MultiCurrency7Test {

    /*
        - $5 + 10 CHF = $10
        - Money의 반올림
        - equals()
        - Equal null
        - Equal object
        - Dollar/Franc 중복
        - 공용 times


        Franc와 Dollar의 times() 는 거의 동일하다
        또한 Money의 두 하위 클래스가 하는일이 뚜렷하지 않음 따라서 두 하위 클래스를 제거하기 위해
        하위 클래스의 직접적인 참조를 줄여야함 따라서 Money에서 Dollar와 Franc을 팩토리 메서드를 상ㅇ해서 반환하도록
        수정한다

     */

    /*
        해당 테스트에서 직접적으로 Dollar를 참조하지 않고 Money의 팩토리 메서드를 통한 객체를 참조하도록 수정
     */
    @DisplayName("3. 테스트 명확화")
    @Test
    void testMultiplication_수정전(){
        test6.Dollar five = new test6.Dollar(5);
        assertEquals(new test6.Dollar(10), five.times(2));
        assertEquals(new test6.Dollar(15), five.times(3));
    }

    @DisplayName("7. Dollar 참조 제거 및 Money 팩토리 메서드 사용하도록 변경")
    @Test
    void testMultiplication_수정후(){
        Money five = Money.dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @DisplayName("4. Franc 곱셈을 구현")
    @Test
    void testFrancMultiplication_수정전(){
        test6.Franc five = new test6.Franc(5);
        assertEquals(new test6.Franc(10), five.times(2));
        assertEquals(new test6.Franc(15), five.times(3));
    }

    @DisplayName("7. 팩토리 메서드를 사용해 객체를 생성하도록 수정")
    @Test
    void testFrancMultiplication_수정후(){
        Franc five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    // 이 테스트에서도 팩토리 메서드를 사용하도록 수정
    @DisplayName("6. 같은 클래스 끼리만 비교되도록 수정")
    @Test
    void testEquality_수정전(){
        assertTrue(new test6.Dollar(5).equals(new test6.Dollar(5)));
        assertFalse(new test6.Dollar(5).equals(new test6.Dollar(6)));
        assertTrue(new test6.Franc(5).equals(new test6.Franc(5)));
        assertFalse(new test6.Franc(5).equals(new test6.Franc(6)));
        assertFalse(new test6.Franc(5).equals(new test6.Dollar(5)));

    }

    @DisplayName("7. 팩토리 메서드를 사용해 객체를 생성하도록 수정")
    @Test
    void testEquality_수정후(){
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }
}
