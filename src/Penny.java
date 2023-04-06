/**
 * CoinSorterMachine Lab
 * @author 23sukhija
 * @version 03.30.23
 */

public class Penny extends Coin{

    @Override
    public double getValue() {
        return .01;
    }

    @Override
    public String getName() {
        return "penny";
    }
}
