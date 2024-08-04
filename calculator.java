import java.util.Scanner;

class calculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        float sayi1,sayi2,secim;
        System.out.print("ilk sayiyi giriniz: ");
        sayi1= scan.nextFloat();
        System.out.print("ikinci sayiyi giriniz: ");
        sayi2= scan.nextFloat();
        System.out.println("\n lütfen yapmak istediğiniz işlemi seçiniz: ");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
        System.out.print("Seçiminiz:");
        secim = scan.nextFloat();
        if(secim == 1){
            System.out.println("Toplama : " + (sayi1 + sayi2));
         }
         else if(secim == 2){
            System.out.println("Çıkarma: "+ (sayi1-sayi2));
         }
         else if(secim == 3){
            System.out.println("Çarpma: "+ (sayi1*sayi2));
         }
         else if(secim == 4 ){
            if(sayi2 == 0){
                System.out.println("ikinci sayı 0'a eşit olduğundan sonuç belirsizdir.");
            }
            else{
                System.out.println("Bölme: "+(sayi1/sayi2));
            }
       } 
              else{
                System.out.println("Geçersiz bir sayı girdiniz.");
                  }
     }
    
}

    
