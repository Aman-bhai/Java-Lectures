package in.learning.java.lec8Collections.Maps;

import java.util.EnumMap;
import java.util.Map;

public class enumMapDemo {
    public static void main(String[] args) {
// array of size same as enum
        // no hashing
        // ordinal.index is used
// Memory Efficient
Map<Day,String>map=new EnumMap<>(Day.class);
        map.put(Day.TUESDAY,"Gym");
        map.put(Day.MONDAY,"Walk");
        System.out.println(map);
    }
}


enum  Day{
    MONDAY,TUESDAY,WEDNESDAY

}