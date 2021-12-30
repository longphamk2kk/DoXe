package BaiDoXe;
import java.util.Scanner;
public class XeOto {
    private String tenChuXe, bienSoXe, loaiXe;
    protected int tien;
    Scanner scanner = new Scanner(System.in);

    public XeOto (){
        super();
    }

    public XeOto(String tenChuXe, String bienSoXe, String loaiXe ){
        super();
        this.tenChuXe = tenChuXe;
        this.bienSoXe = bienSoXe;
        this.loaiXe = loaiXe;
    }

    public String getTenChuXe(){
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe){
        this.tenChuXe = tenChuXe;
    }

    public String getBienSoXe(){
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe){
        this.bienSoXe = bienSoXe;
    }

    public String getLoaiXe(){
        return loaiXe;
    }

    public void setLoaixe(String loaiXe){
        this.loaiXe = loaiXe;
    }

    public void nhap(){
        System.out.print("Nhap ten chu xe");
        tenChuXe = scanner.nextLine();
        System.out.print("Nhap bien so xe");
        bienSoXe = scanner.nextLine();
        System.out.print("Nhap loai xe");
        loaiXe = scanner.nextLine();
    }

    public int tinhTienGuiXe(){
        return 0;
    }

    
    public String toString (){
        return " Ten Chu Xe : " + this.tenChuXe + ", Bien So Xe : " + this.bienSoXe  +  ", Loai Xe : " + this.loaiXe;
    }
}