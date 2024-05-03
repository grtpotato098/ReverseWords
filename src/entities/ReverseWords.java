package entities;

public class ReverseWords {
	
	
	private String result = "";
	
	
	
	public ReverseWords(String result) {
		
		this.result = result;
	}
	
	
	public ReverseWords() {
		
		
	}
	


	public String getResult() {
		return result;
	}





	public String reverseWords( String original)
	  {
		
		
		String[] words = original.split("\s");
		String[] teste = new String[words.length];
		
		
		
		for (int i = 0; i < words.length; i++) {
			teste[i] = "";
			for (int j = words[i ].length(); j > 0  ; j--) {
				
				
				teste[i] += words[i].charAt(j -1); 
				
				
			}
			
			result += teste[i] + "\s";
		}
		
		
	   
	   
	   
		
		return result.trim() ;
	  }
	
		
	
	

}
