public class SquareNumbers {
    public static void main (String[] args) {
        int[] squareNumbers = new int[15];
        int length = 0;

        for (int i = 0; i < 10; i++) {
            int sqNum = (i+1) * (i+1);
            squareNumbers[i] = sqNum;
            length++;
            System.out.println(squareNumbers[i]);
        }

        System.out.println("The array has a capacity of " + squareNumbers.length);
        System.out.println("The array has a length of " + length);

    }
}
