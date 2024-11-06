package lt.techin.praktinis;

public class NumberReverter {
    public void revert(int number) {
        int reversedNumber = 0;

        // Continue until there are no digits left
        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }

        System.out.println(reversedNumber);
    }
}
