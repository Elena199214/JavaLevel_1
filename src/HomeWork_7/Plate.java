package HomeWork_7;

public class Plate {

        private int foodCount;
        private int amountFeed;



        public Plate(int foodCount) {
            this.foodCount = foodCount;
        }

        public int getFoodCount() {
            return foodCount;
        }

        public void setFoodCount(int foodCount) {
            this.foodCount = foodCount;
        }

        public void decreaseCount(int appetite) {
            if (foodCount < appetite) {
                System.out.println("В миске не хватает еды!");
            } else {
                foodCount -= appetite;
            }
        }

        public void info(){
            System.out.println(toString());
        }

        @Override
        public String toString() {
            return "Plate{" +
                    "foodCount=" + foodCount +
                    '}';
        }

        public void fillPlate(Plate plate, int amountFeed){
            foodCount += amountFeed;
            System.out.println("Насыпали корм в миску");

        }

}
