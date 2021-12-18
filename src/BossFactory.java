public class BossFactory implements AbstractFactory<JavaKoodaaja>{

    @Override
    public JavaKoodaaja create() {

        JavaKoodaaja jasper = new Jasper();

        jasper.addToList(new BossFarmarit());
        jasper.addToList(new BossTPaita());
        jasper.addToList(new BossKengat());
        jasper.addToList(new BossLippis());

        return jasper;
    }
}
