import java.util.ResourceBundle;

public class Manager {

    private static final String PACKAGE = "";
    private ResourceBundle ca, es, en, it, fr;

    public Manager(){
        this.ca = ResourceBundle.getBundle(PACKAGE + "ca");
        this.es = ResourceBundle.getBundle(PACKAGE + "es");
        this.en = ResourceBundle.getBundle(PACKAGE + "en");
        this.it = ResourceBundle.getBundle(PACKAGE + "it");
        this.fr = ResourceBundle.getBundle(PACKAGE + "fr");
    }

    public String getText(String language, String key) {
        ResourceBundle rs = null;
        if (language.equals("es")) rs = this.es;
        else if (language.equals("en")) rs = this.en;
        else if (language.equals("ca")) rs = this.ca;
        else if (language.equals("fr")) rs = this.fr;
        else rs = this.it;
        return rs.getString(key);
    }
}
