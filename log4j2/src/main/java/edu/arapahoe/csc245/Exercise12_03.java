package edu.arapahoe.csc245;

// 20220403 tml: Appropriate log4j imports added to code
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;

public class Exercise12_03 {

    // 20220403 tml: Appropriate logger instance added to code with proper naming convention
    private static final Logger logger = LogManager.getLogger(Exercise12_03.class);

    public static void main(String[] args) {

        int[] data = new int[100];

        // Initialize array
        // 20220403 tml: Brackets added to for statement to adhere to SIE CERT
        for (int i = 0; i < 100; i++) {
            data[i] = (int) (Math.random() * 10000);
        }

        // 20220403 tml: Logger warning added to code to log the possibility of an exception being thrown
        logger.warn("Can cause ArrayIndexOutOfBoundsException");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an index: ");

        int index = input.nextInt();

        try {
            System.out.println("The element is " + data[index]);
        } catch (Exception ex) {
            System.out.println("Out of Bounds");
            // 20220403 tml: Logger info added to log information if exeption is thrown
            logger.info("Exception was thrown." + ex);
        }
        Runtime.getRuntime().exit(0);
    }
}
