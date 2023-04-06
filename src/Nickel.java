/**
 * CoinSorterMachine Lab
 * @author 23sukhija
 * @version 03.30.23
 */

public class Nickel extends Coin {
    @Override
    public double getValue() {
        return .05;
    }

    @Override
    public String getName() {
        return "nickel";
    }
}
