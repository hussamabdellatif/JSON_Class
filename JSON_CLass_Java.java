import java.util.ArrayList;
import java.util.HashMap;

import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;

public class PS10_JSON{


    static String Q1(int a, int b, int c){
    	JsonArray myArray = new JsonArray();
    	myArray.add(a);
    	myArray.add(b);
    	myArray.add(c);
    	String myString = myArray.toString();
      // return a JSON String that is an array containing the values a, b, and c in that order.
      return myString;
    }


    static String Q2(ArrayList<Integer> numbers){
    	JsonArray myArray = new JsonArray();
    	for (int i=0 ; i<numbers.size(); i++){
    		myArray.add(numbers.get(i));
    	}
    	String myString = myArray.toString();
        // return a JSON String that is an array containing the values of the input ArrayList in the same
        // order as they appear in the ArrayList.
        return myString;
    }


    static String Q3(String key, int value){
    	JsonObject myob = new JsonObject();
    	myob.add(key, value);
    	String myS  = myob.toString();
      // return a JSON String that is an object containing the provided key-value pair
        return myS;
    }


    static String Q4(String key, String value){

    	JsonObject myob = new JsonObject();
    	myob.add(key, value);
    	String myS  = myob.toString();
      // return a JSON String that is an object containing the provided key-value pair
        return myS;
    }


    static String Q5(HashMap<String, Integer> input){

    	JsonObject myArray = new JsonObject();
    	for (String key: input.keySet()){

    		myArray.add(key, input.get(key));

    	}
    	String myString = myArray.toString();
        // return a JSON String that is an object containing the same key-value pairs stored in the input HashMap
        return myString;
    }


    public static void main(String[] args){

    }
}
