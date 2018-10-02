import java.util.Scanner;

public class source_code_integer {

	
	public static void main(String[] args) {
		// Deklarasi Variabel
			int x;
			int y;
			int z;
		// Inisialisasi Value
			x = 2;
			y = 4;
			z = 6;
		// Operasi Variabel
			int a = z + 4 / y - 2 * x;
		// Mengambil Nilai Variabel
			System.out.println("***Nilai Variabel***");
			System.out.println("x : " + x);
			System.out.println("y : " + y);
			System.out.println("z : " + z);
			System.out.println("a : " + a);
		// Mengambil Variabel Dari Input Keyboard
			int b;
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Masukkan bilangan untuk menambah variabel: ");
			b = keyboard.nextInt();
			System.out.println("b :" + b);
			
			
			

	}

}
