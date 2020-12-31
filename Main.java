package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountBalance(2000);
        System.out.println(bankAccount.getAccountBalance());
        System.out.println(bankAccount.withdraw(1500));

//        printDayofTheWeek(22);
//        System.out.println(isLeapYear(-1));
//        System.out.println(isLeapYear(2017));
//        System.out.println(isLeapYear(2000));

//        int amount =1000;
//        for (int i=2; i<=8 ; i++){
//            System.out.println(calculateInterest(amount,i));
//        }
//
//        for (int i=8; i>=2 ; i--){
//            System.out.println(calculateInterest(amount,i));
//        }
//        int primeNumberFound=0;
//        for (int i = 1; i < 50; i++){
//            if(isPrime(i)){
//                System.out.println(i +"is a Prime number");
//                primeNumberFound+=1;
//                if(primeNumberFound == 10)
//                    break;
//            };
//
//        }
//        int sumOfNumber =0;
//        int count=0;
//        for(int i=1; i<=1000; i++){
//            if(i%3 == 0 && i%5 == 0){
//                sumOfNumber= sumOfNumber+i;
//                count++;
//                if(count==5){
//                    System.out.println("breaking out of the loop" +
//                            count+" has reached to 5 and sum of number is " +
//                            sumOfNumber +" is this.");
//
//                }
//
//
//            }
//        }

        System.out.println(isOdd(2));
        System.out.println(sumOdd(-4,6));
        System.out.println(sumOdd(1,11));
        System.out.println(sumOdd(0,20));
        System.out.println(isEvenNumber(2));
        System.out.println(isEvenNumber(3));
        System.out.println(isEvenNumber(6));
        System.out.println(isEvenNumber(7));
        //System.out.println(sumDigits(125));
    }

    public static boolean isEvenNumber(int number){
        while(number%2 ==0){
            return true;
        }
        return false;
    }

//    public static boolean isPalindrome(int number){
//        int reverseNumber=0;
//        while(number >0){
//            int digit = number%10;
//
//            number = number/10;
//        }
//
//    }



    public static boolean isOdd(int n){
        if(n<0){
            return false;
        }else{
            if(n%2==1){
                return true;
            }
        }return false;
    }

    public static int sumOdd(int start, int end){
        int sum=0;
        if(start == 0 || end ==0){
            return -1;
        }else if (start > end){
            return -1;

        }else{
            for (int i = start; i <= end; i++){
                if(isOdd(i)){
                    sum+=i;
                }
            }
        }return sum;

    }
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for (int i=2; i <=n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount *(interestRate/100));
    }

        public static void printDayofTheWeek(int switchValue){
            switch (switchValue){
                case 1:
                    System.out.println("Sunday");
                    break;

                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                default:
                    System.out.println("Invalid Day");
                    break;
            }

        }

        public static boolean isLeapYear(int year){
            if(year <1 || year > 9999){
                return false;
         }  else if (year % 4 == 0 && year %100 != 0 || year % 400 == 0){
            return true;
        } else return false;

        }

}








