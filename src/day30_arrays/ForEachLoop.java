package day30_arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] nums= {1,2,3,5,4};

        for (int i=0; i< nums.length; i++){
            System.out.println("number "+ nums[i]);
        }
        System.out.println();

        for (int eachNumber : nums){
            System.out.println("number "+ eachNumber);    // eachNumber = nums[i];

        }

        String[] strs= {"java", "selenium", "db", "api"};

        for (int i=0; i< strs.length; i++){
            System.out.println(strs[i]);
        }

        for (String word: strs){
            System.out.println(word);
        }




























































    }
}
