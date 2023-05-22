import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializer {

    FileOutputStream fos;
    ObjectOutputStream oos;


    public void SerializerCat(Cat c){

        try{
            fos=new FileOutputStream("C:\\Users\\Madhuka\\Documents\\GitHub\\Serialization_Java\\Output\\Cat.ser");
            oos=new ObjectOutputStream(fos);
            oos.writeObject(c);
            oos.flush();
            fos.close();
            oos.close();

        }
        catch(Exception e){
            System.out.println("system occured"+e.getMessage());
        }
    }

}
