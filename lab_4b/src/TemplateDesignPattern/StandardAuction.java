package TemplateDesignPattern;

public class StandardAuction extends AuctionProcess {
    @Override
    protected void startAuction() {
        System.out.println("Starting standard auction.");
    }

    @Override
    protected void acceptBids() {
        System.out.println("Accepting bids for standard auction.");
    }

    @Override
    protected void determineWinner() {
        System.out.println("Determining winner for standard auction.");
    }

    @Override
    protected void endAuction() {
        System.out.println("Ending standard auction.");
    }
}

