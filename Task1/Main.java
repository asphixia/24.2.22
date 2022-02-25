public class Main {

    public static void main(String[] args) {
        printFunction();
        printString("hans");
        nameAndAge("william", 21);

    }
    public static void printFunction(){
        System.out.println(" ");
    }
    public static void printString(String name){
        System.out.println(name);
    }
    public static void nameAndAge(String name, int age){
        System.out.println("My name is "+name + ", I am " +age+ " years old");
    }
}
