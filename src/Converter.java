public class Converter {

    public void Converter(int sum) {

        double km;
        double kal;
        double kkal;
        km = sum * 75 / 100000;
        kal = sum * 50;
        kkal = kal / 1000;
        System.out.println("Пройденная дистанция (в км) " + km);
        System.out.println("Количество сожжённых килокалорий " + kkal);

    }


}
