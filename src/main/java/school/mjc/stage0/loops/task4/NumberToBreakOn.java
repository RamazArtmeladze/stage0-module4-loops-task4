package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (numberToGoUntil < toBreakWith) {
            System.out.println("Iterating till the end:");
            for (int i = 1; i <= numberToGoUntil; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            System.out.println("Iterating till " + toBreakWith + ":");
            for (int i = 1; i <= toBreakWith; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NumberToBreakOn numberPrinter = new NumberToBreakOn();
        numberPrinter.printNumbersUntilWithBreakOn(10,5);
    }
}

