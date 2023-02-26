public class Stringlearning {
    public static void main(String[] args) {
        String str1 ="Hello";
        str1.toUpperCase();
        String str2 =new String("Hello");
        System.out.println(str1.equals(str2));


        StringBuffer name = new StringBuffer("Sandeep");
        name.append("Panday");
        System.out.println(name);
    }
}
