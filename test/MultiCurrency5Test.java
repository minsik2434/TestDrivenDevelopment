import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test5.Dollar;
import test5.Franc;

import static org.junit.jupiter.api.Assertions.*;

public class MultiCurrency5Test {

    /*
        - $5 + 10 CHF = $10
        - Money의 반올림
        - equals()
        - Equal null
        - Equal object
        - Dollar/Franc 중복
        - 공용 equals
        - 공용 times

        현재 Dollar와 Franc는 equals 와 times 가 중복
        중복을 해결하기 위해 Money라는 상위 클래스를 구현해 Dollar와 Franc 가 이를 상속받도록 수정

        상위 클래스인 Money에 amount 변수를 옮기고 Franc 와 Dollar의 동일 구현인 equals() 를 Money로 옮김
     */

    @DisplayName("3. 테스트 명확화")
    @Test
    void testMultiplication(){
        test4.Dollar five = new test4.Dollar(5);
        assertEquals(new test4.Dollar(10), five.times(2));
        assertEquals(new test4.Dollar(15), five.times(3));
    }

    /*
        Franc 의 곱셈을 구현
     */
    @DisplayName("4. Franc 곱셈을 구현")
    @Test
    void testFrancMultiplication(){
        test4.Franc five = new test4.Franc(5);
        assertEquals(new test4.Franc(10), five.times(2));
        assertEquals(new test4.Franc(15), five.times(3));
    }

    // Franc 또한 equals() 비교 테스트 추가
    @DisplayName("3. equals()")
    @Test
    void testEquality_수정전(){
        assertTrue(new test4.Dollar(5).equals(new test4.Dollar(5)));
        assertFalse(new test4.Dollar(5).equals(new test4.Dollar(6)));
    }


    @DisplayName("5. Franc equals() 비교 추가")
    @Test
    void testEquality_수정후(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));
    }
}
