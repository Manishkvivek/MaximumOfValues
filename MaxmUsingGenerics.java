package src.codewithvivek;

public class MaxmUsingGenerics {
	 public static <X extends Comparable<X>> X max(X... elements) {
		    X max = elements[0];
		    for (X element : elements) {
		        if (element.compareTo(max) > 0) {
		            max = element;
		        }
		    }
		    return max;
		}
	public static void main(String[] args) {
		
		
		       System.out.println("Integer Max: " + max(Integer.valueOf (868), Integer.valueOf(578), Integer.valueOf(819), Integer.valueOf(399), Integer.valueOf(456), Integer.valueOf(718), Integer.valueOf(4598)));
		       System.out.println("Double Max: " + max(Double.valueOf(65.9687), Double.valueOf(9.879), Double.valueOf(402.9), Double.valueOf(798.366), Double.valueOf(456.111), Double.valueOf(789.5111)));
		       System.out.println("String Max: " + max("Royal Challengers Banglore", "Chennai Super Kings", "Knight Riders", "Sunrisers Hyderabad", "Rajasthan Royals", "Mumbai Indians", "", "Delhi Capitals", "THE GREAT INDIAN TEAM"));
		       System.out.println("Boolean Max: " + max(Boolean.TRUE, Boolean.FALSE));
		       
		   }

}






