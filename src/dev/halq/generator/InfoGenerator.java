package dev.halq.generator;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Halq
 * @since 22/09/2022
 */

public class InfoGenerator {

    public static void Main() {

        Scanner reader = new Scanner(System.in);
        String name;
        String Name;
        int date;
        boolean especial;

        System.out.println("Put Your Name");

        if (!reader.hasNext()) {

            System.out.println("Please put Valid value");
            reader.hasNext();

        }

        name = reader.next();
        Name = name.length() < 2 ? name : name.substring(0, 2);

        System.out.println("put your birthday (with date)");

        if (!reader.hasNextInt()) {

            System.out.println("Please put valid value");
            reader.hasNextInt();

        }

        date = reader.nextInt();

        System.out.println("Especial chars? (true/false)");

        if (!reader.hasNextBoolean()) {

            System.out.println("Please put valid value (true/false)");
            reader.hasNextBoolean();

        }

        especial = reader.nextBoolean();

        if (especial) {

            System.out.println("You pass: " + Name + new Random().nextInt(1000) + date + "*");
        } else {

            System.out.println("You pass: " + Name + new Random().nextInt(1000) + date);
        }


    }
}
