package lab3.cw3;

public abstract class Substring {

    public static int substring(String a, String b){
        int repeats = 1;
        String x = new String(a);
        while (true) {
            if(x.contains(b)){
                break;
            }
            else {
                x += a;
                repeats++;
            }
        }
        return repeats;
    }

    public static void substringMain() {
        String a = "abcd";
        String b = "cdabcdab";
        int x = substring(a,b);
        System.out.println("String: "+a);
        System.out.println("Substring: "+b);
        System.out.println("You have to to repeat substring "+x+" times.");
    }
}
