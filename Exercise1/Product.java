package Exercise1;
class Product {

    private String name;

    Product(String name) {
        this.name = name;
    }

    String name() {
        return name;
    }

    void rename(String newName) {
        name = newName;
    }
}