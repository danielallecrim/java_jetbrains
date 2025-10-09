package arrays.bingo_card;

import java.util.Random;

public class Main {

    /***************************************************
     Change these boolean values to control whether you see
     the expected result and/or hints.
     ****************************************************/
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    static BingoCard getBingoCard(){

        /**************************************************
         Implement this method to create a BingoCard object
         that contains arrays for B, I, N, G, O.

         B: 5 numbers between 1 and 15
         I: 5 numbers between 16 and 30
         N: 4 numbers between 31 and 45
         G: 5 numbers between 46 and 60
         O: 5 numbers between 61 and 75
         ***************************************************/
        int[] B = Main.generateColumn(1,15);
        int[] I = Main.generateColumn(16,30);
        int[] N = Main.generateColumn(31,45);
        int[] G = Main.generateColumn(46,60);
        int[] O = Main.generateColumn(61,75);

        return new BingoCard(B,I,N,G,O);

    }

    /***************************************************
     Implement this method to create an array of 5 unique
     integers within the range of the parameters: min
     and max. Return the array.
     ***************************************************/
    private static int[] generateColumn(int min, int max){

        Random random = new Random();
        int count = 0;
        int entries = 5;
        int[] nums = new int[5];

        while (count < entries) {
            int number = random.nextInt(min, max + 1);


            if (elementExists(nums,number)) {
                continue;
            }else{
                nums[count] = number;
                count++;
            }
        }


        return nums;
    }


    private static boolean elementExists(int[] array, int element){
        for(int i=0; i<array.length; i++){
            if(array[i] == element){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /*************************************************************
         This is how your code will be called.
         Your answer should be a BingoCard with unique numbers within
         the appropriate range for each column.
         *************************************************************/
        BingoCard bingoCard = Main.getBingoCard();

        // Display the generated bingo card
        bingoCard.printCard();
    }
}