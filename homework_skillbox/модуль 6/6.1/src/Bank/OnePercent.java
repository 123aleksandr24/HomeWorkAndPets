package Bank;

public class OnePercent extends Account{
    public OnePercent(double AllCoins, double money) {
        super(AllCoins,money);
    }

    public double getMoney(double money){
        AllCoins = AllCoins - money;
        return money * 0.99;
    }

    public void putMoney(double money){
        AllCoins = AllCoins + money ;
    }


}
