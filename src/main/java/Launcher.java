import databaseHandler.DatabaseHandler;

public class Launcher {
    public static void main(String[] args){
        DatabaseHandler data = new DatabaseHandler();
        System.out.println(data.querry("s"));
    }
}
