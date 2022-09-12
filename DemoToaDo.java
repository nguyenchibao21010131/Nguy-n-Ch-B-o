package Bai1_2408;

public class DemoToaDo {

	private int x;
	private int y;
	private String ten;
	
	public DemoToaDo(int x, int y, String ten) {
		super();
		this.x = x;
		this.y = y;
		this.ten = ten;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String toString() {
		String s="";
		s+=s.format("%s(%d,%d)",getTen(),getX(),getY());
		return s;
	}
}
