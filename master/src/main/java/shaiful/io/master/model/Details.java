package shaiful.io.master.model;

import java.util.List;

public class Details {
    String description;
    List<String> tags;
    String brand;
    int availableStock;

    public Details() {
    }

    public Details(String description, List<String> tags, String brand, int availableStock) {
        this.description = description;
        this.tags = tags;
        this.brand = brand;
        this.availableStock = availableStock;
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
