import java.util.Scanner;

public class source_code_string {

	public static void main(String[] args) {
		// Deklarasi Variabel
		String nim;
		String jurusan;
		// Inisialisasi Value
		nim = "D0217012";
		jurusan = "Teknik_Informtika";
		// Operasi Variabel
		String NamaDepan = "Rosalina";
		String NamaBelakang = "Konde";
		// Menampilkan Hasil
		System.out.println("....BIODATA MAHASISWA....");
		System.out.println("Nama : " + (NamaDepan +' ' + NamaBelakang));
		System.out.println("Nim : "+ nim);
		System.out.println("Jurusan : "+ jurusan);
		// Mengambil Input dari Keyboard
		String fakultas;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("masukkan fakultas : ");
		fakultas = keyboard.next();
		System.out.println("fakultas : " + fakultas);
		
		
		

	}

}
