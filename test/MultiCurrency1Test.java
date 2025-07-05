import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test1.Dollar;

import static org.junit.jupiter.api.Assertions.*;

public class MultiCurrency1Test {
    /*
        1.
        서로 다른 두 금액을 더해서 주어진 환율에 맞게 변한 금액을 얻을 수 있어야함
        어떤 금액을 어떤 수로 곱한 금액을 결과로 얻을 수 있어야함

        - $5 + 10CHF = $10 (환율이 2:1)
        - $5 * 2 = $10
        우선 테스트 부터 작성
        $5 * 2 = $10 을 해결하는 테스트 코드
     */
    @DisplayName("1. $5 + 2 = $10")
    @Test
    void testMultiplication(){
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
