package konversi;
public class KonversiSuhu {
    public void celciusToFahrenheit(int a){
        int hasil = a*9/5+32;
        System.out.println("Hasil konversi nilai "+a+" Celcius adalah : "+hasil+" Fahrenheit");        
    }
    public void celciusToReamur(int a){
        int hasil = a*4/5;
        System.out.println("Hasil konversi nilai "+a+" Celcius adalah : "+hasil+" Reamur");
    }
}
