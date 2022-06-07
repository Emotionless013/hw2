public class Main {
    public static void main(String[] args) {
        //первая задача
        var x=1;
        byte q=12;
        short w=123;
        int e=1234;
        long r=12345L;
        float t=12345.6f;
        double y=123.456789;
        double A=x+q+w+e+r+t+y;
        System.out.println(A);
        //вторая задача
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight+secondBoxerWeight;
        System.out.println("Общий вес двух боксеров "+totalWeight+" кг");
        double weightDifference = firstBoxerWeight - secondBoxerWeight;
        System.out.println("Разница в весе боксеров "+weightDifference+" кг");
        //третья задача
        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;
        double breakfastWeight = 5*bananaWeight + 2*milkWeight + 2*iceCreamWeight + 4*eggWeight;
        System.out.println("Вес одной порции завтрака "+breakfastWeight+" г "+ "или " +breakfastWeight/1000 + " кг");
        //четвертая задача
        short weightToLoose = 7000;
        short firstProgram = 250;
        short secondProgram = 500;
        int firstResult = weightToLoose / firstProgram;
        int secondResult = weightToLoose / secondProgram;
        System.out.println("максимальное время похудения " + firstResult + " дней, минимальное время похудения " + secondResult + " дней, и среднее время " + (firstResult+secondResult)/2 + " дней.");
        //пятая задача
        double startMisha = 67_760;
        double startDenis = 83_690;
        double startChristina = 76_230;
        System.out.println("Миша теперь получает " + 1.1*startMisha + " рублей. Годовой доход вырос на " + startMisha*0.1*12 + " рублей.");
        System.out.println("Денис теперь получает " + 1.1*startDenis + " рублей. Годовой доход вырос на " + startDenis*0.1*12 + " рублей.");
        System.out.println("Кристина теперь получает " + 1.1*startChristina + " рублей. Годовой доход вырос на " + startChristina*0.1*12 + " рублей.");
    }
}