package strings;

public class stringcomprehensionStringbuilder {
    public static String stringCompression(String str) {
        StringBuilder newstr = new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            int count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            newstr.append(str.charAt(i));
            if(count>1) {
                newstr.append(count);
            }
        }
        return newstr.toString();
    }
    public static void main(String[]args) {
        String str = "aaabbcccdd";
        System.out.println(stringCompression(str));
    }
}
