package solutions.session2.inheritance;

/**
 * User: junaid
 * Date: 30/10/2016
 */
public class ForestTest {

    /**
     * Write classes and create object to represents a rare forest of tree.
     * In the forest, we have apple, banana, yew and spruce trees.
     * Capture name, age and origin of each tree
     * Yew tree is 5000 years old, banana tree is 100 years old, while spruce tree is 10,000 years old
     * Use Inheritance to capture age, name and location of each tree.
     */

    public static void main(String[] args) {
        Tree yewTree = new YewTree("Yew",  "Wales", 5000);
        Tree bananaTree = new BananaTree("Banana", "Mozambique", 100);
        Tree spruceTree = new SpruceTree("Spruce", "Sweden", 10000);

        Forest forest = new Forest();
        forest.addTree(yewTree);
        forest.addTree(bananaTree);
        forest.addTree(spruceTree);

        forest.size(); // Should print Number of trees: 3
    }
}
