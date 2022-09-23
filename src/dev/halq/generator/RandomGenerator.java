package dev.halq.generator;

import dev.halq.utils.GenUtil;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Halq
 * @since 22/09/2022
 */

public class RandomGenerator {

    public static void main() {
        Scanner reader = new Scanner(System.in);
        int char1, char2;
        Boolean especial;

        System.out.println("Please put int char Alphabet");

        if (!reader.hasNextInt()) {

            System.out.println("please put valid value");
            reader.hasNextInt();

        }

        char1 = reader.nextInt();

        System.out.println("Please put int char Number");

        if (!reader.hasNextInt()) {

            System.out.println("please put valid value");
            reader.hasNextInt();

        }

        char2 = reader.nextInt();

        Random random = new Random();

        int randomr = random.nextInt(char2);


        System.out.println("Especial chars? (true/false)");

        if (!reader.hasNextBoolean()) {

            System.out.println("Please put valid value (true/false)");
            reader.hasNextBoolean();

        }

        especial = reader.nextBoolean();

        if (especial) {

            System.out.println("You pass: " + GenUtil.randomAlphabet(char1) + randomr + "*");
        } else {

            System.out.println("You pass: " + GenUtil.randomAlphabet(char1) + randomr);
        }


    }
}