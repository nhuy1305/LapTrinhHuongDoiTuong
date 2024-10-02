package NhuY23718321;

import java.time.LocalDate;

class HangThucPham extends HangHoa {
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	private String nhaCungCap;

	public HangThucPham(String maHang, String tenHang, int soLuongTon, double donGia, LocalDate ngaySanXuat,
			LocalDate ngayHetHan, String nhaCungCap) {
		super(maHang, tenHang, soLuongTon, donGia);
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
		this.nhaCungCap = nhaCungCap;
	}

	@Override
	public double tinhVAT() {
		return this.donGia * 0.05;
	}

	@Override
	public String danhGiaBanBuon() {
		if (soLuongTon > 0 && ngayHetHan.isBefore(LocalDate.now())) {
			return "Khó bán";
		}
		return "Không đánh giá";
	}

	@Override
	public String toString() {
		return "HangThucPham{" + "maHang='" + maHang + '\'' + ", tenHang='" + tenHang + '\'' + ", soLuongTon="
				+ soLuongTon + ", donGia=" + donGia + ", ngaySanXuat=" + ngaySanXuat + ", ngayHetHan=" + ngayHetHan
				+ ", nhaCungCap='" + nhaCungCap + '\'' + '}';
	}

}
