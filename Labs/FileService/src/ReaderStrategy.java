
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dallas
 */
public interface ReaderStrategy {
    public abstract List<LinkedHashMap<String, String>> readFile()throws IOException;    
}
