package Day_2;

public class strings_props {
    public static void main(String[] args) {
        String s = new String("vamshi");
        String b = new String("vamshi");

//        String s = "vamshi";
//        String b = "vamshi";
        System.out.println(s.equals(b));
        if(s == b){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }

}
