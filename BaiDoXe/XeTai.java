package BaiDoXe;

public class XeTai extends XeOto {
    private int soThangGuiXe, trongLuongXe;
     public XeTai(){
         super();
     }

     public XeTai(int soThangGuiXe, int trongLuongXe) {
         super();
         this.soThangGuiXe = soThangGuiXe;
         this.trongLuongXe = trongLuongXe;
     }

     public int getSoThangGuiXe(){
         return soThangGuiXe;
     }

     public void setSoThangGuiXe(int soThangGuiXe){
         this.soThangGuiXe = soThangGuiXe;
     }

     public int getTrongLuongXe(){
         return trongLuongXe;
     }

     public void setTrongLuongXe(int trongLuongXe){
         this.trongLuongXe = trongLuongXe;
     }

     public void nhap() {
        super.nhap();
        System.out.print("Nhập số thang gui xe: ");
        soThangGuiXe = scanner.nextInt();
        System.out.print("Nhập trong luong xe: ");
        trongLuongXe = scanner.nextInt();
    }

    public int tinhTienGuiXe() {
        this.tien =  this.soThangGuiXe * this.trongLuongXe * 700000;
        return this.tien;
    }

    public String toString() {
        return super.toString() + "so thang gui xe: " + this.soThangGuiXe + 
            ", tien gui xe : " + this.tien;
    }
}
