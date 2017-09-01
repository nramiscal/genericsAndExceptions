import java.util.ArrayList;

public class GenericsAndExceptions {
ArrayList<Object> myList = new ArrayList<Object>();

    public void createArrayList(){

        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        // System.out.println(myList);
    }

    public void castToInteger(){
        for (int i = 0; i < myList.size(); i++){
            try {
                int castedValue = (int) myList.get(i);
                myList.set(i, castedValue);
                System.out.println(myList.get(i));
            } catch (ClassCastException e){
                System.out.println("ERROR ON INDEX {" + i + "}");
            }
        }
    }
}
