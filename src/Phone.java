public class Phone implements Comparable<Phone>{
    String name;
    String modelName;
    int price;

    public Phone(String name, String modelName, int price) {
        this.name = name;
        this.modelName = modelName;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Phone >>> " + modelName + " >>> price >>> " + price;
    }

    @Override
    public int compareTo(Phone o) {
        return this.price - o.price;
    }
}
