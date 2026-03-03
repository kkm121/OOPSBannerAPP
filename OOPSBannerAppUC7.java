public class OOPSBannerAppUC7 {
    public static class CharacterPatternMap {
        private char character;
        private String[] pattern;
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        public char getCharacter() { 
			return character; 
		}
        public String[] getPattern() { 
			return pattern; 
		}
    }

    public static String[] getCharacterPattern(char c, CharacterPatternMap[] mapArray) {
        for (CharacterPatternMap map : mapArray) {
            if (map.getCharacter() == c) 
				return map.getPattern();
        }
        return new String[]{"       ", "       ", "       ", "       ", "       ", "       ", "       "};
    }

    public static void main(String[] args) {
        
        CharacterPatternMap[] patternMaps = {
            new CharacterPatternMap('O', new String[]{
			" ***  ",
			"*   * ",
			"*   * " ,
			"*   * " , 
			" ***  " 
			}),
            new CharacterPatternMap('P', new String[]{
			"****  " ,
			"*   * " ,
			"****  " , 
			"*     " , 
			"*     "  
			}),
            new CharacterPatternMap('S', new String[]{
			" **** ",
			"*     ",
			" ***  ",
			"    * ",
			" **** "
			})
        };
        StringBuilder[] bannerLines = new StringBuilder[5];
        for (int i = 0; i < 5; i++) bannerLines[i] = new StringBuilder();
        String targetWord = "OOPS";
        for (int i = 0; i < targetWord.length(); i++) {
            String[] pattern = getCharacterPattern(targetWord.charAt(i), patternMaps);
            for (int line = 0; line < 5; line++) {
                bannerLines[line].append(pattern[line]).append("  ");
            }
        }
        for (StringBuilder line : bannerLines) 
			System.out.println(line);
    }
}