import java.util.HashMap;
import java.util.ResourceBundle;

public class I18NManager2 {
    //Static reference of the instance
    private static I18NManager2 instance;
    //HashMap Name to ResourceBundle
    private HashMap<String, ResourceBundle> nameToResourceMap;
    //Package location as in this case it's outside the main directory
    private static final String PACKAGE = "";
    //Private Constructor
    private I18NManager2(){
        this.nameToResourceMap = new HashMap<String ,ResourceBundle>();
    }
    //Singular static access function for the instance
    public static I18NManager2 getInstance(){
        if (instance==null) instance=new I18NManager2();
        return instance;
    }
    //Pattern function
    public String getText(String language, String key){
        ResourceBundle rs = this.nameToResourceMap.get(language);
        if(rs==null){
            rs = ResourceBundle.getBundle(PACKAGE+language);
            this.nameToResourceMap.put(language,rs);
        }
        return rs.getString(key);
    }
}
