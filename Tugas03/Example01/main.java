import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        // Inisiasi Variable
        double var1,var2;
        int pilih = 0;
        Scanner input = new Scanner(System.in);
        
        
        do{
            System.out.println("Pilihan : ");
            System.out.println("          ");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Kalian");
            System.out.println("4. Pembagi");
            System.out.println("5. Selesai");
            System.out.print("Silahkan pilih menu : ");

            pilih = input.nextInt(); // menginputkan nilai ini memakai class Scanner
            
            if(pilih != 5){
                
                System.out.print("Masukkan angka pertama : ");
                var1 = input.nextDouble();
                
                System.out.print("Masukkan angka kedua : ");
                var2 = input.nextDouble();

                Operations op = new Operations(var1,var2);


                switch(pilih){
                    case 1:
                        System.out.println("Hasil dari penjumlahan antara " + var1 + " dengan angka " + var2 + " adalah : " + op.tambah());
                        break;
                    case 2:
                        System.out.println("Hasil dari pengurangan antara " + var1 + " dengan angka " + var2 + " adalah : " + op.kurang());
                        break;
                    case 3:
                        System.out.println("Hasil dari perkalian antara " + var1 + " dengan angka " + var2 + " adalah : " + op.kali());
                        break;
                    case 4:
                        System.out.println("Hasil dari pembagian antara " + var1 + " dengan angka " + var2 + " adalah : " + op.bagi());
                        break;
                    default:
                        System.out.println("Terimakasih telah program ini");
                        break;
                }
            }
        }while(pilih != 5);
        System.out.println("Selesai");
    }
}

class Operations {
    private double var1,var2;
    public Operations (double var1, double var2) {
        this.var1=var1;
        this.var2=var2;
    }
    public double tambah(){return var1 + var2;}
    public double kurang(){return var1 - var2;}
    public double kali(){return var1 * var2;}
    public double bagi(){return var1/var2;}
}
