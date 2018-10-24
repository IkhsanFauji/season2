public class MathematicalOperationsDemos {

    public static void main (String[] args){
        int x = 8; // data type integer
        // int y = 3; // data type double (int + int = int)
        double y = 3; // data type double (int + double = double)

        System.out.println("Nilai X = " + x);
        System.out.println("Nilai Y = " + y);

        System.out.println("===============================");

//        System.out.println("X + Y = "+ (x+y));
//        System.out.println("X - Y = "+ (x-y));
//        System.out.println("X * Y = "+ (x*y));
//        System.out.println("X / Y = "+ (x/y));
//        System.out.println("X % Y = "+ (x%y));

        x++;
        y *= 10;

        System.out.println("Increment bertingkat X = "+ x);
        System.out.println("Increment (kelipatan 10) Y = "+ y);

        x--; // hasilnya akan 8 karena pada variable x sebelumnya menghasilkan nilai 9
             // juka increment sebelumnya di non aktifkan maka hasilnya akan 7 karena variable x sebelumnya bernilai 8
        System.out.println("Increment menurun X = "+ x);

    }

}
