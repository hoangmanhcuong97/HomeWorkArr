import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        //khai bao bien va nhap kich thuoc mang
        Scanner sc = new Scanner(System.in);

        int array[];
        int size;
        do {
            System.out.print("Enter a size:");
            size = sc.nextInt();
            if(size > 20){
                System.out.println("Size does not exceed 20");
            }
        }while (size > 20);

        //them phan tu vao mang
        array = new int[size];
        int i = 0;
        while (i< array.length){
            System.out.println("Enter element "+ (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }

        // in ra mang da nhap nhap
        System.out.printf( "%-20s%s","Element in array: ","");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        //dao cac phan tu cua mang
        for (int j = 0; j < array.length/2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        //In ra mang da dao
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
