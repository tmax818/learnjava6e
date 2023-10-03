package sandbox;

public class Main {

    public static void main(String[] args) {
        Tesla tesla = new Tesla("me", "x", 0, Tesla.Color.RED);
        Tesla tesla_random = new Tesla("me", "x", 0);
        System.out.println();
        Tesla tesla_random1 = new Tesla("me", "x", 0);
        System.out.println();
        Tesla tesla_random2 = new Tesla("me", "x", 0);
        System.out.println(tesla);
        System.out.println(tesla_random);
        System.out.println(tesla_random1);
        System.out.println(tesla_random2);
        System.out.println(Tesla.unixTime);
  
    }
    
}
