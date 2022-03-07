public class ParentClass {
    public static InterfaceClass ChoseStarter(String starter){
        if(starter.equalsIgnoreCase("bulbasaur")){
            return new ObjectClass();

        }else if(starter.equalsIgnoreCase("chimchar")) {
            return new ObjectClass2();

        }else if(starter.equalsIgnoreCase("piplup")){
            return new ObjectClass3();

        }else{
            System.out.println("E R R O R");
            return null;
        }
    }
}
