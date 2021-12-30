package BaiDoXe;

public class XeCon extends XeOto {
    private int soThangGuiXe;
     public XeCon(){
         super();
     }

     public XeCon(int soThangGuiXe) {
         super();
         this.soThangGuiXe = soThangGuiXe;
     }

     public int getSoThangGuiXe(){
         return soThangGuiXe;
     }

     public void setSoThangGuiXe(int soThangGuiXe){
         this.soThangGuiXe = soThangGuiXe;
     }

     public void nhap() {
        super.nhap();
        System.out.print("Nhập số thang gui xe: ");
        soThangGuiXe = scanner.nextInt();
    }

    public int tinhTienGuiXe() {
        this.tien =  this.soThangGuiXe * 1000000;
        return this.tien;
    }

    public String toString() {
        return super.toString() + "so thang gui xe: " + this.soThangGuiXe + 
            ", tien gui xe : " + this.tien;
    }
}
