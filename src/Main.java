public class Main {
    public static void main(String[] args) {
        FactoryProvider factoryProvider = new FactoryProvider();

        AbstractFactory typeOfFactory = factoryProvider.getFactory("bo$$");

        System.out.println(typeOfFactory.create().toString());

        typeOfFactory = factoryProvider.getFactory("adidas");

        System.out.println(typeOfFactory.create().toString());
    }
}
