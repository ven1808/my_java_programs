import java.util.ArrayList;
public class ArrayListEx
{
    public static void main (String[] args)
    {
        ArrayList<Integer> aList = new ArrayList<Integer>();
        aList.add(10);
        aList.add(20);
        for (int i = 0; i<= 30 ; i+=3)
        {
            aList.add(i);
        }

        System.out.println("ArrayList size : " + aList.size());

        //to print all the elements in the same line:
        for (Integer i : aList){
             System.out.print(i + " "); } 

        //to print each element in a new line
        /*for (Integer i: aList)
        {
            System.out.println(i);
        }*/

        System.out.println("\nIndex of 21: " + aList.indexOf(21));
        System.out.println("Does the list contain 0? " + aList.contains(0));
        System.out.println("Is the list empty? " + aList.isEmpty());
        ArrayList<Integer> newList = new ArrayList<Integer>();
        newList.add(100);
        newList.add(200);
        newList.add(300);
        aList.addAll(newList);
        aList.forEach(e -> System.out.print(e + " ")); // to not print the elements in the same line, we woulkd hve 
        // used println and wold drop the " "
        System.out.println(); //for putting in a new line
        aList.forEach(e -> {if (e % 3 == 0) System.out.print(e + " ");}); // any other letter than e could have been used here
        System.out.println(); //for putting in a new line
        aList.forEach(e -> {if (e % 2 == 0) System.out.print(e + " ");});
        aList.remove(15);
        aList.remove(Integer.valueOf(0));
        System.out.println();
        aList.forEach(e -> System.out.print(e + " "));

        ArrayList<String> fruits = new ArrayList<String>(5); //we added the initial capacity but we can add more than the initial capacity
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Watermelon");
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Grape");
        System.out.println();
        fruits.forEach(e -> {if (e.startsWith("G")) System.out.print(e + " ");});

    }
}
