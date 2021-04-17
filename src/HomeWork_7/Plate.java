package HomeWork_7;

public class Plate {

        private String name;
        private int foodCount;
        private int amountFeed;


    public Plate(int foodCount) {
        this.name = "Самая большая";
        this.foodCount = foodCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoodCount() {
            return foodCount;
        }

        public void setFoodCount(int foodCount) {
            this.foodCount = foodCount;
        }

        public void decreaseCount(int appetite) {
                foodCount -= appetite;
            }

        public void info(){
            System.out.println(toString());
        }

    @Override
    public String toString() {
        return "Plate{" +
                "name='" + name + '\'' +
                ", foodCount=" + foodCount +
                '}';
    }

    public void fillPlate(Plate plate, int amountFeed){
            foodCount += amountFeed;
            System.out.println("Насыпали корм в миску");

        }

}
