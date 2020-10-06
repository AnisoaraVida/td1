package td1.refactor.api.general;

public interface Product extends FoodConstituent {
    double weight();

    double price();

    double calories();
}