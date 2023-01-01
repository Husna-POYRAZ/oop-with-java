public class App {
    public static void main(String[] args) throws Exception {
        // Copying Array
        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto" };

        // Shallow Copy
        System.out.println("******** Shallow Copy *******");   
        String shallowCopy[] = copyFrom;
        for (String coffee : shallowCopy) {
            System.out.print(coffee + " ");           
        }
        

        // Deep Copy
        System.out.println("******** Deep Copy *******");    
        String[] deepCopy = new String[copyFrom.length];
        System.arraycopy(copyFrom, 0, deepCopy, 0, copyFrom.length);
        for (String coffee : deepCopy) {
            System.out.print(coffee + " ");           
        }

        // Array Manipulations
        System.out.println("******** Array Manipulations *******");   
        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);        
        java.util.Arrays.stream(copyTo).map(coffee -> coffee + " ").forEach(System.out::print);  


    }
}
