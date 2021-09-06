//Umiejscowienie etykiety ma znaczenie

class Break6 {
    public static void main(String args[]) {
        int x = 0, y = 0;

        //Tutaj etykieta poprzedza instrukcję for
        stopl: for(x = 0; x < 5; x++) {
                for(y = 0; y < 5; y++) {
                    if(y == 2) break stopl;
                    System.out.println("x i y: " + x + " " + y);
                }
            }
            System.out.println();
        
        //A tutaj nawias otwierający blok instrukcji for
            for(x = 0; x < 5; x++)
        stopl2: {
                  for(y = 0; y < 5; y++) {
                      if(y == 2) break stopl2;
                      System.out.println("x i y: " + x + " " + y);
                  }
                }
    }
}
