package example;

import java.util.Calendar;

public class ExampleClass {

	public int add(int a, int b) {
		return a + b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public static String getPresentDay() {
		switch(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) 
		{
			case Calendar.MONDAY:    return "Momday";
			case Calendar.TUESDAY:   return "Tuesday";
			case Calendar.WEDNESDAY: return "Wednesday";
			case Calendar.THURSDAY:  return "Thursday";
			case Calendar.FRIDAY:    return "Friday";
			case Calendar.SATURDAY:  return "Satudray";
			case Calendar.SUNDAY:    return "Sunday";
			default:                 return "Doomsday";
		}
	}
	
	public static void bubbleSort(int[] intArray) {
        int n = intArray.length;
        int temp = 0;
        boolean sorted = true;
       
        for(int i=0; i < n; i++){
        	sorted = true;
            for(int j=1; j < (n-i); j++){
            	
                if(intArray[j-1] > intArray[j]){
                    //swap the elements!
                	sorted = false;
                    temp = intArray[j-1];
                    intArray[j-1] = intArray[j];
                    intArray[j] = temp;
                }
            }
            
            if (sorted) {
            	return;
            }
        }
	}
}
