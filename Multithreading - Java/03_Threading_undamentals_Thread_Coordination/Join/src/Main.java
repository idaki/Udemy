import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

List<Long> inputNumbers = Arrays.asList(10000000L, 3435L, 35435L,2324L,4656L,23L,245L,5566L);

List<FactorialThread> threads = new ArrayList<>();

        for (Long number : inputNumbers) {
            threads.add(new FactorialThread(number));
        }

        for (Thread thread : threads) {
         thread.setDaemon(true);
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join(2000);
        }

        for (int i = 0; i < inputNumbers.size(); i++) {
            FactorialThread factorialThread = threads.get(i);
            if (factorialThread.isFinished()) {
                System.out.println("Factorial of " + inputNumbers.get(i) + " is finished " + factorialThread.getResult());
            } else {
                System.out.println("The calculation or " + inputNumbers.get(i) + " is in progress.");
            }

        }
    }


    public static class FactorialThread extends Thread{

        private long inputNumber;
        private BigInteger result= BigInteger.ONE;
        private  boolean isFinished = false;

        public FactorialThread(long inputNumber) {
            this.inputNumber = inputNumber;
        }

        @Override
        public void run() {
           this.result = factorial(inputNumber);
           this.isFinished = true;
        }

        private BigInteger factorial(long n) {
            BigInteger result = BigInteger.ONE;
            for (long i = n; i > 0; i--) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
        }

        public BigInteger getResult() {
            return result;
        }

        public boolean isFinished() {
            return isFinished;
        }
    }
}