// MOpearasiTitik.java  01/03/2023
// Nama : Fauzan Ramadhan Putra (24060121140140)
// Deskripsi : main untuk kelas OperasiTitik

class MOperasiTitik{
	public static void main(String[] args){
		Titik t1;
		OperasiTitik ot;
		
		t1 = new Titik(4,4);
		ot = new OperasiTitik();
		
		System.out.println("titik ("+t1.getAbsis()+", "+t1.getOrdinat()+")");
		
		ot.refleksiX(t1);
	
		System.out.println("titik setelah refelksi sb X: ("+t1.getAbsis()+", "+t1.getOrdinat()+")");
		
		ot.refleksiY(t1);
		
		System.out.println("titik setelah refelksi sb y: ("+t1.getAbsis()+", "+t1.getOrdinat()+")");
	}
}
