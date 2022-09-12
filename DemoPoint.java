package Bai2_2408;



public class DemoPoint {
	private String ten;
	private int x;
	private int y;
	private int z;
	
	
	
	public DemoPoint(String ten, int x, int y, int z) {
		super();
		this.ten = ten;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public DemoPoint negate() {
		DemoPoint p = new DemoPoint("~"+ten, -x, -y, -z);
		return p;
	}
	
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
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

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public String toString() {
		String s="";
		s+=s.format("%s(%d,%d,%d)",getTen(),getX(),getY(),getZ());
		return s;
	}
}
