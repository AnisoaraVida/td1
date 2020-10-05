package td1.refactor.api.general;

public interface FoodProduct extends FoodConstituent, Product {
    default double calories_per_100g() {
        return ( weight() / 100) * calories_per_100g();
    }
}
