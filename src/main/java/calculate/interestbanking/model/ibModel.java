package calculate.interestbanking.model;

import java.util.Scanner;

public class ibModel {

    double soTienDauTu;
    float kiHanDauTu;
    double laiSuatDauTu;
    int chuKiLaiKep;

    // double tongSoThuDuoc;
    // double laiSuatThuDuoc;

    public ibModel(double soTienDauTu, float kiHanDauTu, double laiSuatDauTu, int chuKiLaiKep) {
        this.soTienDauTu = soTienDauTu;
        this.kiHanDauTu = kiHanDauTu;
        this.laiSuatDauTu = laiSuatDauTu;
        this.chuKiLaiKep = chuKiLaiKep;
    }

    public ibModel() {
    }

    public double getSoTienDauTu() {
        return soTienDauTu;
    }

    public void setSoTienDauTu(double soTienDauTu) {
        this.soTienDauTu = soTienDauTu;
    }

    public float getKiHanDauTu() {
        return kiHanDauTu;
    }

    public void setKiHanDauTu(float kiHanDauTu) {
        this.kiHanDauTu = kiHanDauTu;
    }

    public double getLaiSuatDauTu() {
        return laiSuatDauTu;
    }

    public void setLaiSuatDauTu(double laiSuatDauTu) {
        this.laiSuatDauTu = laiSuatDauTu;
    }

    public int getChuKiLaiKep() {
        return chuKiLaiKep;
    }

    public void setChuKiLaiKep(int chuKiLaiKep) {
        this.chuKiLaiKep = chuKiLaiKep;
    }

    @Override
    public String toString() {
        return "ibModel [soTienDauTu=" + soTienDauTu + ", kiHanDauTu=" + kiHanDauTu + ", laiSuatDauTu=" + laiSuatDauTu
                + ", chuKiLaiKep=" + chuKiLaiKep + "]";
    }


   public long laiKiHan( long soTienDauTu, float kiHanDauTu, float laiSuatDauTu)
   {
    long laiSuatDuThu = (long) (soTienDauTu * (laiSuatDauTu/100) * (kiHanDauTu )/12);
    return laiSuatDuThu;
   }

    public long laiKepKiHan(long soTienDauTu, float kiHanDauTu, float laiSuatDauTu, int chuKiLaiKep) {
        long tongSoThuDuoc = (long) (soTienDauTu
                * Math.pow(1 + ((laiSuatDauTu / 100) / chuKiLaiKep), chuKiLaiKep * (kiHanDauTu/12)));
        return tongSoThuDuoc - soTienDauTu;
    }
  
}

