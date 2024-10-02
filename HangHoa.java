package NhuY23718321;

abstract class HangHoa {
	protected String maHang;
	protected String tenHang;
	protected int soLuongTon;
	protected double donGia;


	public HangHoa(String maHang, String tenHang, int soLuongTon, double donGia) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.soLuongTon = soLuongTon;
		this.donGia = donGia;
	}

	public abstract double tinhVAT();

	public abstract String danhGiaBanBuon();
}
