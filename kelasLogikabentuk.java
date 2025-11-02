public class kelasLogikabentuk {
    void bentukKotak (int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++) {
                System.out.print ("*");
            }
            System.out.println ("*");
        }
    }

    void bentukSegitigasiku (int a) {
        for (int i=0;i<a;i++) {
            for (int j=0; j<i+1;j++) {
                System.out.print ("*");
            }
            System.out.println ("*");
        }
    }

    void bentukSegitigakaki (int b) {
        for (int i=0; i < b; i++) {
            for (int j=b-i; j>0; j--) {
                System.out.print (" ");
                }
                for (int k=0; k < 2 * i + 1;k++) { 
                System.out.print ("*");
            }
            System.out.println ("*");
        }
    }

    void bentukLingkaran (int c) {
        for (int i = -c; i<=c; i++){
            for (int j = -c; j<=c; j++){
                if (j*j + i*i <= c*c){
                    System.out.print ("* ");
                } else {
                    System.out.print ("  ");
                }
            }
            System.out.println ();
        }
    }
}
