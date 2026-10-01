public class MyBeer {
    public static void main(String[] args) {
        /*
        A large number of college students are attending a party. Each guest is
        drinking a can of beer (or soda of they are under 21). An emergency
        causes the lights to go out and the fire alarm to go off. The guests
        calmly put down their beer and exit the building. When the alarm goes
        off, they re-enter and try to retrieve their beer. However, the lights
        are still off, so each student randomly grabs a bottle of beer. What are
        the chances that at least one student gets his or her original beer?

        Write a program MyBeer.java that takes a command-line argument n and
        runs 1,000 simulations of this event, assuming there are n guests. Print
        the fraction of times that at least one guest gets their original beer.
         */

        if (args.length < 1){
            System.err.println("Use: java MyBeer <n> ");
            System.exit(1);
        }
        int n = Integer.parseInt(args[0]);
        int[] beers = new int[n];
        int gotMyBeer = 0;

        for(int sim = 0; sim < 1000; sim++) {
            //Su
            for (int i = 0; i < n; i++) {
                beers[i] = i;
            }

            shuffle(beers);

            boolean originalBeer = false;
            for (int i = 0; i < n; i++) {
                if (beers[i] == i){
                    originalBeer = true;
                    break;
                }
            }
            if(originalBeer){
                gotMyBeer++;
            }
        }
        System.out.println("The simulated number of successful parties: " + gotMyBeer + "/1000 or " + (double) gotMyBeer / 1000);
    }
    // Fisher-Yates Algorithm
    public static void shuffle(int[] array){
        for(int i = array.length - 1; i > 0; i--){
            int j = (int) (Math.random() * (i + 1));

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
