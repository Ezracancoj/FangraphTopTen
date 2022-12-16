import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;

public class FangraphTopTen{
	static String[] list22 = new String[0];
	static String[] list21 = new String[0];
	static String[] list20 = new String[0];
	
	public static void main(String[] args) throws IOException {
		final String LINK22 = "https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2022&month=0&season1=2022&ind=0&page=1_131";
		final String LINK21 = "https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2021&month=0&season1=2021&ind=0&page=1_133";
		final String LINK20 = "https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2020&month=0&season1=2020&ind=0&page=1_143";
		Document doc;

		try {
		StringBuilder strings = new StringBuilder();
		doc = Jsoup.connect(LINK22).timeout(7000).get();
	
		Elements body = doc.select("tbody");
		String names;
		int num = 0;
		for(Element e : body.select("tr")){
			names = e.select("td.grid_line_regular").text();
			
			
			if(names.length() > 5) {	
				//System.out.println(names);
				strings.append(nameFormate(names));
				strings.append(",");
				
				num++;
				}
			
}
		  list22 = strings.toString().split(",");
		  System.out.println("list22-----------------------------------------------");
		  for (String a : list22) {
              System.out.println(a);
          }
          
		//System.out.println(strings);
		System.out.println();
		//---------------------------------------------------------
		/*
		int startIndex = 0;
		 int endIndex = 0;
		 String n;
		 for(int i = 0; i < strings.length();i++) {
			 if(strings.charAt(i) == (',')) {
				 endIndex = i-1;
				 System.out.println(endIndex);
			 }
			 if(Character.isDigit(strings.charAt(i))) {
				 startIndex = i;
				 System.out.println(startIndex);
			 }
			
			 //list22.add(strings.substring(startIndex, endIndex));
		 }
		*/
		//----------------------------------------------------------
		
		//namesArray(strings);
		//System.out.println(list22);

	}catch(IOException e) {
		e.printStackTrace();
	}
		System.out.println();
		try {
			StringBuilder strings = new StringBuilder();
			doc = Jsoup.connect(LINK21).timeout(7000).get();
		
			Elements body = doc.select("tbody");
			String names;
			int num = 0;
			for(Element e : body.select("tr")){
				names = e.select("td.grid_line_regular").text();
				
				
				if(names.length() > 5) {	
					//System.out.println(names);
					strings.append(nameFormate(names));
					strings.append(",");
					
					num++;
					}
				
	}
			  list21 = strings.toString().split(",");
			  System.out.println("list21-----------------------------------------------");
			  for (String a : list21) {
	              System.out.println(a);
			  }
			//System.out.println(strings);
			System.out.println("out of for loop");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		try {
			StringBuilder strings = new StringBuilder();
			doc = Jsoup.connect(LINK20).timeout(7000).get();
		
			Elements body = doc.select("tbody");
			String names;
			int num = 0;
			for(Element e : body.select("tr")){
				names = e.select("td.grid_line_regular").text();
				
				
				if(names.length() > 5) {	
					//System.out.println(names);
					strings.append(nameFormate(names));
					strings.append(",");
					
					num++;
					}
				
	}
			 list20 = strings.toString().split(",");
			  System.out.println("list20-----------------------------------------------");
			  for (String a : list20) {
	              System.out.println(a);
			  }
			//System.out.println(strings);
			System.out.println("out of for loop");
		}catch(IOException e) {
			e.printStackTrace();
		}
  }

	 public static String nameFormate(String row){
	       
	        int startIndex = 0; 
	        for (int c = 0; c < 0; c++) {
	            
	            if (row.charAt(c) == ' ') {
	               
	            	startIndex = c+1;
	            }
	        }
	        int endIndex = 50; 
	        for (int i = 0; i < endIndex; i++) {
	            String line = row.substring(i, i + 3);
	            int LENGTH = line.length(); 
	            boolean isValid = true; 
	            for (int x = 0; x < LENGTH; x++) { 
	                if (!Character.isAlphabetic(line.charAt(x))) {
	                    isValid = false;
	                }
	            }
	           
	            if ((isValid && (line.equals(line.toUpperCase()) && (line.matches("[a-zA-Z]+"))) || line.equals(" - "))) {
	            	endIndex = i-1;
	            }
	        }
	        return row.substring(startIndex, endIndex);
	    }
	/* public static ArrayList<String> namesArray(StringBuilder strings) {
		 int startIndex = 0;
		 int endIndex = 0;
		 for(int i = 0; i < strings.length();i++) {
			 if(strings.charAt(i) == (',')) {
				 endIndex = i-1;
			 }
			 if(Character.isDigit(strings.charAt(i))) {
				 startIndex = i;
			 }
			 String n = strings.substring(startIndex, endIndex);
			 System.out.println(n);
			 //list22.add(strings.substring(startIndex, endIndex));
		 }
		 
		 return list22;
		 
	 }*/
}

/*		
try {
		Document doc = Jsoup.connect(LINK21).get();
		Elements body = doc.select("tbody");
		String name;
		int num = 0;
		for(Element e : body.select("td.grid_line_regular")){
			name = body.select("a").text();
			if(name != "" && name.length() != 3) {
				list21.add(name);
				num+=1;
			}
			
			if(num == 130) {
				break;
			}
				
		}
		System.out.println(" 2022 players: ");
		for(int i=0; 1< list21.size(); i++) {
			System.out.println(list21.get(i));
		}
	}catch(IOException e) {
		e.printStackTrace();
	}
	*/
	
	
/*		
try {
		Document doc = Jsoup.connect(LINK20).get();
		Elements body = doc.select("tbody");
		String name;
		int num = 0;
		for(Element e : body.select("td.grid_line_regular")){
			name = body.select("a").text();
			if(name != "" && name.length() != 3) {
				list20.add(name);
				num+=1;
			}
				
			if(num == 130) {
				break;
			}
					
		}
		System.out.println(" 2022 players: ");
		for(int i=0; 1< list20.size(); i++) {
			System.out.println(list20.get(i));
		}
	}catch(IOException e) {
		e.printStackTrace();
	}
	*/

