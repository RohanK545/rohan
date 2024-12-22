import java.util.Random;

public class fourdigit
{

    public static void main(String[] args) {
        // Create an instance of the Random class
        Random rand = new Random();

        // Generate and print five 4-digit random numbers
        for (int i = 0; i < 5; i++) {
           
            int randomNumber = 1000 + rand.nextInt(9000); 
            System.out.println(randomNumber);
        }
    }
}