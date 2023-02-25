package shaiful.io.product_details.model;

import java.util.List;

public class ProductDetails {
    int id;
    String description;
    List<String> tags;
    String brand;
    int availableStock;

    public ProductDetails() {
    }

    public ProductDetails(int id, String description, List<String> tags, String brand, int availableStock) {
        this.id = id;
        this.description = description;
        this.tags = tags;
        this.brand = brand;
        this.availableStock = availableStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(int availableStock) {
        this.availableStock = availableStock;
    }
}
