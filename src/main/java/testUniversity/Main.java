package testUniversity;
import java.util.*;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        //set
        Set<String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");//will not be stored cause its a duplicate

        System.out.println(fruit.size());//4 indexes and 5 elements
        System.out.println(fruit);//prints all fruits inside brackets
        System.out.println("======================");
        //List
        List veggis = new ArrayList();
        veggis.add("Broccoli");
        veggis.add("lettuce");
        veggis.add("spinach");
        System.out.println(veggis.get(2));
        System.out.println(veggis.indexOf("Broccoli"));
        System.out.println(veggis.size());
        System.out.println(veggis);
        System.out.println(veggis.remove("Broccoli"));
        System.out.println(veggis);
        System.out.println("======================");
        //Queue
        Queue flavors = new LinkedList();
        flavors.add("vanilla");
        flavors.add("chocolate");
        flavors.add("oreo");
        flavors.add("coconut");
        System.out.println(flavors.size());
        System.out.println(flavors);
        flavors.remove();// will remove the head of the queue "vanilla"
        System.out.println(flavors);
        System.out.println(flavors.peek());//checks next object to be proccessed
        //in this case its chocolate
        System.out.println(flavors.poll());//similar to remove but it retrieves and removes
        System.out.println(flavors);
        System.out.println("======================");
        //Map
        Map athletes = new HashMap();
        athletes.put("Messi",10);
        athletes.put("Suarez",9);
        athletes.put("Neymar",11);
        System.out.println(athletes.size());
        System.out.println(athletes);
        System.out.println(athletes.get("Messi"));//gets the value in this case the jersey number
        System.out.println(athletes.entrySet());
        System.out.println(athletes.remove("Neymar"));//removes element by using key
        System.out.println(athletes);
        System.out.println("======================");
        var i = fruit.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("\n");

        for (String item : fruit){
            System.out.println(item);
        }

        System.out.println("\n");

        fruit.forEach(x -> System.out.println(x));
        System.out.println("======================");

        //Practice Exercise
        Map<String, Integer> grades1 = TestResults.getOriginalGrades();//create maps that assign to the methods
        Map<String, Integer> grades2 = TestResults.getMakeUpGrades();
        for(var grades: grades2.entrySet()){//for each loop to go through grades 2
            Integer before = grades1.get(grades.getKey());//goes through grades 1 and stores it into before
            Integer after = grades2.get(grades.getKey());//goes through grades 2 and stores it into after
            if(after > before){//checks if grades after are higher than the ones before
                grades1.put(grades.getKey(), after);//if the grades are higher it updates otherwise stays the same
            }
        }
        System.out.println("Final grade: ");
        grades1.forEach(
                (k,v)-> System.out.println("Student: " + k + ", grade: " + v)//another way to print out results dont like it!!
        );
    }
}
