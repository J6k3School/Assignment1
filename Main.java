import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ParentClass fC = new ParentClass();


        System.out.println("Chose your starter");
        System.out.println("bulbasaur");
        System.out.println("chimchar");
        System.out.println("piplup");


        String starter = scan.nextLine();
        InterfaceClass cStarter = ParentClass.ChoseStarter(starter);
    }
}