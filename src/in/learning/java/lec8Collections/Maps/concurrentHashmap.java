package in.learning.java.lec8Collections.Maps;

import java.util.concurrent.ConcurrentHashMap;

public class concurrentHashmap {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String>chm=new ConcurrentHashMap<>();
        // Java 7 -->segment based locking ---> 16 segments ---> smaller hashmaps
        // only the segment being written to or read from is locked
        // read : do not require locking unless there is a write operation happening on the same segment
        // write : lock

        // Java 8 ---> no segmentation
        // --->compare and swap approch --->no locking except resizing or collision
        // Thread A last saw --->x=45
        // Thread A work --->x to 50
        // if x is still 45 then change it to 50 else don't change and retry
        // put--->index

    }
}
