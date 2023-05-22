import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializer {

    FileInputStream fis;
    ObjectInputStream ois;

    public void DeserializerCat(){
            try{
                fis= new FileInputStream("C:\\Users\\Madhuka\\Documents\\GitHub\\Serialization_Java\\Output\\Cat.ser");
                ois=new ObjectInputStream(fis);
                Cat c= (Cat) ois.readObject();
                System.out.println(toString());


            }
            catch (Exception e){
                System.out.println("System occured"+e.getMessage());

            }
    }

}
