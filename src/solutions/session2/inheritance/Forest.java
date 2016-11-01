package solutions.session2.inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 * User: junaid
 * Date: 30/10/2016
 */
public class Forest {

    private List<Tree> trees = new ArrayList<>();

    public void addTree(Tree tree){
        trees.add(tree);
    }

    public int size(){
        return trees.size();
    }
}
