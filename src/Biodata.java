import java.util.Scanner;

public class Biodata {
    public static void main(String[] args){
//      Declare variable and data type
        String nama;
        double tinggi, umur;

//      Create new scanner in
        Scanner in = new Scanner(System.in);
        System.out.println("Hi..");
        System.out.print("Nama saya: "); // print message
        nama = in.nextLine(); // use a scanner to request input (nama)
        System.out.print("Umur saya: "); // print message
        umur = in.nextDouble(); // use a scanner to request input (umur)
        System.out.print("Tinggi badan saya: "); // print message
        tinggi = in.nextDouble(); // use a scanner to request input (tinggi)

//      Make output
        System.out.println("=============================");

        System.out.println("Nama saya: "+nama);
        System.out.println("Umur saya: "+umur+" Tahun");
        System.out.println("Tinggi badan saya: "+tinggi+" Cm");

        System.out.println("=============================");
    }
}
