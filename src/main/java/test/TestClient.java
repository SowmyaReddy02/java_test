package test;

public class TestClient {
    public static void main(String[] args) throws InvalidOrderException {
        OrderServiceUtil osu = new OrderServiceUtil();
        try {
            osu.addOrder(new Order(1,"sow",110,"cod"));
            osu.addOrder(new Order(2,"sow",110,"cod"));
            osu.addOrder(new Order(3,"sow",110,"cod"));
        } catch (InvalidOrderException e) {
            throw new InvalidOrderException("Invalid Data");
        }
        System.out.println("Search Order");
        osu.search(1);
        osu.findTotal();
    }
}
