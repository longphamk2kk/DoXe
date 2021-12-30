package BaiDoXe;
import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> xeOto = new ArrayList<>();
        System.out.println("Nhập thông tin cho cac xe");
        while (true) {
            System.out.print("Chọn loại xe (1 - Xe Con, 2 - Xe Tai): ");
            int choose = scanner.nextInt();
             
            if (choose == 1) {
                soXeOto.add(new XeCon());
            } else if (choose == 2) {
                soXeOto.add(new XeTai());
            }
             
            xeOto.get(xeOto.size() - 1).nhap();
            xeOto.get(xeOto.size() - 1).tinhTienGuiXe();
        }
        


        System.out.println("Thông tin của các xe trong bai gui: ");
        for (int i = 0;i < xeOto.size(); i++) {
            System.out.println(xeOto.get(i).toString());
        }
    }
    
}
