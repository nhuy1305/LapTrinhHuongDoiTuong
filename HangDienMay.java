package NhuY23718321;

class HangDienMay extends HangHoa {
	private int thoiGianBaoHanh;
	private double congSuat;

	public HangDienMay(String maHang, String tenHang, int soLuongTon, double donGia, int thoiGianBaoHanh,
			double congSuat) {
		super(maHang, tenHang, soLuongTon, donGia);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.congSuat = congSuat;
	}

	@Override
	public double tinhVAT() {
		return this.donGia * 0.10;
	}

	@Override
	public String danhGiaBanBuon() {
		if (soLuongTon < 3) {
			return "Bán được";
		}
		return "Không đánh giá";
	}

	@Override
	public String toString() {
		return "HangDienMay{" + "maHang='" + maHang + '\'' + ", tenHang='" + tenHang + '\'' + ", soLuongTon="
				+ soLuongTon + ", donGia=" + donGia + ", thoiGianBaoHanh=" + thoiGianBaoHanh + ", congSuat=" + congSuat
				+ '}';
	}

}
