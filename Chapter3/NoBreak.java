//Demonstruje instrukcje switch bez instrukcji break

class NoBreak {
    public static void main(String args[]) {

        int i;

        for(i = 0; i <= 5; i++) {
            switch(i) {
                case 0:
                    System.out.println(" i jest mniejsze od 1");
                case 1:
                    System.out.println(" i jest mniejsze od 2");
                case 2:
                    System.out.println(" i jest mniejsze od 3");
                case 3:
                    System.out.println(" i jest mniejsze od 4");
                case 4:
                    System.out.println(" i jest mniejsze od 5");
            }
            System.out.println();
        }
    }
}
