/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dallas
 */
import java.util.*;
public interface FileFormatterStrategy {
    //needs: ", boolean hasHeader"
    public abstract String encode(List<LinkedHashMap<String,String>> data);
    //needs: ", boolean hasHeader"
    public abstract List<LinkedHashMap<String, String>> decode(List<String> dataList); 
}
