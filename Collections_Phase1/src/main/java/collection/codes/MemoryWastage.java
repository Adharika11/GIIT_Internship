package collection.codes;

import java.util.Scanner;

public class MemoryWastage {
    public static void main(String[] args) {
        int arr[]=new int [20];
        System.out.println("Enter array size: ");
        Scanner s=new Scanner(System.in);
        // if size given is more then underflow , if less then memory wastage
        int size=s.nextInt();
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Array elements: ");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]+"\t");
        }
    }
}
