import java.util.Scanner;

public class BAI2 {
    public static void main(String[] args) {
        float a;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("nhap diem trung binh");
             a = sc.nextFloat();
        }
            while(a>10);

        if(a>8.5)
            System.out.println("Gioi");
        else
        if(a>7)
            System.out.println("kha");
        else
        if(a>5.5)
            System.out.println("Trung binh");
        else
            System.out.println("yeu");
    }
}
