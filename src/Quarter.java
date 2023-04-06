/**
 * CoinSorterMachine Lab
 * @author 23sukhija
 * @version 03.30.23
*/

public class Quarter extends Coin{

    @Override
    public double getValue() {
        return .25;
    }

    @Override
    public String getName() {
        return "quarter";
    }
}
