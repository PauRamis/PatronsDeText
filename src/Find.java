import java.util.List;
import java.util.regex.Pattern;


public class Find {
String paraula;

    public Find(String s) {
        this.paraula = s;
    }

    public boolean match(String stringPat) {
        if (stringPat == "")
            return false;
        return this.paraula.contains(stringPat);
    }



    public Object capture(String s) {
        return s;
    }
}
