import java.util.List;


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
}
