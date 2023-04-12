package LAB4_BAI3;

import java.util.Scanner;

public class SanPham {
    public String tenSp;
    public double donGia;
    public double giaGiam;
    
    public SanPham(String tenSp, double donGia, double giaGiam){
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giaGiam = giaGiam;
    }
    
    public SanPham(String tenSp, double donGia){
        this(tenSp, donGia, 0);
    }

    @Override
    public String toString() {
        return "tenSp=" + tenSp + ", donGia=" + donGia + ", giaGiam=" + giaGiam + ",    Thue nhap khau: " + ThueNhapKhau();
    }
    
    private double ThueNhapKhau(){
        return this.donGia*0.1;
    }
    
    public double getThueNhapKhau(){
        return ThueNhapKhau();
    }
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap Ten san pham: ");
        tenSp = sc.nextLine();
        
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
        
        System.out.print("Nhap gia giam: ");
        giaGiam = sc.nextDouble();
    }
    
    public void Xuat(){
        System.out.println("Xuat: " +toString());
    }
 public class main {
    public static void main(String[] args) {
        String tenSp = null;
        Scanner sc = new Scanner(System.in);
        SanPham sp1 = new SanPham(tenSp, 0);
        SanPham sp2 = new SanPham(tenSp, 0, 0);
        
        System.out.println("SP1");
        sp1.Nhap();
        System.out.println("SP2");
        sp2.Nhap();
        
        sp1.Xuat();
        sp2.Xuat();
        
    }
}   
}
