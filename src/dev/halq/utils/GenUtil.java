package dev.halq.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Halq
 * @since 22/09/2022
 */

public class GenUtil {

    static List<String> stringList = new ArrayList<>();

    public static List<String> alphabet() {

        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("d");
        stringList.add("e");
        stringList.add("f");
        stringList.add("g");
        stringList.add("h");
        stringList.add("i");
        stringList.add("j");
        stringList.add("k");
        stringList.add("l");
        stringList.add("m");
        stringList.add("n");
        stringList.add("o");
        stringList.add("p");
        stringList.add("q");
        stringList.add("r");
        stringList.add("s");
        stringList.add("t");
        stringList.add("u");
        stringList.add("v");
        stringList.add("w");
        stringList.add("x");
        stringList.add("y");
        stringList.add("z");

        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");
        stringList.add("F");
        stringList.add("G");
        stringList.add("H");
        stringList.add("I");
        stringList.add("J");
        stringList.add("K");
        stringList.add("L");
        stringList.add("M");
        stringList.add("N");
        stringList.add("O");
        stringList.add("P");
        stringList.add("Q");
        stringList.add("R");
        stringList.add("S");
        stringList.add("T");
        stringList.add("U");
        stringList.add("V");
        stringList.add("W");
        stringList.add("X");
        stringList.add("Y");
        stringList.add("Z");

        return stringList;
    }

    public static List<String> especial() {

        stringList.add("ç");
        stringList.add("*");
        stringList.add("&");
        stringList.add("%");
        stringList.add("$");
        stringList.add("#");
        stringList.add("@");
        stringList.add("!");
        stringList.add("?");
        stringList.add("/");
        stringList.add("~");


        return stringList;
    }

    public static String randomAlphabet(int charatersS) {

        int characters = charatersS;
        String name = "";
        for (int i = 0; i < characters; i++) {
            String ch = alphabet().get(new Random().nextInt(alphabet().size()));

            name += ch;
        }
        return name;
    }
}
