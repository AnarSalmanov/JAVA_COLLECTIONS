package Maps;

import java.util.*;

public class Maps_looping {

    /**
     * Easiest way to iterate Maps we use for ech loop
     */

    public static void main(String[] args) {
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("url", "a.gmail.com");
        dataMap.put("username", "anar");
        dataMap.put("password", "noname1");
        dataMap.put("browser", "chrome");
        System.out.println(dataMap);

        /*  keySet --> returns Set with all the keys in the map
         *  values --> returns List with all the values in the map
         */


        //Looping Map
        for (String key : dataMap.keySet()) {
            System.out.println(key + " - " + dataMap.get(key));
        }
    }


}


