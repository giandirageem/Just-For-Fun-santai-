//just for fun guys
//blablablabl
//30 jun 2019

import java.io.*;
class InputData {
	public static void main(String args[]) throws IOException {
		//initialize object
		InputStreamReader isr = new InputStreamReader(System.in);
		//wrap isr object to BufferedReader
		BufferedReader br = new BufferedReader(isr);

		String[] nama_siswa = new String[100];
		System.out.println("Masukkan nama siswa..");
		System.out.println("Ketik 'selesai' untuk mengakhiri inputan..");

		//repeat
		for(int i=0; i<nama_siswa.length; i++) {
			nama_siswa[i] = br.readLine();
			//when nama_siswa equals to 'selesai', break and done
			if(nama_siswa[i].equals("selesai")) break;
		}

		System.out.println();
		System.out.println("Daftar nama..");

		//print the String that typed before
		//
		int j=0;
		while(j<nama_siswa.length) {
			try {
			if(nama_siswa[j].equals("selesai")) break;
						System.out.println("Nama siswa : " + nama_siswa[j]);
			j++;

			//stop for 1 sec
			Thread.sleep(1000);
		} catch(InterruptedException e) {}
		}
	}
}