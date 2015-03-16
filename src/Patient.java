import javax.lang.model.element.Name;

/**
 * Created by jc258876 on 16/03/15.
 */
public class Patient {
    private String name;
    private int age;
    private double height, weight;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setDetails(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getBMI() {
        return this.weight / (height*height);
    }
}
