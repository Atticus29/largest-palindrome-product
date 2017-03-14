import org.junit.*;
import static org.junit.Assert.*;

public class PalindromeCheckerTest {

  // @Test
  // public void reverseInt_works_int(){
  //   PalindromeChecker testPalindromeChecker = new PalindromeChecker();
  //   assertEquals(12, testPalindromeChecker.reverseInt(21));
  // }

  @Test
  public void runPalindromeChecker_returnTrueFor1DigitNumbers_boolean() {
    PalindromeChecker testPalindromeChecker = new PalindromeChecker();
    assertEquals(true, testPalindromeChecker.runPalindromeChecker(1));
  }

  @Test
  public void runPalindromeChecker_returnTrueFor2DigitPalindromes_boolean(){
    PalindromeChecker testPalindromeChecker = new PalindromeChecker();
    assertEquals(true, testPalindromeChecker.runPalindromeChecker(22));
    assertEquals(false, testPalindromeChecker.runPalindromeChecker(34));
  }

  @Test
  public void runPalindromeChecker_returnFalseFor2DigitNonPalindromes_boolean(){
    PalindromeChecker testPalindromeChecker = new PalindromeChecker();
    assertEquals(false, testPalindromeChecker.runPalindromeChecker(34));
  }

  @Test
  public void runPalindromeChecker_returnTrueFor6DigitPalindromes_boolean(){
    PalindromeChecker testPalindromeChecker = new PalindromeChecker();
    assertEquals(true, testPalindromeChecker.runPalindromeChecker(990099));
  }

  

}
