import java.util.ResourceBundle;

public class I18NManager {
    //Referencia estatica de la instancia
    private static I18NManager instance;
    //Package location as in this case it's outside the main directory
    private static final String PACKAGE = "";
    //Resource bundle
    private ResourceBundle ca, es, en, it, fr;

    //Private Constructor
    private I18NManager() {
        this.ca = ResourceBundle.getBundle(PACKAGE + "ca");
        this.es = ResourceBundle.getBundle(PACKAGE + "es");
        this.en = ResourceBundle.getBundle(PACKAGE + "en");
        this.it = ResourceBundle.getBundle(PACKAGE + "it");
        this.fr = ResourceBundle.getBundle(PACKAGE + "fr");
    }

    //Singular static access function for the instance
    public static I18NManager getInstance() {
        if (instance == null) instance = new I18NManager();
        return instance;
    }

    //Pattern function
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
