package branch;

public class IfElse4 {
    public static void main(String[] args) {
        double gajiSaatIni = 2500000;
        double inginMenikahPasSudahGajiBanyak = 3500000;

        if (gajiSaatIni < inginMenikahPasSudahGajiBanyak){
            System.out.println("Ayo bro kerja terus supaya bisa nikah"); //rencana awal
        }else if (gajiSaatIni>inginMenikahPasSudahGajiBanyak){
            double tabungan = inginMenikahPasSudahGajiBanyak-gajiSaatIni;
            System.out.println("Alhamdulillah sudah siap nikah, sisa tabungan: "+ tabungan); //bukan hoax
        }else{
            System.out.println("Loh malah corona, batal nikah dong syalalalala~~~~"); //saat ini
        }

    }
}
