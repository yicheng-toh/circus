package circus.stuff;

<<<<<<< HEAD
public class Ladder extends Equipment {
=======
import circus.Asset;

public class Ladder extends Equipment implements Asset {
>>>>>>> upstream/master

    public Ladder(int purchasePrice) {
        super(purchasePrice);
    }

    @Override
    public int getValue() {
        return purchasePrice / 2;
    }
}
