//Demonstruje użycie instrukcji switch

class SwitchDemo {
    public static void main(String args[]) {
        int i;

        for(i = 0; i < 10; i++)
            switch(i) {
                case 0:
                    System.out.println("i równe 0");
                    break;
                case 1:
                    System.out.println("i równe 1");
                    break;
                case 2:
                    System.out.println("i równe 2");
                    break;
                case 3:
                    System.out.println("i równe 3");
                    break;
                case 4:
                    System.out.println("i równe 4");
                    break;
                default:
                    System.out.println(" i równe 5 lub więcej");
                    break;
            }
    }
}
