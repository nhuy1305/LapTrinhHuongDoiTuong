package NhuY23718321;

import java.time.LocalDate;

class HangSanhSu extends HangHoa {
	private String nhaSanXuat;
	private LocalDate ngayNhapKho;

	public HangSanhSu(String maHang, String tenHang, int soLuongTon, double donGia, String nhaSanXuat,
			LocalDate ngayNhapKho) {
		super(maHang, tenHang, soLuongTon, donGia);
		this.nhaSanXuat = nhaSanXuat;
		this.ngayNhapKho = ngayNhapKho;
	}

	@Override
	public double tinhVAT() {
		return this.donGia * 0.10;
	}

	@Override
	public String danhGiaBanBuon() {
		if (soLuongTon > 50 && ngayNhapKho.isBefore(LocalDate.now().minusDays(10))) {
			return "Bán chậm";
		}
		return "Không đánh giá";
	}

	@Override
	public String toString() {
		return "HangSanhSu{" + "maHang='" + maHang + '\'' + ", tenHang='" + tenHang + '\'' + ", soLuongTon="
				+ soLuongTon + ", donGia=" + donGia + ", nhaSanXuat='" + nhaSanXuat + '\'' + ", ngayNhapKho="
				+ ngayNhapKho + '}';
	}

}
