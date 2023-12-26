package Tutorial.TUT8;

public class CleanText {
    public static String cleanText(String content) {
        StringBuilder sb = new StringBuilder();
        content = content.toLowerCase();
        for (int i = 0; i < content.length(); i++) {
            char c = content.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == ' ') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Roses are red. Violets are blue, Sugar is sweet... And so are you.";
        System.out.println("Original: " + s);
        System.out.println("Cleaned: " + cleanText(s));
    }
}
