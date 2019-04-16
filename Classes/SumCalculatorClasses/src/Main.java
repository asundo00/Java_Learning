public class Main {
    public static void main(String[] args) {
        SimpleCalculator number = new SimpleCalculator();

        number.setFirstNumber(15);
        number.setSecondNumber(6);
        System.out.println("First number is " + number.getFirstNumber());
        System.out.println("Second number is " + number.getSecondNumber());
        ;
        System.out.println("Addition equals " + number.getAdditionResult());
        System.out.println("Subtraction equals " + number.getSubtractionResult());
        System.out.println("Multiplication equals " + number.getMultiplicationResult());
        System.out.println("Division equals " + number.getDivisionResult());

    }
}
