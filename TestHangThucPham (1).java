package BaitapLTHDT2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class TestHangThucPham {
	
	public static HangThucPham nhapHTP() throws Exception {
		Scanner sc = new Scanner(System.in);
		HangThucPham tp1 = new HangThucPham("1111", "May tinh", (double)100,LocalDate.now(), LocalDate.now());
		
		return tp1;
	}
	
	public static void main(String[] args) {
		try {
			HangThucPham tp1, tp2, tp3;
			/*HangThucPham tp1 = new HangThucPham("1111", "May tinh", (double)100, );
			String nsx = "01/08/2022";
			String nhh = "30/08/2022";
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
			LocalDateTime dateNSX = LocalDateTime.parse(nsx, formatter);
			LocalDateTime dateNHH = LocalDateTime.parse(nhh, formatter);
	*/
			tp1 = nhapHTP();
			tp2 = nhapHTP();
			tp3 = nhapHTP();
			System.out.println(tp1);
		}catch (Exception e) {
			System.err.print(e.getMessage());
		}
		
		
		
	}
}
