#include <iostream>
using namespace std;

class Kubus {
public:
    void ResultKubus() {
        double sisi = 9;
        double hasil = 6 * (sisi * sisi);
        cout << "Hasil : " << hasil << endl;
    }
};

class Balok {
public:
    void ResultBalok() {
        double p = 2, l = 3, t = 4;
        double luas = 2 * ((p * l) + (p * t) + (l * t));
        cout << "Hasil perhitungan Balok : " << luas << endl;
    }
};

class Tabung {
public:
    void ResultTabung() {
        double r = 2, t = 3, phi = 3.14;
        double luas = 2 * phi * r * r + 2 * phi * r * t;
        cout << "Hasil perhitungan Tabung : " << luas << endl;
    }
};

class Kerucut {
public:
    void ResultKerucut() {
        double r = 4, s = 5, phi = 3.14;
        double luas = phi * r * (r + s);
        cout << "Hasil perhitungan Kerucut : " << luas << endl;
    }
};

class Limas {
public:
    void ResultLimas() {
        double alas = 4, selimut = 3, tinggi = 5;
        double luas = alas + selimut;
        double volume = (1.0 / 3) * alas * tinggi;
        cout << "Hasil perhitungan luas limas : " << luas << endl;
        cout << "Hasil perhitungan volume limas : " << volume << endl;
    }
};

class Prisma {
public:
    void ResultPrisma() {
        double LAlas = 4, selimut = 3, tinggi = 5, KAlas = 10;
        double luas = (2 * LAlas) + selimut;
        double volume = (2 * LAlas) + (KAlas * tinggi);
        cout << "Hasil perhitungan luas Prisma : " << luas << endl;
        cout << "Hasil perhitungan volume Prisma : " << volume << endl;
    }
};

class Bola {
public:
    void ResultBola() {
        double r = 2, phi = 3.14;
        double luas = 4 * phi * r * r;
        cout << "Hasil perhitungan luas Bola : " << luas << endl;
    }
};

class LimasSegiEmpat {
public:
    void ResultlimasSegiEmpat() {
        double alas = 2, sisiTegak = 5;
        double luas = alas + sisiTegak;
        cout << "Hasil perhitungan luas Limas segi empat : " << luas << endl;
    }
};

class KerucutTerpancung {
public:
    void ResultKerucutTerpancung() {
        double phi = 3.14, r1 = 2, r2 = 5;
        double luas = phi * (r1 + r2) + phi * r1 * r1 + phi * r2 * r2;
        cout << "Hasil perhitungan luas Kerucut terpancung : " << luas << endl;
    }
};

class TabungTerpancung {
public:
    void ResulttabungTerpancung() {
        double phi = 3.14, r1 = 2, r2 = 5, s = 5;
        double luas = phi * (r1 + r2) * s + phi * r1 * r1 + phi * r2 * r2;
        cout << "Hasil perhitungan luas Tabung terpancung : " << luas << endl;
    }
};

int main() {
    Kubus().ResultKubus();
    Balok().ResultBalok();
    Tabung().ResultTabung();
    Kerucut().ResultKerucut();
    Limas().ResultLimas();
    Prisma().ResultPrisma();
    Bola().ResultBola();
    LimasSegiEmpat().ResultlimasSegiEmpat();
    KerucutTerpancung().ResultKerucutTerpancung();
    TabungTerpancung().ResulttabungTerpancung();
    return 0;
}
