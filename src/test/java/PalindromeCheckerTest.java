import org.junit.*;
import static org.junit.Assert.*;

public class PalindromeCheckerTest {

  @Test
  public void runPalindromeChecker_returnTrueFor1DigitNumbers_boolean() {
    PalindromeChecker testPalindromeChecker = new PalindromeChecker();
    assertEquals(true, testPalindromeChecker.runPalindromeChecker(1));
  }

}
