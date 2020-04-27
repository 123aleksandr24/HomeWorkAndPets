import java.util.Scanner;

public class Main
{
    private static int minIncome = 200000;
    private static int maxIncome = 900000;

    private static int officeRentCharge = 140000;
    private static int telephonyCharge = 12000;
    private static int internetAccessCharge = 7200;

    private static int assistantSalary = 45000;
    private static int financeManagerSalary = 90000;

    private static double mainTaxPercent = 0.24;
    private static double managerPercent = 0.15;

    private static double minInvestmentsAmount = 100000;

    public static void main(String[] args)
    {
        while(true)
        {
            System.out.println("Введите сумму доходов компании за месяц " +
                "(от 200 до 900 тысяч рублей): ");
            //ввдоит в консоль интовое значение дохода компании
            int income = (new Scanner(System.in)).nextInt();

            //иначе переходит в раздел проверки нижней и высшей границы доходов
            if(!checkIncomeRange(income)) {
                continue;
            }

            //зарплата менджеров (процент от общей прибыли равный 15 проц)
            double managerSalary = income * managerPercent;
            //чистый доход (прибыль минус зп манагерам минус фиксированные расходы (294200)
            double pureIncome = income - managerSalary -
                calculateFixedCharges();
            //налог с основного дохода (24 проц умноженных на чистую прибыль)
            double taxAmount = mainTaxPercent * pureIncome;
            //доход после уплаты налогов
            double pureIncomeAfterTax = pureIncome - taxAmount;
            //может ли делать инвестиции (при чистом доходе от 100000)
            boolean canMakeInvestments = pureIncomeAfterTax >=
                minInvestmentsAmount;

            //JUSTDOIT
            double minimize = calculateFixedCharges()/(1-managerPercent);
            System.out.println(minimize + " общий доход чтобы компания осталась в нуле");
            double justDoIt = 100000/(1-managerPercent);
            System.out.println(justDoIt + " дополнительный доход c уклонением от налогов что бы инвестировать");
            double  justDoItTax = justDoIt/(1-mainTaxPercent );
            System.out.println(justDoItTax + " дополнительный доход с уплатой налогов что бы компания наконец сделала это!");
            double justDoItInvestment = minimize + justDoItTax;
            System.out.println(justDoItInvestment + " Компания может инвестировать!!!");

            System.out.println("Зарплата менеджера: " + managerSalary);
            System.out.println("Общая сумма налогов: " +
                (taxAmount > 0 ? taxAmount : 0));
            System.out.println("Компания может инвестировать: " +
                (canMakeInvestments ? "да" : "нет"));
            if(pureIncome < 0) {
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!");
            }
        }
    }

    private static boolean checkIncomeRange(int income)
    {

        if(income < minIncome)
        {
            System.out.println("Доход меньше нижней границы");
            return false;
        }
        if(income > maxIncome)
        {
            System.out.println("Доход выше верхней границы");
            return false;
        }
        return true;
    }

    private static int calculateFixedCharges()
    {
        return officeRentCharge +
                telephonyCharge +
                internetAccessCharge +
                assistantSalary +
                financeManagerSalary;
    }
}
/** есть постоянные расходы а есть плавающие в виде зп манагерам . То есть зп манагерам получается 15 проц,
 * а (calculateFixedCharges) постоянные расходы не должны превышать 100 проц минус 15 проц = 85 проц.
 * То есть (calculateFixedCharges) равный 294200 делим на 85 проц и умножаем на 100 проц и получаем точку
 * безубыточности 346 118 если выражать интовыми значениями.
 * Если вместе с инвестициями 100000 делим на (100 проц минус 15 = 85) умножаем на 100 = 117647
 * 117647 (100 проц минус 24 = 76) умножаем на сто = 154799
 * 154799 плюсуем к 346118 = 500917 в интовых значениях получаем точку когда компания может инвестировать.
 */