package dev.halq;

import dev.halq.generator.InfoGenerator;
import dev.halq.generator.RandomGenerator;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * @author Halq
 * @since 22/09/2022
 */

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner reader = new Scanner(System.in);
        String r;

        System.out.println("Welcome for my pass generator! Made by Halq");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("Info or Random");

        r = reader.next();

        if (r.equals("Random")) {

            TimeUnit.SECONDS.sleep(2);
            RandomGenerator.main();
        } else if (r.equals("Info")) {

            TimeUnit.SECONDS.sleep(2);
            InfoGenerator.Main();
        }
    }
}