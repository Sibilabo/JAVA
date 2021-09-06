//Używa instrukcji break do przerywania pętli 

class BreakDemo {
    public static void main(String args[]) {
        int num;

        num = 100;

        //Wykonuje pętlę, dopóki kwadrat i jest mniejszy od num
        for(int i = 0; i < num; i++) {
            if(i * i >= num) break; //Przerywa pętlę jeśli i*i>100
            System.out.print(i + " ");
        }
        System.out.println("Pętla zakończona.");
    }
}
