package exemplos;

public class ConcatRemove {

	public static void main(String[] args) {
		String s = "aba";
		String t = "aba";
		int qtdePermitidas = 7;
		int qtdeRealizadas = 0;
		
		int position = pegarposition(s,t);
		qtdeRealizadas = s.length()-position;
		String res = removeChar(s, position);
		qtdeRealizadas += t.length()-position;
		res = incrementarChar(t, position, res);
		System.out.println(res);
		System.out.println(qtdeRealizadas);
		if (qtdePermitidas >= qtdeRealizadas)
			System.out.println("Sim");
		else 
			System.out.println("Não");
	
	}

	public static int pegarposition(String s1, String s2) {
		int i = 0;
		while ((i < s1.length()) && (i < s2.length())){
			if (s1.charAt(i) != s2.charAt(i)){
				return i;
			}
			i++;
		}
		if (s1.length() == s2.length()){
			return 0;
		}
		return i; 
	}

	public static String removeChar(String str, int pos) {
	    if (str.length() == pos)
	        return str;
	    else 
	        return removeChar(str.substring(0, pos) + str.substring(pos + 1), pos);
	    
	}
	
	public static String incrementarChar(String str, int pos, String res) {
	    if (pos > str.length()-1)
	        return res;
	    else 
	        return incrementarChar(str, pos+1, res.concat(str.substring(pos, pos+1)));	    
	}
	


}
