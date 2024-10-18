package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

/**
 * The MapUtilities see pairs in  a hasmap
 */
public class MapUtilities {
    /**
     * This method returns the number of common key/value pairs between the two HashMaps.
     *
     * @param map1 the first HashMap
     * @param map2 the second HashMap
     * @return the number of common key/value pairs
     */
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        if (map1.isEmpty() || map2.isEmpty()) {
            //check if eitehr is empy bc then there are no simialries
            return 0;
        }
        
        int commonCount = 0;
        
        for (String key : map1.keySet()) {
            // see if there is a same key in map2 THEN check 
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                commonCount++;
            }
        }
        
        return commonCount;
    }
}
