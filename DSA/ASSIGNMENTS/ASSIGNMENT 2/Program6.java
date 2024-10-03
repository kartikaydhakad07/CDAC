// Reverse Words in a String
// Problem: Write a Java program to reverse the words in a given sentence.
 

class Program6{

	static String reverseWord(String str) {
		str = str.trim();
		int j = str.length();
		String res = " ";
		for(int i=str.length()-1; i >= 0; i--){
			if(str.charAt(i) == ' '){
				res = res.concat(" "+str.substring(i+1, j));
				j = i;
			}
			if(i == 0){
				res = res.concat(" "+str.substring(i, j));
			}
		}
		return res.trim();
		
	}

	public static void main(String[] args) {
		String s = "hello program by tejas";
		String s1 = "tejas";
		System.out.println(s1.length());
		System.out.println(reverseWord(s));
	}
}