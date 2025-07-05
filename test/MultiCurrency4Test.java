import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test4.Franc;
import test4.Dollar;

import static org.junit.jupiter.api.Assertions.*;

public class MultiCurrency4Test {

    /*
        - $5 + 10 CHF = $10
        - Money의 반올림
        - equals()
        - Equal null
        - Equal object

        첫번째를 구현하기 전에 작은 단계로 Dollar 가 아닌 다른 화폐의 곱을 구현
        - 5CHF * 2 = 10CHF
     */

    @DisplayName("3. 테스트 명확화")
    @Test
    void testMultiplication(){
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    /*
        Franc 의 곱셈을 구현
        Frnac 은 Dollar와 중복된다

        - Dollar/Franc 중복
        - 공용 equals
        - 공용 times
     */
    @DisplayName("4. Franc 곱셈을 구현")
    @Test
    void testFrancMultiplication(){
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }

    @DisplayName("3. equals()")
    @Test
    void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
