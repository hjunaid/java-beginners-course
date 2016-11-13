package solutions.session2.data_structures;

/**
 * User: junaid
 * Date: 30/10/2016
 */
public class Wine {
    private String name;

    public Wine(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "name='" + name + '\'' +
                '}';
    }
}
