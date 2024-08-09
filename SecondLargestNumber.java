public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 4, 45, 99, 100, 200};
        int secondLargest = findSecondLargest(numbers);
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest number is: " + secondLargest);
        } else {
            System.out.println("Array does not contain enough distinct elements.");
        }
    }
    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return Integer.MIN_VALUE; 
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}
