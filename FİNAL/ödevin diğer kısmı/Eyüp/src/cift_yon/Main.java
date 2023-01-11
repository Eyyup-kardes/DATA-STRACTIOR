package cift_yon;
public class Main {
    public static void main(String[] args) {
    	
    	
    	
    
        DBList d=new DBList();
        d.ekle("midyat");   
        d.ekle("kızltepe");
        d.ekle("nusaybin");
        d.ekle("savur");
        d.ekle("yeşilli");
        d.listele();
        d.sil("kızıltepe");
        System.out.println();
        d.listele();
    }
}

