public class Calc {
    private String name;
    private String color;
    private int age;
    private float weight;
    private float height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public Calc(String name,
                String color,
                int age,
                float weight,
                float height) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
