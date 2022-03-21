import java.util.regex.Pattern;


public class Find {
private String text ;

    public Find(String text) {
        this.text = text;
    }

    public boolean match(String stringPat) {
        Pattern pattern = Pattern.compile(stringPat);
        if (pattern.equals(""))
            return false;
        return this.text.contains(stringPat);
    }



    public Object capture(String s) {
        return s;
    }
}
