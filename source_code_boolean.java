import java.util.Scanner;

public class source_code_boolean {

	public static void main(String[] args) {
		// Deklarasi Variabel
		int r;
		int s;
		// Inisialisasi Variabel
		r = 6;
		s = 4;
		// Operasi Variabel Logika AND & OR
		boolean test_and = true;
		boolean test_or = true;
		test_and = (r < 6) && (s++ < 4);
		test_or = (r < 6) || (s++ < 4);
		// Menampilkan Variabel & Test
		System.out.println("r : " + r);
		System.out.println("s : " + s);
		System.out.println("logika AND : " + test_and);
		System.out.println("logika OR : " + test_or);
		// Mendapatkan Input dari Keyboard
		int t;
		boolean and = true;
		boolean or = true;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("masukkan nilai variabel");
		System.out.print("t :");
		t = keyboard.nextInt();
		and = (r < 6) && (s++ < 4);
		or = (r < 6) && (s++ < 4);
		System.out.println("t : " + t);
		System.out.println("logika AND : " + and);
		System.out.println("logika OR : " + or);
		

		

	}

}
 