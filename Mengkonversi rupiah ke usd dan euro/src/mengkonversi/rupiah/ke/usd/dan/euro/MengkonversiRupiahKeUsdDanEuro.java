package mengkonversi.rupiah.ke.usd.dan.euro;

import java.util.Scanner;


public class MengkonversiRupiahKeUsdDanEuro {

    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        double usd, euro, rupiah;        
        
        
        System.out.println("masukan rupiah = ");
        rupiah=input.nextInt();
        usd = rupiah/14508;
        euro = rupiah/17064;
        System.out.println("USD = "+usd);
        System.out.println("Euro = "+euro);
        
                
    }
    
}
