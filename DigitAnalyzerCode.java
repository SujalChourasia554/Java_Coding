public class DigitAnalyzerCode {
    static class DigitAnalyzer{
        public int countDigit(int num ,int d){
            int count = 0;
            int temp = num;

            while(temp != 0){
                int digit = temp % 10;
                if(digit == d){
                    count++;
                }
                temp = temp /10;
            }
            return count;
        }
    }

    static void main() {
        DigitAnalyzer a = new DigitAnalyzer();
        System.out.println(a.countDigit(121212,2));

    }
}