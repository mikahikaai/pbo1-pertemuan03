package branch;

public class SwitchChar {
    public static void main(String[] args) {
        int nilai = 'D';
        switch (nilai){
            case 'A':
                System.out.println("Mama : Nilai kam berapa nak?");
                System.out.println("Ulun : ya A lah ma");
                System.out.println("Mama : anak mama gitu loh");
                break;
            case 'B':
                System.out.println("Mama : Nilai kam berapa nak?");
                System.out.println("Ulun : B aja ma ae");
                System.out.println("Mama : HP tarus pang dikulai, turun jadinya nilai");
                break;
            case 'C':
                System.out.println("Mama : Nilai kam berapa nak?");
                System.out.println("Ulun : C ma");
                System.out.println("Mama : bangang!");
            case 'D':
                System.out.println("Mama : Nilai kam berapa nak?");
                System.out.println("Ulun : Mama jangan sariklah, D");
                System.out.println("Mama : Handak bebini tarus pang dipikirkan, minggat sana ikam!");
            default:
                System.out.println("Mama : Nilai kam berapa nak?");
                System.out.println("Ulun : Kedada ujian ma, gara-gara Corona "); //padahal E kada suah masuk gara2 becari bini
                System.out.println("Mama : #NelponDosenKampus");
                System.out.println("Ulun : . . . #BacaSyahadat");
        }
    }
}
