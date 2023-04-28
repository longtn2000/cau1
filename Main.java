package cau1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TamGiac tg = new TamGiac();
		tg.nhap();
		tg.xuat();
		if(tg.checkTamGiac())
			System.out.println("Đây là tam giác hợp lệ");
		else System.out.println("Độ dài 3 cạnh không thể tạo thành tam giác");
	}

}
