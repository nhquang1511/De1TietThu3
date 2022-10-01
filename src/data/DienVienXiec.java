package data;

public class DienVienXiec extends Nguoi implements IBietLamXiec {
	private int namBatDauDien;
	private double thuNhapTrungBinhMotNam;
	private TroXiec troXiec;
	public DienVienXiec(String hoTen, String phai,int namBatDauDien,
			double thuNhapTrungBinhMotNam,TroXiec troXiec) {
		super(hoTen, phai);
		// TODO Auto-generated constructor stub
		this.namBatDauDien=namBatDauDien;
		this.thuNhapTrungBinhMotNam=thuNhapTrungBinhMotNam;
		this.troXiec=troXiec;
	}

	@Override
	public void KhaNangLamXiec() {
		// TODO Auto-generated method stub
		System.out.println("lam viec lien tuc");
	}

	@Override
	public void inThongTin() {
		// TODO Auto-generated method stub
		super.inThongTin();
		System.out.println("nam bat dau dien: "+ namBatDauDien);
		System.out.println("tro xiec: " + troXiec);
		System.out.println("thu nhap trung binh mot nam: "+ thuNhapTrungBinhMotNam);
		
	}

	@Override
	public void KhaNangHat() {
		// TODO Auto-generated method stub
		super.KhaNangHat();
		System.out.println("hat ca co");
	}

	@Override
	public void TaiNangBamSinh() {
		// TODO Auto-generated method stub
		System.out.println("biet mua deo tu nho");
	}
	
}
