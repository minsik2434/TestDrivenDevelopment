import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test6.Dollar;
import test6.Franc;


import static org.junit.jupiter.api.Assertions.*;

public class MultiCurrency6Test {

    /*
        - $5 + 10 CHF = $10
        - Money의 반올림
        - equals()
        - Equal null
        - Equal object
        - Dollar/Franc 중복
        - 공용 times


        Franc와 Dollar는 서로 다르기 때문에 Dollar와 Franc을 비교했을 비교되면 안됨
        - Franc와 Dollar 비교
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
     */
    @DisplayName("4. Franc 곱셈을 구현")
    @Test
    void testFrancMultiplication(){
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }


    /*
        Franc 와 Dollar는 서로 다른 개념이므로 비교되서는 안됨
        equals() 의 비교에서 같은 클래스끼리만 비교되도록 수정
     */
    @DisplayName("5. Franc equals() 비교 추가")
    @Test
    void testEquality_수정전(){
        assertTrue(new test5.Dollar(5).equals(new test5.Dollar(5)));
        assertFalse(new test5.Dollar(5).equals(new test5.Dollar(6)));
        assertTrue(new test5.Franc(5).equals(new test5.Franc(5)));
        assertFalse(new test5.Franc(5).equals(new test5.Franc(6)));
    }

    @DisplayName("6. 같은 클래스 끼리만 비교되도록 수정")
    @Test
    void testEquality_수정후(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));
        assertFalse(new Franc(5).equals(new Dollar(5)));

    }
}
