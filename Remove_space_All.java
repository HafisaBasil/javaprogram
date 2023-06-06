package programs;

public class Remove_space_All {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str=" S O F T W A R E T E S T I N G";
		
		str.length();
		System.out.println(str.length());
	
		String st=str.trim();
		System.out.println(st.length());
		
		String result=str.replaceAll("\\s+", "");
		System.out.println(result);
	}

}
