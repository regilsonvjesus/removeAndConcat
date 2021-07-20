package exemplos;

public class ConcatRemove {

	public static void main(String[] args) {
		System.out.println("oi");
		String s = "blablablabla";
		String t = "blablabcde";
		//8
		System.out.println(comparaStrings(s,t));

	}

	public static int comparaStrings(String s1, String s2) {
		int i = 0;
		/*
		 * Vai um por um passeando pelos dois vetores
		 */
		while ((i < s1.length()) && (i < s2.length())){
			if (s1.charAt(i) != s2.charAt(i)){
				return i;
			}
			i++;
		}
		
		/*
		 * Se chegar aqui, ou são iguais ou um é menor que o outro (nesse caso, diferentes)
		 */
		if (s1.length() == s2.length()){
			return -1;
		}
		
		/*
		 * Se chegar aqui, um é menor que o outro... "i" conterá o último índice do menor vetor
		 */
		return i; 
	}
}
