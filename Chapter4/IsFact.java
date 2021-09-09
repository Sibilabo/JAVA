class Factor {
    boolean isFactor(int a, int b) {  //<-ta metoda ma 2 parametry  
        if( (b % a) == 0) return true;
        else return false;
    }
}
class isFact {
    public static void main(String args[]) {
        Factor x = new Factor();
                                        //<--Dwa argumenty przekazywane metodzie isFactor()
        if(x.isFactor(2, 20)) System.out.println("2 jest dzielnikiem");
        if(x.isFactor(3, 20)) System.out.println("Ten tekst nie zostanie wyświetlony");
    }
}
