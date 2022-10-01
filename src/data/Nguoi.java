package data;

public abstract class Nguoi implements IBietHat {
	private String hoTen;
	private String phai;
	public Nguoi(String hoTen, String phai) {
		this.hoTen = hoTen;
		this.phai = phai;
	}
	public void inThongTin() {
		System.out.println("Ho ten: " + hoTen);
		System.out.println("gioi tinh: " + phai);
	}
	@Override
	public void KhaNangHat() {
		// TODO Auto-generated method stub
		System.out.println("co kha nang hat");
	}
	public abstract void TaiNangBamSinh();
	
}	
