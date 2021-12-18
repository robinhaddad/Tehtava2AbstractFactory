public class FactoryProvider {

    public AbstractFactory getFactory(String typeOfFactory){
        if("adidas".equalsIgnoreCase(typeOfFactory)){
            return new AdidasFactory();
        }
        else if("bo$$".equalsIgnoreCase(typeOfFactory)){
            return new BossFactory();
        }
        else {
            System.out.println("wrong choice bro....");
            return null;
        }
    }
}
