package package1;
/*
 * This Java source file was auto generated by running 'gradle buildInit --type java-library'
 * by 'pradeep' at '3/12/17 10:49 PM' with Gradle 2.14.1
 *
 * @author pradeep, @date 3/12/17 10:49 PM
 */
public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {  
        System.out.println(new Library().getGreeting());
    }
}
