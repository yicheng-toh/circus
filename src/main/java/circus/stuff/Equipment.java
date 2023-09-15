package circus.stuff;

<<<<<<< HEAD
public abstract class Equipment {
=======
import circus.Asset;

public abstract class Equipment implements Asset {
>>>>>>> upstream/master
    protected int purchasePrice;

    public Equipment(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}
