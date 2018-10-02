import java.util.Scanner;

public class source_code_float {

	
	public static void main(String[] args) {
		// Deklarasi Variabel
		float tinggi;
		float lebar;
		// Inisialisasi Variabel
		tinggi = (float) 4.23;
		lebar = (float) 5.10;
		// Mengambil Input dari Keyboard
		float panjang;
		Scanner keyboard= new Scanner(System.in);
		System.out.println("masukkan nilai panjang");
		panjang = keyboard.nextFloat ();
		System.out.println("panjang : " + panjang);
		// Menampilkan Nilai dari Variabel
		System.out.println("mencari nilai luas");
		System.out.println("panjang : " + panjang);
		System.out.println("tinggi : " + tinggi);
		System.out.println("lebar : " + lebar);
	
	}

}
