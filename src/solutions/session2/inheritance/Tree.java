package solutions.session2.inheritance;

/**
 * User: junaid
 * Date: 30/10/2016
 */

public abstract class Tree {

    private String name;
    private String origin;
    private long age;

    public Tree(String name, String origin, long age) {
        this.name = name;
        this.origin = origin;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }
}
