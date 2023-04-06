/**
 * CoinSorterMachine Lab
 * @author 23sukhija
 * @version 03.30.23
 */

public class Dollar extends Coin{

    @Override
    public double getValue() {
        return 1;
    }

    @Override
    public String getName() {
        return "dollar";
    }
}
