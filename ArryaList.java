package testing;
/*
 * Author : giandirageem
 * Date : 2 Juli 2019
 * 
 * 		Improvisasi/peningkatan kemampuan dalam array menggunakan ArrayList
 */

import java.util.*;

class Kelas_Tkja {
	//deklarasi private member
	private String nama_siswa;
	private int nomor_absen;
	
	//enkapsulasi private member
	//kedalam konstruktor ber-access public
	public Kelas_Tkja(String name, int no) {
		nomor_absen = no;
		nama_siswa = name;
	}
	
	//Kembalikan nilai String nama_siswa
	//kedalam fungsi public
	public String getNamaSiswa() {
		return nama_siswa;
	}
	
	//Kembalikan nilai integer nomor_absen
	//kedalam fungsi public
	public int getNomorAbsen() {
		return nomor_absen;
	}
	
	//Enkapsulasi fungsi getXxx()
	//kedalam fungsi toString
	public String toString() {
		return "Nama Siswa : " + getNamaSiswa() +
				", Nomor Absen : " + getNomorAbsen();
	}
	
}

public class ArryaList {
	
	//cape anjir ngetik sysout terus wkwk
	static void printLine(String p) {
		System.out.println(p);
	}
	
	//sama ini juga
	static void printSpaceLine() {
		System.out.println();
	}
	
	public static void main(String args[]) {
	//Membuat object ArrayList.
	List<Kelas_Tkja> siswa_tkja = new ArrayList();
	
	//Membuat objek dari class Kelas_Tkja.
	//tidak menggunakan anonymous object
	//karena belum tau cara remove dari objek ArrayList
	Kelas_Tkja siswa_15 = new Kelas_Tkja("Giandira Gumelar Maulana", 15);
	Kelas_Tkja siswa_35 = new Kelas_Tkja("Wayu Rodriguez", 35);
	
	//Menambahkan objek Kelas_Tkja ke dalam ArrayList
	siswa_tkja.add(siswa_15);
	siswa_tkja.add(siswa_35);
	
	//Menampilkan size ArrayList
	printLine("Ukuran array di dalam Kelas TKJA : " + siswa_tkja.size());
	printSpaceLine();
	
	//Menampilkan data awal dari objek ArrayList
	printLine("---##---");
	printLine("Daftar siswa awal dari kelas TKJA : ");
	for(Kelas_Tkja k : siswa_tkja) {
		printLine("\t" + k);
	}
	
	//Menghapus salah satu data dari Objek ArrayList
	siswa_tkja.remove(siswa_15);
	
	//Menampilkan data akhir dari objek Arraylist
	printLine("Daftar siswa akhir dari kelas TKJA : ");
	for(Kelas_Tkja k : siswa_tkja)
		printLine("\t" + k);
	
	printLine("---##---");
	
	}
}
