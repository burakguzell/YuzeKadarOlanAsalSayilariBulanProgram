public class Main {

    public static void main(String[] args) {

        int counter;
        for (int i = 1; i <= 100; i++) {
            counter = 0;
            for (int j = 1; j <= 100; j++) {

                if(i % j == 0){

                    counter++;
                }
            }
            if(counter == 2){
                System.out.print(i +" ");
            }
        }
    }
}
