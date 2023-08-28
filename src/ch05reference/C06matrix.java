package ch05reference;

public class C06matrix {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 10, 20, 30 }, { 100, 200, 300 } };
		// 3개의 인스턴스가 각각 생성되고 주소를 품고있는 참조타입이 된다. 
		int [][] b =a;
		System.out.println(a[0][2]);
		System.out.println(b[0][2]);
		
		a[1][1]=2000;
		
		System.out.println(a[1][1]); //2000
		System.out.println(b[1][1]); // 2000 
		
	}
}
