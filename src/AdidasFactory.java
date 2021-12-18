public class AdidasFactory implements AbstractFactory<JavaKoodaaja> {

    @Override
    public JavaKoodaaja create() {

        JavaKoodaaja jasper = new Jasper();

        jasper.addToList(new AdduFarmarit());
        jasper.addToList(new AdduTPaita());
        jasper.addToList(new AdduKengat());
        jasper.addToList(new AdduLippis());

        return jasper;
    }
}
