package Level1.Basics_of_Programming.String_String_Builder_and_Arraylist;

public class String_builder_usage_and_performance {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
	    System.out.println("String : " + sb);
	    // 1.
	    System.out.println("Length of string : " + sb.length());
	    // 2.
	    System.out.println("First character : " + sb.charAt(0));
	    // 3.
	    sb.setCharAt(0, 'b');
	    System.out.println("String : " + sb);
	    // 4.
	    sb.append(" reader");
	    System.out.println("String : " + sb);
	    //5.
	    sb.deleteCharAt(5);
	    System.out.println("String : " + sb);
	    // 6.
	    sb.delete(0, 5);
	    System.out.println("String : " + sb);
	    // 7.
	    sb.replace(4, 6, "ing");
	    System.out.println("String : " + sb);
	    // 8.
	    String str = sb.toString();
	    System.out.println("String : " + str);

	}

}
