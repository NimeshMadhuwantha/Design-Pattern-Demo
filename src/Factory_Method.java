
abstract class Food {
    abstract void prepare();
}


class Pizza extends Food {
    @Override
    void prepare() {
        System.out.println("Preparing Pizza");
    }
}


class Burger extends Food {
    @Override
    void prepare() {
        System.out.println("Preparing Burger");
    }
}


class FoodFactory {
    public Food createFood(String foodType) {
        if (foodType.equals("pizza")) {
            return new Pizza();
        } else if (foodType.equals("burger")) {
            return new Burger();
        } else {
            return null;
        }
    }
}


public class Factory_Method {
    public static void main(String[] args) {
        FoodFactory factory = new FoodFactory();
        Food food = factory.createFood("burger");
        if (food != null) {
            food.prepare();
        }
    }
}
