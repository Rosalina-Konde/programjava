import java.util.Scanner;

public class source_code_Long {

	public static void main(String[] args) {
		// Mendeklarasikan Variabel
		long x,y,z;
		// Inisialisasi Variabel
		x=14000000;
		y=23000000;
		// Melakukan operasi variabel
		z=(long)(x+y);
		// Meampilkan nilai dari variabel
		System.out.println(z);
		// Meakukan input melalui keyboard
		Scanner keyboard = new Scanner(System.in);
		System.out.println("memasukkan nilai variabel 1");
		long a = keyboard.nextLong();
		System.out.println("memasukkan nilai variabel 2");
		long b = keyboard.nextLong();
		//Penjumlahan
		long c = (long)(a+b);
		System.out.println("hasil" + c);
		
	
		
	}

}
