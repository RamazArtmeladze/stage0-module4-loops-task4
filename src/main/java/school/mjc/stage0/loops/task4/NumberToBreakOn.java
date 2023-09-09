package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        for (int i = 1; i <= numberToGoUntil; i++) {
            System.out.println(i);
            if (i == toBreakWith) {
                System.out.println("iterating till the end");
                break;
            }
        }
    }

    public static void main(String[] args) {
        NumberToBreakOn numberPrinter = new NumberToBreakOn();
        numberPrinter.printNumbersUntilWithBreakOn(10, 5);
    }
}
