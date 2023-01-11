/// arrayde kullanabileceğimiz doğrusal aarama

import java.util.Arrays;
class BS
{
  public static void main(String args[])
  {
    char characters[] = { 'a', 'b', 'c', 'd', 'e' };
 
    System.out.println(Arrays.binarySearch(characters, 'a'));
    System.out.println(Arrays.binarySearch(characters, 'p'));
  }
}