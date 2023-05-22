public class MySerializationDemo {
    public static void main(String[] args) {
            Serializer ser=new Serializer();
            Cat c = new Cat(12,"black");
            ser.SerializerCat(c);


            Deserializer des=new Deserializer();
            des.DeserializerCat();
    }
}
