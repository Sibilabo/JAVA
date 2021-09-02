/*
 * Ten program próbuje zadeklarować w wewnętrznym zasięgu zmienną o nazwie,
 * która jest już zdefiniowana w zasięgu zewnętrznym
 *** 
 * Ten program nie zostanie skompilowany
 * 
 * 
 * class NestVar { public static void main(String args[]) { int count;
 * 
 * for(count = 0; count < 10; count = count + 1) {
 * System.out.println("Wartość zmiennej count: " + count);
 * 
 * int count; //NIEDOZWOLONE!!! <- nie można zadeklarować count, zmienna o tej
 * nazwie już istnieje for(count = 0; count < 2; count++)
 * System.out.println("Ten program zawiera bład!"); } } }
 */