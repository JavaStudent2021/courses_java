package courses_java_Bases.x_7_Exceptions.task3;

public class Price {
    private String nameProduct;
    private String nameStory;
    private double cost;

    public Price(String nameProduct, String nameStory, double cost) {
        this.nameProduct = nameProduct;
        this.nameStory = nameStory;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Price{" +
                "nameProduct='" + nameProduct + '\'' +
                ", nameStory='" + nameStory + '\'' +
                ", cost=" + cost +
                '}';
    }
}
