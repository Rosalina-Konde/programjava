import java.util.Scanner;

public class source_code_byte {

	public static void main(String[] args) {
		// Deklarasi Variabel
		byte O,P,Q;
		// Inisialisasi Variabel
		O=10;
		P=15;
		// Melakukan operasi Variabel
		Q = (byte)(O+P);
		// Menampilkan nilai dari variabel
		System.out.print(Q);
		// Menampilkan variabel melalui keyboard
		System.out.println("memasukkan nilai 2");
		Scanner keyboard = new Scanner(System.in);
		byte R = keyboard.nextByte();
		System.out.println("memasukkan nilai 3");
		byte S = keyboard.nextByte(); 
		// Penjumlahan
		byte T = (byte)(R+S);
		System.out.println("hasil" + T);
	}

}
