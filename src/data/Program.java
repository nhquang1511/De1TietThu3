package data;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaSi casi1 = new CaSi("Nguyen Van A","nam",DongNhac.Rock,2000,120000000);
		DienVienXiec dienvienxiec1 = new DienVienXiec("Nguyen Van B","nam",2001,100000000,TroXiec.XiecDuDay);
		casi1.inThongTin();
		dienvienxiec1.inThongTin();
	}

}
