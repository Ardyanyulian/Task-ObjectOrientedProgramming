class Kubus:
    def result(self):
        sisi = 9
        hasil = 6 * (sisi * sisi)
        print("Hasil :", hasil)

class Balok:
    def result(self):
        p, l, t = 2, 3, 4
        luas = 2 * ((p * l) + (p * t) + (l * t))
        print("Hasil perhitungan Balok :", luas)

class Tabung:
    def result(self):
        r, t, phi = 2, 3, 3.14
        luas = 2 * phi * r * r + 2 * phi * r * t
        print("Hasil perhitungan Tabung :", luas)

class Kerucut:
    def result(self):
        r, s, phi = 4, 5, 3.14
        luas = phi * r * (r + s)
        print("Hasil perhitungan Kerucut :", luas)

class Limas:
    def result(self):
        alas, selimut, tinggi = 4, 3, 5
        luas = alas + selimut
        volume = (1/3) * alas * tinggi
        print("Hasil perhitungan luas limas :", luas)
        print("Hasil perhitungan volume limas :", volume)

class Prisma:
    def result(self):
        LAlas, selimut, tinggi, KAlas = 4, 3, 5, 10
        luas = (2 * LAlas) + selimut
        volume = (2 * LAlas) + (KAlas * tinggi)
        print("Hasil perhitungan luas Prisma :", luas)
        print("Hasil perhitungan volume Prisma :", volume)

class Bola:
    def result(self):
        r, phi = 2, 3.14
        luas = 4 * phi * r * r
        print("Hasil perhitungan luas Bola :", luas)

class LimasSegiEmpat:
    def result(self):
        alas, sisiTegak = 2, 5
        luas = alas + sisiTegak
        print("Hasil perhitungan luas Limas segi empat :", luas)

class KerucutTerpancung:
    def result(self):
        phi, r1, r2 = 3.14, 2, 5
        luas = phi * (r1 + r2) + phi * r1 * r1 + phi * r2 * r2
        print("Hasil perhitungan luas Kerucut terpancung :", luas)

class TabungTerpancung:
    def result(self):
        phi, r1, r2, s = 3.14, 2, 5, 5
        luas = phi * (r1 + r2) * s + phi * r1 * r1 + phi * r2 * r2
        print("Hasil perhitungan luas Tabung terpancung :", luas)

# Eksekusi semua
Kubus().result()
Balok().result()
Tabung().result()
Kerucut().result()
Limas().result()
Prisma().result()
Bola().result()
LimasSegiEmpat().result()
KerucutTerpancung().result()
TabungTerpancung().result()
