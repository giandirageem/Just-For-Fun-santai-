package testing;

/*
 *  Author : giandirageem
 *  Date : 2 Juli 2019
 *  
 *  Deskripsi :
 *  	Belajar membuat code dengan menggunakan salah satu komponen dari Collection API
 *  yaitu List. List memiliki fungsi yang sama yaitu menyimpan data, akan tetapi List memiliki sifat dinamis dalam ukuran
 *  indeks yang berarti tidak terbatas dalam memasukan data. Serta data dapat diduplikasi dan dihapus.
 *   
 */

//impor Interface List dan class ArrayList
import java.util.List;
import java.util.ArrayList;

public class Test {
	public static void main(String args[]) {
		//Membuat objek List dan turunkan pada Arraylist
		
		List data1 = new ArrayList();
		List<String> data2 = new ArrayList<String>();
		
		//memasukan data kedalam List
		data1.add("Giandira");
		data1.add("Gumelar");
		data2.add("Giandira");
		data2.add("Gumelar");
		
		//menampilkan ukuran data dari list
		System.out.println("Ukuran data 1 : " + data1.size());
		for(Object o : data1)
			System.out.println("\t : " + o);
		
		System.out.println("Ukuran data 2 : " + data2.size());
		for(String s : data2)
			System.out.println("\t : " + s);
		
		//membandingkan kedua list
		System.out.println();
		if(data1.equals(data2))
			System.out.println("Isi kedua data berbanding sama..");
		else
			System.out.println("Isi kedua data berbeda..");
		System.out.println();
		
		//menghapus salah satu data
		data1.remove("Giandira");
		data2.remove("Gumelar");
		
		//hasil akhir
		System.out.println("Ukuran data 1 akhir : " + data1.size());
		for(Object o : data1)
			System.out.println("\t : " + o);
		
		System.out.println("Ukuran data 2 akhir : " + data2.size());
		for(String s : data2)
			System.out.println("\t : " + s);
	}
}
