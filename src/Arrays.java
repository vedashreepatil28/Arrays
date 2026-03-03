public class Arrays {

    public int[] nums;

    public static void main(String[] args) {
        System.out.println("Welcome to awesome arrays!");

        new Arrays();
    }
    public Arrays(){

        nums = new int[10];
        nums[0] = 30;
        nums[1] = 19;
        nums[2] = 18;
        nums[3] = 17;
        nums[4] = 16;
        nums[5] = 15;
        nums[6] = 14;
        nums[7] = 13;
        nums[8] = 12;
        nums[9] = 11;
        System.out.println(nums[0]);

        for (int c=0; c< nums.length; c++){
            nums[c] = (int)(Math.random()*200)+1;
        }
        displayArray();
        sumArray();
    }

    public void displayArray(){
        for (int x=0; x< nums.length; x++){
        System.out.println(x+ ":" + nums[x]);  }
    }

    public void sumArray() {
        int total = 0;
        for (int x = 0; x < nums.length; x++) {
            //System.out.println(nums[x]);
            total = total + nums[x];
        }
        System.out.println(total);
    }
}
