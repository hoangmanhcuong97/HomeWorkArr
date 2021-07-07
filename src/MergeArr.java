import java.util.Scanner;

public class MergeArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Size1;
        int arr1[];
        int Size2;
        int arr2[];


        do {
            System.out.println("Enter Size Array 1");
            Size1 = sc.nextInt();
            if (Size1 > 20){
                System.out.println("Size does not exceed 20");
            }
        }while (Size1 > 20);

        int i = 0;
        arr1 = new int[Size1];
        while (i < Size1){
            System.out.println("Enter number "+ (i+1) +":");
            arr1[i] = sc.nextInt();
            i++;
        }

        do {
            System.out.println("Enter Size Array 2");
            Size2 = sc.nextInt();
            if (Size2 > 20){
                System.out.println("Size does not exceed 20");
            }
        }while (Size2 > 20);

        int j = 0;
        arr2 = new int[Size2];
        while (j < Size2){
            System.out.println("Enter number "+ (j+1) +":");
            arr2[j] = sc.nextInt();
            j++;
        }
// in ra mang ms nhap
        System.out.printf("\n%-20s%s","Element in array1: ","");
        for (int k = 0; k < arr1.length; k++) {
            System.out.print(arr1[k] + "\t");
        }
        System.out.printf("\n%-20s%s","Element in array2: ","");
        for (int k = 0; k < arr2.length; k++) {
            System.out.print(arr2[k] + "\t");
        }

        //gop mang

        int arr3[] = new int[arr1.length + arr2.length];
        for (int k = 0; k < arr1.length; k++) {
            arr3[k] = arr1[k];

        }
        for (int h = 0; h < arr2.length; h++) {
            arr3[arr1.length+h]= arr2[h];

        }
        System.out.printf("\n%-20s%s","Element in array3: ","");
        for (int c = 0; c < arr3.length; c++) {
            System.out.print(arr3[c] + "\t");
        }

    }
}
