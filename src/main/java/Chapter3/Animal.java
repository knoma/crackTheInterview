package Chapter3;

/**
 * Created by knoma on 10/16/16.
 */
public abstract class Animal {
    private int order;
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean isOlderThan(Animal a){
        return  this.order < a.getOrder();
    }
}
