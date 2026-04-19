public class constructor_deconstructor implements AutoCloseable{
    constructor_deconstructor(){
        System.out.println("Book acquired.");
    }

    @Override
    public void close(){
        System.out.println("Book closed");
    }

    public static void main(String[] args){
        try(constructor_deconstructor d = new constructor_deconstructor()){
            System.out.println("Reading book...");
        }
        System.out.println("Done.");
    }
}