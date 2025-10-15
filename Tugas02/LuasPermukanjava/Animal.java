package Tugas02.LuasPermukanjava;

public class Animal {

    private String Name = "Mitokondria";
    private String Species = "Nucleus";

    public static void main(String[] args) {
        System.out.println("======Hasil Dari Kodingan Saya=========");
        Animal cow = new Animal();
        cow.setter("SAPI", "SAPIES KENTORUS");
        cow.result();

    }

    public void setter(String _name, String _species) {
        this.Name = _name;
        this.Species = _species;
    }

    private void result(){
        System.out.println(this.Name);
        System.out.println(this.Species);
    }

}


