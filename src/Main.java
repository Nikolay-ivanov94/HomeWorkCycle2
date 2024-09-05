public class Main {
    public static void main(String[] args) {
        int salary = 0;
        int month = 0;
        while (salary <= 2_459_000) {
            salary = salary + 15000;
            int months = month++;
        }
        System.out.println("Месяц " + month + " сумма накоплений равна " + salary + " рублей");
        System.out.println();

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
            System.out.println();
        i = 10;
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        int totalPeople = 12_000_000;
        int year = 0;
        while (year < 10) {
            int newPeople = (totalPeople / 1000) * 17;
            int deadPeople = totalPeople / 1000 * 8;
            totalPeople = totalPeople + newPeople - deadPeople;
            year ++;
            System.out.println("Год " + year  + ", численность населения составляет " + totalPeople);
        }
        System.out.println();

        int money = 15000;
        int months = 0;
        while (money < 12000000) {
            money = money + money / 100 * 7;
            months++;
            System.out.println(months + " месяцев " + money + " рублей");
        }
        System.out.println();

        money = 15000;
        months = 0;
        while (money < 12000000) {
            money = money + money / 100 * 7;
            months++;
            if (months % 6 == 0)
            System.out.println(months + " месяцев " + money + " рублей");
        }
        System.out.println();

        int friday = 3;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + " -е число.Необходимо подготовить отчет");
            friday += 7;
        }
        System.out.println();

        int yearBefore = 2024 - 200;
        int yearAfter = 2024 + 100;

        for (year = 0; year < yearAfter ; year += 79) {
            if (year >= yearBefore){
                System.out.println(year);
            }
        }
    }
}