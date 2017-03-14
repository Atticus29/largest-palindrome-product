public class PalindromeChecker {
  public boolean runPalindromeChecker(Integer numberToCheck) {
    if (numberToCheck.equals(reverseInt(numberToCheck))) {
      return true;
    } else {
      return false;
    }
  }

  public Integer reverseInt(Integer input)
  {
    long reversedNum = 0;
    long input_long = input;
    while (input_long != 0)
    {
      reversedNum = reversedNum * 10 + input_long % 10;
      input_long = input_long / 10;
    }
    if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE)
    {
      throw new IllegalArgumentException();
    }
    return (int)reversedNum;
  }
}
