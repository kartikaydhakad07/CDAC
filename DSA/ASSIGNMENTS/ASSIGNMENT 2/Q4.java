// Reverse a String
class Program4{

	static String reverseString(String str){
		int e = str.length() - 1;
		String temp = "";
		while(e >= 0) {
			temp = temp+str.charAt(e);
			e--;
		}
		return temp;
	}
	public static void main(String[] args) {
		String s = "hello";
		System.out.println(reverseString(s));
	}
}