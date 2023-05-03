public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println("Спасибо, что пользуетесь нашими авиалиниями!");
        System.out.println("Вам начислено:");
        System.out.println(miles + " миль");
    }
}
