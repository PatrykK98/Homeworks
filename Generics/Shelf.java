package BoxesAndShelves;

import java.util.ArrayList;
import java.util.List;

public class Shelf<T> {

    List<Box> shelf = new ArrayList<>();

    public void add(Box<? extends T> box){
        shelf.add(box);
    }
    public List<Box> getBoxes(){
        return shelf;
    }
}
