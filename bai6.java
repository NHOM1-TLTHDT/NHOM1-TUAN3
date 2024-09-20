import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( " nhap so a");
        double a=sc.nextDouble();
        System.out.println(" nhap so b");
        double b=sc.nextDouble();
        System.out.println(" moi nhap phim chuc nang");
        System.out.println( " 1 : cong");
        System.out.println(" 2 : tru");
        System.out.println(" 3 :nhan");
        System.out.println(" 4 :chia");
        int chon=sc.nextInt();
        if (chon==1)
            System.out.println(" ket qua la "+(a+b));
        else
        if(chon==2)
            System.out.println(" ket qua la "+(a-b));
        else if (chon==3)
            System.out.println(" ket qua la "+(a*b));
        else if(chon==4)
            if(b!=0)
                System.out.println(" ket qua la "+(a/b));
            else
                System.out.println(" so b phai khac 0");
        else
            System.out.println(" moi nhap phim hop le");

    }
}
