package testing;
import java.util.*;

class TekajeA<O, T> {
	private O nama_siswa;
	private T nomor_absen;
	
	public TekajeA(O nama, T no) {
		nama_siswa = nama;
		nomor_absen = no;
	}
	
	
	public O getNamaSiswa() {
		return nama_siswa;
	}
	
	public T getNomorAbsen() {
		return nomor_absen;
	}
}

public class ListAndSet {
	public static void main(String args[]) {
		TekajeA<String, Integer> siswa_15 = new TekajeA("Giandira Gumelar Maulana", 15);
		TekajeA<String, Integer> siswa_40 = new TekajeA("Wayu Rodriguez", 40);
		//dapat menduplikasi objek tapi hanya satu objek saja (Overwrite)
		TekajeA<String, Integer> siswa_155 = new TekajeA("Giandira Gumelar Maulana", 15);
		List<TekajeA> daftar_nama = new ArrayList<>();
		daftar_nama.add(siswa_15);
		daftar_nama.add(siswa_15);
		daftar_nama.add(siswa_40);
		
		System.out.println("Ukuran array list : " + daftar_nama.size());
		for(TekajeA a : daftar_nama) {
			System.out.println("\t : " + a.getNamaSiswa());
		}
		
		System.out.println();
		Set<TekajeA> $daftar_nama = new HashSet<>();
		$daftar_nama.add(siswa_15);
		$daftar_nama.add(siswa_40);
		$daftar_nama.add(siswa_40);
		
		System.out.println("Ukuran Set (HashSet) : " + $daftar_nama.size());
		for(TekajeA a : $daftar_nama) {
			System.out.println("\t : " + a.getNamaSiswa() + ", " + a.getNomorAbsen());
		}
		
	}
}
