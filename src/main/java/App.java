public class App {
  public static void main(String[] args) {
    Integer largestPalindrome = 0;
    Integer myI = 0;
    Integer myJ = 0;

    PalindromeChecker myPalindromeChecker = new PalindromeChecker();

    System.out.println("I'm palindrome finding application!");
    for (int i = 100; i < 1000; i++) {
      for (int j = 100; j < 1000; j++) {
        if (myPalindromeChecker.runPalindromeChecker(i*j) && (i*j > largestPalindrome)) {
          largestPalindrome = i * j;
          myI = i;
          myJ = j;
        }
      }
    }
    System.out.println("The largest palindrome that is the product of two 3 digit numbers is " + largestPalindrome + " which is the product of " + myI + " and " + myJ + ".");
  }
}
