public class BonusMilesService {
    public int calculate(int price) {
        int miles;
        {
            miles = price / 20;
        }
        return miles;
    }
}
