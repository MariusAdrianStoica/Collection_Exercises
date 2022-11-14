package se.lexicon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercises {

    public static void ex1() {
// 1. Create a new list and populate it with the days of the week. Lastly, print the out the list.
        ArrayList<String> weekDays = new ArrayList<String>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        System.out.println(weekDays);
    }

    public static void ex2() {
        // 2. Create a new list and populate it with the days of the week. Lastly, iterate through the list
        //and print out each element separately.
        ArrayList<String> weekDays = new ArrayList<String>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        Iterator<String> iterator = weekDays.iterator();
        while (iterator.hasNext()) {
            String currentDay = iterator.next();
            System.out.print(currentDay + "\t");
        }
    }

    public static void ex3() {
        // 3. Create a new list and populate it with the days of the week excluding THURSDAY.
        // Lastly insert the weekday THURSDAY into the right position in the list.
        ArrayList<String> weekDays = new ArrayList<String>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        //weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        for (String currentDay : weekDays) {
            System.out.print(currentDay + "\t");
        }
        weekDays.add(3, "Thursday");
        System.out.println();
        for (String currentDay : weekDays) {
            System.out.print(currentDay + "\t");
        }
    }

    public static void ex4() {
        //4. Create a new list and populate it with the days of the week. Then create a new list out of the
        // first three elements of the first list using a subList
        ArrayList<String> weekDays = new ArrayList<String>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        List<String> sublist = weekDays.subList(0, 3);
        for (String currentDay : sublist) {
            System.out.print(currentDay + "\t");

        }

    }
}

