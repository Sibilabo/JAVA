//Prosty przykład wykorzystania parametru

class ChkNum {
    //Zwraca true jeśli x jest parzyste
    boolean isEven(int x) { //x jest parametrem metody isEven
    if((x%2) == 0) return true;
    else return false;
    }
}

class ParmDemo {
    public static void main(String args[]) {
        ChkNum e = new ChkNum();

                //10 <- argument wywołania metody isEven
        if(e.isEven(10)) System.out.println("10 jest parzyste.");

        if(e.isEven(9)) System.out.println("9 jest parzyste.");

        if(e.isEven(8)) System.out.println("8 jest parzyste.");
    }
}