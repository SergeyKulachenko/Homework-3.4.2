import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        BmiService ind = new BmiService();

        float imb = ind.calculate(1.65f, 86);
        String result = String.format("%.2f", imb);
        System.out.println("Ваш ИМТ = " + result);

        float imb2 = ind.calculate(1.78f, 76.8f);
        System.out.printf("Ваш ИМТ = " + "%.2f", imb2);
        System.out.println();

        float imb3 = ind.calculate(1.68f, 66.8f);
        System.out.format("Ваш ИМТ = " + "%.2f", imb3);
        System.out.println();

        float imb4 = ind.calculate(1.68f, 60.8f);
        DecimalFormat res = new DecimalFormat("#.##");
        String ind2 = res.format(imb4);
        System.out.println("Ваш ИМТ = " + ind2);

    }
}
