import java.util.HashMap;
public class OOPSBannerAppUC8 {
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character,String[]> charMap= new HashMap<>();
		charMap.put('O',new String[]{
			" ***  ",
			"*   * ",
			"*   * " ,
			"*   * " , 
			" ***  " 
			});
		charMap.put('P',new String[]{
			"****  " ,
			"*   * " ,
			"****  " , 
			"*     " , 
			"*     "  
			});
		charMap.put('S',new String[]{
			" **** ",
			"*     ",
			" ***  ",
			"    * ",
			" **** "
			});
        return charMap;
    }
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {
            StringBuilder rowBuilder = new StringBuilder();
            
            for (char c : message.toCharArray()) {
                if (charMap.containsKey(c)) {
                    rowBuilder.append(charMap.get(c)[line]).append("  ");
                } else {
                    rowBuilder.append("      ").append("  ");
                }
            }
            System.out.println(rowBuilder.toString());
        }
    }
    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}