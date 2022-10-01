package data;

public class CaSi extends Nguoi implements IBietMua {

	private DongNhac dongNhac;
	private int namBatDauHat;
	private double thuNhapTrungBinhMotNam;
	
	public CaSi(String hoTen, String phai,DongNhac dongNhac
			,int namBatDauHat,double thuNhapTrungBinhMotNam) {
		super(hoTen, phai);
		// TODO Auto-generated constructor stub
		this.dongNhac=dongNhac;
		this.namBatDauHat=namBatDauHat;
		this.thuNhapTrungBinhMotNam=thuNhapTrungBinhMotNam;
		
	}

	@Override
	public void KhaNangMua() {
		// TODO Auto-generated method stub
		System.out.println("mua BaLe");
	}

	@Override
	public void TaiNangBamSinh() {
		// TODO Auto-generated method stub
		System.out.println("thong minh bam sinh");
	}

	@Override
	public void inThongTin() {
		// TODO Auto-generated method stub
		super.inThongTin();
		System.out.println("dong nhac: " + dongNhac);
		System.out.println("nam bat dau hat: "+namBatDauHat);
		System.out.println("thu nhap chung binh mot nam: "+ thuNhapTrungBinhMotNam);
		
	}

	@Override
	public void KhaNangHat() {
		// TODO Auto-generated method stub
		super.KhaNangHat();
		System.out.println("hat hay nhung bai hit");
	}
	

}
