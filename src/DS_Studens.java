import java.util.Scanner;

public class DS_Studens {
    public static void main(String[] args) {
        String students[] = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten sinh vien");
        String name = sc.nextLine();

        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(name)){
                System.out.println("Ten "+ name +" nam o vi tri "+ i +" trong danh sach");
                check =true;
                break;
            }
        }
        if (!check) {
            System.out.println("Not found " + name + " in the list.");
        }
    }
}
