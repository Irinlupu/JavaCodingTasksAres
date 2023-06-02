package sufyan.week3;

class PrimeNumber{
    public static void main(String[] args) {
        int num = 97;
        int[] primeNumber = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        boolean bool = false;
        System.out.println(Math.sqrt(num));
        double sqrNum = Math.sqrt(num);
        int nnum = (int) Math.round(sqrNum);
        System.out.println(nnum);
        for (int i = 0; i < primeNumber.length ; i++) {
            if (nnum  < primeNumber[i]) {
                if (num % primeNumber[i] == 0) {
                    bool = true;
                    break;
                }
            }
        }
        System.out.println(bool);


    }
}