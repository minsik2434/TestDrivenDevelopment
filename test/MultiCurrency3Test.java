import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test3.Dollar;

import static org.junit.jupiter.api.Assertions.*;

public class MultiCurrency3Test {
    /*
        값 객체는 equals() 를 구현해 같은 값 객체와 비교할 수 있어야한다
        만약 Dollar를 해시 테이블 키로 사용하려면 equals()를 구현할때 hashCode() 를 구현해야한다

        - $5 + 10 CHF = $10
        - amount를 private로 바꾸기
        - Money의 반올림
        - equals()
     */

    /*
        equals()의 구현으로 amount 변수를 private로 바꾸었으므로 테스트를 수정하고
        테스트를 더욱 명확하게 수정한다
        수정 전 테스트는 Dollar의 times() 메서드가 새로운 객체를 반환하는지 명확하지 않음
     */
    @DisplayName("2. 별칭 문제 해결")
    @Test
    void testMultiplication_수정전(){
        test2.Dollar five = new test2.Dollar(5);
        test2.Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }

    /*
        Dollar 의 amount를 상수와 비교하는것이 아니라
        이제 Dollar 와 Dollar를 비교하도록 수정한다 => Dollar의 times() 가 새 객체를 반환한다는 테스트
        또한 임시변수인 product는 필요 없으므로 삭제
     */
    @DisplayName("3. 테스트 명확화")
    @Test
    void testMultiplication_수정후(){
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }


    /*
        Dollar 객체를 수정해 동일성 비교인 equals() 메서드를 구현
        동일성 비교를 통해 Dollar와 Dollar를 직접 비교 가능하므로 amount 변수를 private 로 변경 가능
        하지만 null 객체나 다른 객체들과 비교한다면 오류 발생


        - $5 + 10 CHF = $10
        - amount를 private로 벼녁ㅇ
        - Money의 반올림
        - equals()
        - Equal null
        - Equal object
     */
    @DisplayName("3. equals()")
    @Test
    void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
