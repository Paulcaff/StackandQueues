import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalanceTest {

    @Test
    void isBalanced() {
        String s1 = "(a + b *(c/(d-e)))+(d/e)";
        boolean actual = Balance.isBalanced(s1);
        boolean expected = true;
        assertEquals(actual,expected);

        String s2 = "a + b *c/(d-e)))+(d/e)";
        boolean actual2 = Balance.isBalanced(s2);
        boolean expected2 = false;
        assertEquals(actual2,expected2);

        String s3 = "(<{[]}>)";
        boolean actual3 = Balance.isBalanced(s3);
        boolean expected3 = true;
        assertEquals(actual3,expected3);

        String s4 = "<{]>)";
        boolean actual4 = Balance.isBalanced(s4);
        boolean expected4 = false;
        assertEquals(actual4,expected4);

        String s5 = "";
        boolean actual5 = Balance.isBalanced(s5);
        boolean expected5 = true;
        assertEquals(actual5,expected5);
   }


}
