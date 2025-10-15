package Tugas02.LuasPermukanjava;
public class Main{

    
    public static void main(String[] args){
        Kubus kubus = new Kubus();
        kubus.ResultKubus();

        // nama object
        Balok balok = new Balok(2, 3, 4);
        // nama methods
        balok.ResultBalok();

        Tabung tabung = new Tabung();
        tabung.ResultTabung();

        Kerucut kerucut = new Kerucut();
        kerucut.ResultKerucut();

        Limas limas = new Limas();
        limas.ResultLimas();

        Prisma prisma = new Prisma();
        prisma.ResultPrisma();

        Bola bola = new Bola();
        bola.ResultBola();
                
        limasSegiEmpat limas_segi_empat = new limasSegiEmpat();
        limas_segi_empat.ResultlimasSegiEmpat();

        kerucutTerpancung kerucut_terpancung = new kerucutTerpancung();
        kerucut_terpancung.ResultKerucutTerpancung();

        tabungTerpancung tabung_terpancung =  new tabungTerpancung();
        tabung_terpancung.ResulttabungTerpancung();

    }

}


// class kubus
class Kubus {
    double sisi = 9;
    double hasil = 6 * (sisi * sisi);

    public void ResultKubus(){
        System.out.println("Hasil : " + hasil);
    } 
}


// class Balok
class Balok {
    double panjang = 2;
    double lebar = 3;
    double tinggi = 4;
    

    // Constructor in java
    public Balok(int _panjang, int _lebar, int _tinggi){
        this.lebar= _lebar;
        this.panjang = _panjang;
        this.tinggi = _tinggi;

    }

    double luasPermukaan = 2 * ((panjang * lebar) + (panjang * tinggi
    ) + (lebar * tinggi));
    
    // nama methods
    public void ResultBalok(){
        System.out.println("Hasil perhitungan Balok : "+ luasPermukaan);
    }
}


class Tabung {
    double ruasRuas = 2;
    double phi = 3.14;
    double tinggi = 3;

    double luasPermukaan = (2 * phi * (ruasRuas * ruasRuas)) + (2 * phi * (ruasRuas * tinggi));

    public void ResultTabung(){
        System.out.println("Hasil perhitungan Tabung : " + luasPermukaan);
    }

}

class Kerucut {
    double phi = 3.14;
    double jariAlas = 4;
    double garisPelukis =  5;

    double luas = phi * jariAlas * (jariAlas + garisPelukis);

    public void ResultKerucut(){
        System.out.println("Hasil perhitungan Kerucut : "+ luas);
    }
}


class Limas {
    double alas = 4;
    double selimut = 3;
    double tinggi = 5;
    
    double luasPermukaan = alas + selimut;
    double Volume = 1/3 * alas * tinggi;
    
    public void ResultLimas(){
        System.out.println("Hasil perhitungan luas limas : " + luasPermukaan);
        System.out.println("Hasil perhitungan volume limas : " + Volume);
    }
}


class Prisma {
    double LAlas = 4;
    double selimut = 3;
    double tinggi = 5;
    double KAlas = 10;
    double luasPermukaan =  (2 * LAlas) + selimut;
    double Volume = (2 * LAlas) + (KAlas * tinggi);
    
    public void ResultPrisma(){
        System.out.println("Hasil perhitungan luas Prisma : " + luasPermukaan);
        System.out.println("Hasil perhitungan volume Prisma : " + Volume);
    }
}


class Bola {
    double jariJari = 2;
    double phi = 3.14;
    double luasPermukaan =  4 * phi * (jariJari * jariJari);
    public void ResultBola(){
        System.out.println("Hasil perhitungan luas Bola : " + luasPermukaan);
    }
}

class limasSegiEmpat {
    double luasAlas = 2;
    double jumlahLuasSisiTegak = 5;
    double luasPermukaan =  luasAlas + jumlahLuasSisiTegak;
    public void ResultlimasSegiEmpat(){
        System.out.println("Hasil perhitungan luas Limas segi empat : " + luasPermukaan);
    }
}


class kerucutTerpancung {
    double phi = 3.14;
    double jari1 = 2;
    double jari2 = 5;
    double luasPermukaan =  phi * ((jari1 + jari2) + ((phi * (jari1 * jari1)) + (phi * (jari2 * jari2))));
    public void ResultKerucutTerpancung(){
        System.out.println("Hasil perhitungan luas Kerucut terpancung : " + luasPermukaan);
    }
}

class tabungTerpancung {
    double phi = 3.14;
    double jariAlasBawah = 2;
    double jariAlasAtas = 5;
    double panjangSisiMiring = 5;

    double luasPermukaan =  phi * (((jariAlasBawah + jariAlasAtas) * panjangSisiMiring) + (phi * (jariAlasBawah * jariAlasBawah)) + (phi * jariAlasAtas));
    public void ResulttabungTerpancung(){
        System.out.println("Hasil perhitungan luas Tabung terpancung : " + luasPermukaan);
    }
}