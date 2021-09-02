

//Demonstruje stosowanie operatorów relacyjnych i logicznych
class RelLogOps {
    public static void main(String args[]) {
        int i, j;
        boolean b1, b2;

        i = 10;
        j = 11;
        if(i < j) System.out.println("i < j");
        if (i <= j) System.out.println("i <= j");
        if (i != j) System.out.println("i != j");
        if (i == j) System.out.println("Wywołanie nie zostanie wykonane");
        if(i >= j) System.out.println("Wywołanie nie zostanie wykonane");
        if (i > j) System.out.println("Wywołanie nie zostanie wykonane");

        b1 = true;
        b2 = false;
        if(b1 & b2) System.out.println("Wywołanie nie zostanie wykonane"); // AND
        if(!(b1 & b2)) System.out.println("!(b1 & b2) jest true"); //NEGACJA
        if(b1 | b2) System.out.println("b1 | b2 jest true"); //OR
        if(b1 ^ b2) System.out.println("b1 ^ b2 jest true");  //XOR
    }
}
