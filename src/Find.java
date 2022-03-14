import java.util.List;


public class Find {
String paraula;
    public Find(String s) {
        this.paraula = s;
    }

    public boolean match(String stringPat) {
        if (this.paraula.contains(stringPat) && stringPat != "")
            return true;
        return false;
    }
}
