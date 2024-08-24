package TemplateDesignPattern;

public class ReserveAuction extends AuctionProcess {
    @Override
    protected void startAuction() {
        System.out.println("Starting reserve auction.");
    }

    @Override
    protected void acceptBids() {
        System.out.println("Accepting bids for reserve auction.");
    }

    @Override
    protected void determineWinner() {
        System.out.println("Determining winner for reserve auction.");
    }

    @Override
    protected void endAuction() {
        System.out.println("Ending reserve auction.");
    }
}

