package cau1;
import java.util.Scanner;
public class TamGiac {
	private double a, b, c;
	public TamGiac() {}
	public TamGiac(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void nhap() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập cạnh 1: ");
		a = input.nextDouble();
		System.out.print("Nhập cạnh 2: ");
		b = input.nextDouble();
		System.out.print("Nhập cạnh 3: ");
		c = input.nextDouble();
	}
	public void xuat() {
		System.out.println();
		System.out.println("Độ dài 3 cạnh vừa nhập");
		System.out.println("Cạnh 1: " + a);
		System.out.println("Cạnh 2: " + b);
		System.out.println("Cạnh 3: " + c);
		
	}
	public boolean checkTamGiac() {
		return a + b > c && b + c > a && a + c > b;
	}
}
