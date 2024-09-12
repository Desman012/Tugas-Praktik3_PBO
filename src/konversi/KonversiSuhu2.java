package konversi;
public class KonversiSuhu2 extends KonversiSuhu{
    public void fahrenheitToReamur(int a){
        int hasil = (a-32)*4/9;
        System.out.println("Hasil konversi nilai "+a+" Fahrenheit adalah : "+hasil+" Reamur");

    }
}
