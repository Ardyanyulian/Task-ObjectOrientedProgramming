package Tugas02.LuasPermukanjava;

public class Pecahan {

    private double penyebut;
    private double pembilang;
    public static void main(String[] args) {
        
    }

    public void pecahan(double _penyebut, double _pembilang){
        this.penyebut = _penyebut;
        this.pembilang = _pembilang;
    }

    public double result(){
        return this.pembilang/this.penyebut;
    }
    
}
