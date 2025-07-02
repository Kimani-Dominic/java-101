package Properties;
import java.util.Iterator;
import java.util.Properties;

public class any {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("key1", "value1");
        properties.setProperty("key2", "value2");
        properties.setProperty("key3", "value3");

        Iterator keyIterator = properties.keySet().iterator();

        while(keyIterator.hasNext()){
            String key   = (String) keyIterator.next();
            String value = properties.getProperty(key);
            System.out.println(key + " = " + value );
        }

    }
}