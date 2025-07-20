package in.learning.java.lec8Collections.Maps;

import java.util.WeakHashMap;

public class weekHashMap {
    public static void main(String[] args) {
        WeakHashMap<String,Image>whm=new WeakHashMap<>();
        whm.put(new String("img1"),new Image("Image 1"));
        whm.put(new String("img2"),new Image("Image 2"));
        whm.put(new String("img3"),new Image("Image 3"));
        whm.put(new String("img4"),new Image("Image 4"));
        System.out.println(whm);
        System.gc();
        simulateApplicationRunning();
        System.out.println("Cache after running (some entries may be cleared) : "+whm);

    }
    private static void simulateApplicationRunning(){
        try{
            System.out.println("Simulating Application Running...");
            Thread.sleep(10000);
        }
        catch(InterruptedException exception){
            System.out.println(exception.getMessage());
        }
    }
}

class Image{
    private String name;

    public Image(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                '}';
    }
}
