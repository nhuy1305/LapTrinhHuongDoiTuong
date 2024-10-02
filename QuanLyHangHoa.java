package NhuY23718321;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

class QuanLyHangHoa {
	private ArrayList<HangHoa> danhSachHangHoa;

	public QuanLyHangHoa() {
		this.danhSachHangHoa = new ArrayList<>();
	}


	public boolean themHangHoa(HangHoa hangHoa) {
		for (HangHoa hh : danhSachHangHoa) {
			if (hh.maHang.equals(hangHoa.maHang)) {
				return false; 
			}
		}
		danhSachHangHoa.add(hangHoa);
		return true;
	}

	public HangThucPham nhapHangThucPham() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập mã hàng: ");
		String maHang = scanner.nextLine();

		System.out.print("Nhập tên hàng: ");
		String tenHang = scanner.nextLine();

		System.out.print("Nhập số lượng tồn: ");
		int soLuongTon = scanner.nextInt();

		System.out.print("Nhập đơn giá: ");
		double donGia = scanner.nextDouble();

		System.out.print("Nhập ngày sản xuất (yyyy-mm-dd): ");
		LocalDate ngaySanXuat = LocalDate.parse(scanner.next());

		System.out.print("Nhập ngày hết hạn (yyyy-mm-dd): ");
		LocalDate ngayHetHan = LocalDate.parse(scanner.next());

		scanner.nextLine();
		System.out.print("Nhập nhà cung cấp: ");
		String nhaCungCap = scanner.nextLine();

		return new HangThucPham(maHang, tenHang, soLuongTon, donGia, ngaySanXuat, ngayHetHan, nhaCungCap);
	}

	public HangDienMay nhapHangDienMay() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập mã hàng: ");
		String maHang = scanner.nextLine();

		System.out.print("Nhập tên hàng: ");
		String tenHang = scanner.nextLine();

		System.out.print("Nhập số lượng tồn: ");
		int soLuongTon = scanner.nextInt();

		System.out.print("Nhập đơn giá: ");
		double donGia = scanner.nextDouble();

		System.out.print("Nhập thời gian bảo hành (tháng): ");
		int thoiGianBaoHanh = scanner.nextInt();

		System.out.print("Nhập công suất (KW): ");
		double congSuat = scanner.nextDouble();

		return new HangDienMay(maHang, tenHang, soLuongTon, donGia, thoiGianBaoHanh, congSuat);
	}

	public HangSanhSu nhapHangSanhSu() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập mã hàng: ");
		String maHang = scanner.nextLine();

		System.out.print("Nhập tên hàng: ");
		String tenHang = scanner.nextLine();

		System.out.print("Nhập số lượng tồn: ");
		int soLuongTon = scanner.nextInt();

		System.out.print("Nhập đơn giá: ");
		double donGia = scanner.nextDouble();

		scanner.nextLine();
		System.out.print("Nhập nhà sản xuất: ");
		String nhaSanXuat = scanner.nextLine();

		System.out.print("Nhập ngày nhập kho (yyyy-mm-dd): ");
		LocalDate ngayNhapKho = LocalDate.parse(scanner.next());

		return new HangSanhSu(maHang, tenHang, soLuongTon, donGia, nhaSanXuat, ngayNhapKho);
	}

	public void inDanhSachHangHoa() {
		for (HangHoa hh : danhSachHangHoa) {
			System.out.println(hh.toString());
		}
	}
}
