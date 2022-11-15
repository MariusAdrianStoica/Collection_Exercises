package se.lexicon;

import java.lang.reflect.Array;
import java.util.*;

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


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void ex5() {
        //5. Create a new hashset and populate it with the days of the week. Lastly, print the set out and
        //pay attention to the order of the elements
        Set<String> weekDays = new HashSet<String>();

        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");



        List<String> orderWeekDays= new ArrayList<String>(weekDays);
        Collections.sort(orderWeekDays);
// How to get the first order
        Iterator<String> iterator = orderWeekDays.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
        System.out.println();
        for (String currentDay : weekDays) {
            System.out.print(currentDay + "\t");
        }
    }

    public static void ex6(){
    //6. Create a new hashSet and populate it with the days of the week.
        // Then convert the hashSet to an arrayList

        Set<String> weekDays = new HashSet<String>();

        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        List<String> arrWeekDays = new ArrayList<String>(weekDays);
        System.out.println(arrWeekDays);

    }

    public static void ex7(){
        //7. Create a new hashSet and populate it with random names. Then convert the hashSet to an
        //arrayList. Lastly, manually sort the list in alphabetical order and print it out.
        Set<String> randomNames = new HashSet<String>();
        randomNames.add("Marius");
        randomNames.add("Mehrdad");
        randomNames.add("David");
        randomNames.add("Michael");
        randomNames.add("Son");

        System.out.println("HashSet values: " + randomNames);

        ArrayList<String> arr = new ArrayList<String>(randomNames);
            int size=arr.size();


        for (int k=0; k< size-1;k++) {
            while (k < size-1) {

                if (arr.get(k).compareTo(arr.get(k + 1)) > 0) {
                    arr.add(k, arr.get(k + 1));
                    arr.remove(arr.lastIndexOf(arr.get(k)));
                    k = 0;
                } else k++;
            }
        }

        System.out.println("Sort values: " + arr);
    }
}

