package BaitapLTHDT2;

import java.time.LocalDate;
import java.util.Locale;

import javax.management.loading.PrivateClassLoader;

public class HangThucPham {
	private String maHang = "";
	private String tenHang ="xxx";
	private double donGia;
	private LocalDate ngaySX;
	private LocalDate ngayHH;

;
	
	
	private void setMaHang(String maHang) throws Exception{
		// TODO Auto-generated constructor stub
		if(!maHang.trim().equals(""))
			this.maHang = maHang;
		else
			throw new Exception("Ma hang bi rong!");
	}


	public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySX, LocalDate ngayHH) throws Exception {
		super();
		if(!maHang.equals(""))
			this.maHang = maHang;
		else
			throw new Exception ("Ma hang bi rong!");
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.ngaySX = ngaySX;
		this.ngayHH = ngayHH;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	
	public double getDonGia() {
		return donGia;
	}


	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}


	public LocalDate getNgaySX() {
		return ngaySX;
	}


	public void setNgaySX(LocalDate ngaySX) {
		this.ngaySX = ngaySX;
	}


	public LocalDate getNgayHH() {
		return ngayHH;
	}


	public void setNgayHH(LocalDate ngayHH) {
		this.ngayHH = ngayHH;
	}


	public String getMaHang() {
		return maHang;
	}

	public boolean ktHetHan() {
		Locale dt = new Locale("vi", "vn");
		LocalDate today = LocalDate.now();
		if(ngayHH.isBefore(today))
			return true;
		return false;
		
	}


	@Override
	public String toString() {
		return "HangThucPham [maHang=" + maHang + ", tenHang=" + tenHang + ", donGia=" + donGia + ", ngaySX=" + ngaySX
				+ ", ngayHH=" + ngayHH + ", ktHetHan()=" + ktHetHan() + "]";
	}


	


	
	
	
	
}
