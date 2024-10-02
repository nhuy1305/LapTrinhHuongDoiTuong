package NhuY23718321;


import java.util.Scanner;


public class ListHangHoa {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			QuanLyHangHoa quanLy = new QuanLyHangHoa();

			while (true) {
				System.out.println("1. Thêm hàng thực phẩm");
				System.out.println("2. Thêm hàng điện máy");
				System.out.println("3. Thêm hàng sành sứ");
				System.out.println("4. In danh sách hàng hóa");
				System.out.println("5. Thoát");
					System.out.println("____________________________");
				System.out.print("Chọn chức năng: ");
				int choice = scanner.nextInt();

				switch (choice) {
				case 1:
					HangThucPham thucPham = quanLy.nhapHangThucPham();
					if (quanLy.themHangHoa(thucPham)) {
						System.out.println("Thêm hàng thực phẩm thành công");
					} else {
						System.out.println("Mã hàng đã tồn tại!");
					}
					break;
				case 2:
					HangDienMay dienMay = quanLy.nhapHangDienMay();
					if (quanLy.themHangHoa(dienMay)) {
						System.out.println("Thêm hàng điện máy thành công");
					} else {
						System.out.println("Mã hàng đã tồn tại!");
					}
					break;
				case 3:
					HangSanhSu sanhSu = quanLy.nhapHangSanhSu();
					if (quanLy.themHangHoa(sanhSu)) {
						System.out.println("Thêm hàng sành sứ thành công");
					} else {
						System.out.println("Mã hàng đã tồn tại");
					}
					break;
				case 4:
					quanLy.inDanhSachHangHoa();
					break;
				case 5:
					System.out.println("Thoát");
					System.exit(0);
					break;
				default:
					System.out.println("Lựa chọn không hợp lệ");
				}
			}
		}
	}
}
