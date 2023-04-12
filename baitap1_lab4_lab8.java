package LAB4_BAI1;

import java.util.Scanner;

public class SanPham {
    public String tenSp;
    public double donGia;
    public double giaGiam;
    
    public SanPham(){
        
    }
    
    public SanPham(String tenSp, double donGia, double giaGiam){
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giaGiam = giaGiam;
    }

    @Override
    public String toString() {
        return "tenSp=" + tenSp + ", donGia=" + donGia + ", giaGiam=" + giaGiam + ",    Thue nhap khau: " + ThueNhapKhau();
    }
    
    public double ThueNhapKhau(){
        return this.donGia*0.1;
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
    
}
