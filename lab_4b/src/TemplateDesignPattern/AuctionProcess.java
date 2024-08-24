package TemplateDesignPattern;

public abstract class AuctionProcess {
    public final void runAuction() {
        startAuction();
        acceptBids();
        determineWinner();
        endAuction();
    }

   
    protected abstract void startAuction();
    protected abstract void acceptBids();
    protected abstract void determineWinner();
    protected abstract void endAuction();
}
