package Homeworks;
import java.util.*;
import java.util.Map.Entry;

public class homework2 {
	 public static void main(String... args){
	        char i = 0;
	        int count = 0;
	        HashMap<Integer, Character> words = new LinkedHashMap<>();
	        for(i = '\u0430'; i < '\u044f'; i++){
	            count++;
	            words.put(count, i);
	        }
	        
	        char[] line = "���������� ��������������� �������� ����������� � ��������".toCharArray();
	        for(int j = 0; j < line.length; j++){
	            System.out.print(line[j] + "    ");
	        }
	        System.out.println("");
	        for(int k = 0; k < line.length; k++){
	            for(Entry<Integer, Character> abc: words.entrySet()){
	                int key = abc.getKey();
	                char value = abc.getValue();
	                
	                if(line[k] == value){
	                    System.out.print(key + "");
	                }
	            }
	        }
	    }

}
