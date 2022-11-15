package se.lexicon;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
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

        System.out.println("Sorted values : " + arr);
    }
    public static void ex8(){
        //8. Create a new hashSet and populate it with random names. Lastly, sort the names in
        //alphabetical order using only a Set or a child of Set.

        Set<String> randomNames = new HashSet<String>();
        randomNames.add("Marius");
        randomNames.add("Mehrdad");
        randomNames.add("David");
        randomNames.add("Michael");
        randomNames.add("Son");

        System.out.println("HashSet values\t   : " + randomNames);
        Set<String> sortedNames = new TreeSet<String>(randomNames);
        System.out.println("Sorted with TreeSet: " + sortedNames);

    }
    public static void ex9(){
        //9. Create a new hashMap of type <Integer,String> and populate it with elements containing an
        //id(Integer) and a car brand(String). Lastly, print out the entire hashMap.
       HashMap<Integer, String> hashMap= new HashMap<Integer, String>();
       hashMap.put(1,"Volvo");
       hashMap.put(2,"Mercedes");
       hashMap.put(3,"BMW");
       hashMap.put(4,"Tesla");
       hashMap.put(5,"Dacia");
       for (Map.Entry m : hashMap.entrySet()){
           System.out.println("id: "+m.getKey()+"\tcarBrand: "+m.getValue());
       }

    }

    public static void ex10(){
        //10. Create a new hashMap of type <Integer,String> and populate it with elements containing an
        //id(Integer) and a car brand(String). Lastly, print out only the keys.

        HashMap<Integer, String> hashMap= new HashMap<Integer, String>();
        hashMap.put(1,"Volvo");
        hashMap.put(2,"Mercedes");
        hashMap.put(3,"BMW");
        hashMap.put(4,"Tesla");
        hashMap.put(5,"Dacia");
        for (Map.Entry m : hashMap.entrySet()){
            System.out.println("id: "+m.getKey());
        }
    }
    public static void ex11(){
        //11. Create a new hashMap of type <Integer,String> and populate it with elements containing an
        //id(Integer) and a car brand(String). Lastly, print out only the values.

        HashMap<Integer, String> hashMap= new HashMap<Integer, String>();
        hashMap.put(1,"Volvo");
        hashMap.put(2,"Mercedes");
        hashMap.put(3,"BMW");
        hashMap.put(4,"Tesla");
        hashMap.put(5,"Dacia");
        for (Map.Entry m : hashMap.entrySet()){
            System.out.println("CarBrand: "+m.getValue());
        }
    }
    public static void ex12(){
        //12. Create a new class and call it Car. Add fields for Id,Brand and Model + getters and setters
        //Create a new hashMap of type <Integer,Car> and populate it with elements containing an
        //id(Integer) and a car object(Car). Lastly, print out only the car's brand.
        HashMap<Integer, Car> hashMap= new HashMap<Integer, Car>();
        hashMap.put(1,new Car(1000, "Volvo","XC90"));
        hashMap.put(2,new Car(2000, "Mercedes","GLK"));
        hashMap.put(3,new Car(3000, "BMW","X6"));
        hashMap.put(4,new Car(4000, "Tesla","Y"));
        hashMap.put(5,new Car(5000, "Dacia","Bigster"));


        for (Car car : hashMap.values()){
            System.out.println("CarBrand: "+car.getBrand());
        }
    }
    public static void challenge1(){
        //1. Create an empty set and populate it with the all the days of the week. Next create a second
        //set and populate it with ONLY the weekend days (SATURDAY and SUNDAY). Lastly, compare
        //the two sets and retain in the first set only those days that are the same in both sets.

        Set<String> weekDays = new HashSet<String>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        System.out.println("WeekDays\t: "+ weekDays);

        Set<String> weekEndDays = new HashSet<String>();
        weekEndDays.add("Saturday");
        weekEndDays.add("Sunday");

        System.out.println("WeekEndDays : "+ weekEndDays);

        weekDays.retainAll(weekEndDays);
        System.out.println("Common days\t: "+ weekDays);



    }
    public static void challenge2(){
        //2. Create a new hashMap of types <String,String> and populate it with elements containing an
        //email (String) and a name (String). Next, create a new Set and populate it with the keys from
        //the hashMap you created.
        HashMap<String, String> hashMap= new HashMap<String, String>();
        hashMap.put("marius.stoica@yahoo.com","Marius Stoica");
        hashMap.put("mehrdad.javan@lexicon.se","Mehrdad Javan");
        System.out.println(hashMap);
        Set<String> emails= new HashSet<>();

        for (Map.Entry m : hashMap.entrySet()){
            emails.add((String)m.getKey());
        }
        System.out.println("Keys: "+emails);
    }
    public static void challenge3(){
        //3. Create a new class and call it SuperHero. Add fields for Id,Name and Age + getters and
        //setters. Have the class implement the Comparable interface. Implement the override method
        //and have it compare the AGE of the superhero. Next, create a new arrayList of type
        //SuperHero. Sort the list by age and print out each element

        List<SuperHero> superHeroes = new ArrayList<SuperHero>();

        superHeroes.add(new SuperHero(1,"Joe Biden", 80));
        superHeroes.add(new SuperHero(2,"Marius Stoica", 42));
        superHeroes.add(new SuperHero(3,"Mehrdad Javan", 33));

        Collections.sort(superHeroes);

        for( SuperHero superHero: superHeroes){
            System.out.println("Id: "+ superHero.getId() + " Name: "+superHero.getName()+"\t Age: " + superHero.getAge());
        }

    }
    public static void challenge4(){
        //4. Create an array of type int with numbers: {1,4,4,2,6,7}. Next, create an appropriate Collection
        //and populate it with the content of the int array. Lastly, print out each element in the
        //Collection without duplicates

        int [] numbers = {1,4,4,2,6,7};

        System.out.println("Array numbers: " +Arrays.toString(numbers));

        List<Integer> listNumbers = new ArrayList<Integer>();

        for ( int number: numbers){
            listNumbers.add(number);
        }
        System.out.println("List Numbers : "+ listNumbers);
        Set<Integer> withoutDuplicates = new TreeSet<Integer>(listNumbers);
        System.out.println("Without duplicates : "+ withoutDuplicates);

    }
}

