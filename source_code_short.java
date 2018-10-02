import java.util.Scanner;

public class source_code_short {

	public static void main(String[] args) {
		// Deklarasi Variabel
		short K,L,M;
		// Inisialisasi Variabel
		K = 3500;
		L = 6000;
		// Melakukan operasi menggunakan variabel
		M = (short)(K+L);
		// Menampilkan nilai variabel
		System.out.println(M);
		// Menampilkan input melalui keyboard
		Scanner keyboard = new Scanner(System.in);
		System.out.println("memasukkan nilai 1");
		short N = keyboard.nextShort();
		System.out.println("memasukkan nilai 2");
		short O = keyboard.nextShort();
		// Penjumlahan
		short P = (short)(N+O);
		System.out.println("hasil" + P);
		

	}

}
