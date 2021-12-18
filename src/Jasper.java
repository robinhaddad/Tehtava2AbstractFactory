import java.util.ArrayList;

public class Jasper implements JavaKoodaaja {

    ArrayList<Object> objectList = new ArrayList<>();

    @Override
    public String toString() {
        return "mulla on päällä:" + objectList;
    }

    @Override
    public void addToList(Object o){
        this.objectList.add(o);
    }
}
