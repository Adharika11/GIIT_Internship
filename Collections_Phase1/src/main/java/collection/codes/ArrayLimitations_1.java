package collection.codes;

public class ArrayLimitations_1 {
    public static void main(String[] args) {
        // Initial array with a fixed size of 5
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        for(int i=0;i<numbers.length;i++){
            System.out.println("Original array: " +(numbers[i]));}

        // Need to add another element, but the array is already full
        int newElement = 6;

        // Create a new array with a larger size
        int[] newNumbers = new int[numbers.length + 1];

        // Copy data from the old array to the new array
        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i];
        }

        newNumbers[numbers.length] = newElement;

        // Replace the old array with the new array
        numbers = newNumbers;

        for(int i=0;i<numbers.length;i++){
            System.out.println("Array after adding new element: " +(numbers[i]));
        }}
}

