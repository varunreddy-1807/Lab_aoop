package Observer.java;

public abstract class AuctionProcess {
    public final void conductAuction() {
        startAuction();
        acceptBids();
        endAuction();
        determineWinner();
    }

    protected abstract void startAuction();
    protected abstract void acceptBids();
    protected abstract void endAuction();
    protected abstract void determineWinner();
}
