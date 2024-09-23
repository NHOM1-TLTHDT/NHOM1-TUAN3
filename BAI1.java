import java.util.Scanner;

public class BAI1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so ");
        float a=sc.nextFloat();
        if(a>0)
            System.out.println("la so duong");
        else
            if(a<0)
        System.out.println("la so am");
            else
        System.out.println("la so  khong");
    }
}
