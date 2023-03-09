public class Main {
    public static void main(String[] args) {
        String str = "Hello";//consume less memory
        String str2 = new String("Hello");//better not to use consume more memory
        System.out.println(str == str2);//to check the address of the string
        System.out.println(str.equals(str2));//to check the value of the string
        //string buffer
        StringBuffer name = new StringBuffer("Anjit");
        name.append("Gc"); //this will modify the string buffer
        System.out.println(name);
    }
}