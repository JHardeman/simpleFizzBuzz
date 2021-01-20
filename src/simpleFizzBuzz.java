

public class simpleFizzBuzz {
    // Simple FizzBuzz exercise where we will print the numbers 1 to 100
    // Each time a multiple of 3 appears we will print "Fizz"
    // Each multiple of 5 will show "Buzz"
    // Each multiple of 3 AND 5 will print "FizzBuzz"

    public static void main(String[] args) {
        // Here we will call "printFizzBuzz' and assign a value for 'n' being 100
        // You can change this value at any time
        printFizzBuzz(100);

    }
    public static void printFizzBuzz(int n) {
        // Start of our loop, creating a integer 'i' assigning a value of 1 and incrementing through the loop
        // by a value of 1 until we reach the value of 'n'
        for (int i = 1; i <= n; i++) {

            // First we must determine if the numbers are divisible by 3 AND 5, otherwise we would see multiple
            // print outs of "Fizz Buzz FizzBuzz"
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            }
            // Here we will check if the number is divisible by 3 and print 'Fizz"
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // If divisible of 5 print 'Buzz'
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Else we will list the number
            else {
                System.out.println(i);
            }
        }
    }
}

