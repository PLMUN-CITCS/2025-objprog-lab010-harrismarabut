public class LoopingStatementsDemo {
    public static void main(String[] args) {
        
        System.out.println("While Loop Output:");
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

       
        System.out.println("\nDo-While Loop Output:");
        count = 1;
        do {
            System.out.println("Count: " + count);
            count++;
        } while (count <= 5);

        
        System.out.println("\nFor Loop Output (Even Numbers):");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
        }

        
        System.out.println("\nNested Loops Output (3x3 Grid):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

       
        System.out.println("\nLoop with Break and Continue:");
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break; 
            }
            if (i == 5) {
                continue; 
            }
            System.out.println("Number: " + i);
        }
    }
}
