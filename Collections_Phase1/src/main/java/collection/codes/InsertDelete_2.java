package collection.codes;

import java.util.Scanner;

public class InsertDelete_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=s.nextInt();
        int arr[]=new int[n+5];
        System.out.println("Enter array elements");
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int current = n;
        System.out.println("Enter the element to be inserted: ");
        int a=s.nextInt();
        System.out.println("Enter the position: ");
        int pos=s.nextInt();
        for(int i=current-1;i>=pos-1;i--){
            arr[i+1]=arr[i];
        }
        arr[pos-1]=a;
        current++;
        System.out.println("Array elements after insertion");
        for (int i=0;i<current;i++){
            System.out.println(arr[i]+"\t");
        }
        System.out.println("Enter the element's position to be deleted: ");
        int del=s.nextInt();

        for(int i=del-1;i<current-1;i++){
            arr[i]=arr[i+1];
        }
        current--;
        System.out.println("Array elements after deletion");
        for (int i=0;i<current;i++){
            System.out.println(arr[i]+"\t");
        }


    }
}
