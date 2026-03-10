public class Arrays {

    public int[] nums;
    public Astronaut[] astro;

    public static void main(String[] args) {
        System.out.println("Welcome to awesome arrays!");

        new Arrays();
    }
    public Arrays(){

        nums = new int[10];
        astro = new Astronaut[7];

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
        averageNum();
        maxNum();
        minNum();


        Astronaut a1 = new Astronaut();
        a1.printInfo();


        astro[0] = new Astronaut();
        astro[0].eyes = 2;
        astro[0].name = "jasmin";
        astro[0].printInfo();

        astro[1] = new Astronaut();
        astro[1].eyes = 8;
        astro[1].name = "Merida";
        astro[1].printInfo();

        astro[2] = new Astronaut();
        astro[2].eyes = 1;
        astro[2].name = "Aurora";
        astro[2].printInfo();

        astro[3] = new Astronaut();
        astro[3].eyes = 4;
        astro[3].name = "Rupanzel";
        astro[3].printInfo();

        astro[4] = new Astronaut();
        astro[4].eyes = 3;
        astro[4].name = "bell";
       astro[4].printInfo();

        astro[5] = new Astronaut();
        astro[5].eyes = 9;
        astro[5].name = "cinderella";
        astro[5].printInfo();

        astro[6] = new Astronaut();
        astro[6].eyes = 2;
        astro[6].name = "sophia";
        astro[6].printInfo();

        for (int x=0; x < astro.length; x++){
            astro[x].eyes = (int)(Math.random()*31);
            System.out.println(astro[x].eyes);
        }

        displayAstro();
        totalEyes();

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
        System.out.println(" ");
    }

    public void averageNum() {
        int average = 0;
        int ave;
        for (int x = 0; x < nums.length; x++) {
            //System.out.println(nums[x]);
            average = average + nums[x];
        }
        ave = average/nums.length;
        System.out.println(ave);
    }

    public void maxNum(){
        int largest = nums[0]; // Assume the first element is the largest initially
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i]; // Update largest if current element is greater
            }
        }
        System.out.println("max:" + largest);
    }

    public void minNum(){
        int smallest = nums[0]; // Assume the first element is the largest initially
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i]; // Update largest if current element is greater
            }
        }
        System.out.println("min: " + smallest);
    }

    public void displayAstro(){
        for(int x=0; x<astro.length; x++){
            astro[x].printInfo();
        }
        System.out.println(" ");

    }

    public void totalEyes(){
        int Eyes = 0;
        for (int x = 0; x < astro.length; x++) {
            //System.out.println(nums[x]);
            Eyes = Eyes + astro[x].eyes;
        }
        System.out.println(Eyes);
    }

}
