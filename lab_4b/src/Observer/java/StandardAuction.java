package Observer.java;

public class StandardAuction extends AuctionProcess {
    protected void startAuction() {
        System.out.println("Auction started. Accepting bids...");
    }

    @Override
    protected void acceptBids() {
        System.out.println("Bids are being accepted.");
    }

    @Override
    protected void endAuction() {
        System.out.println("Auction ended. No more bids accepted.");
    }

    @Override
    protected void determineWinner() {
        System.out.println("Winner determined based on highest bid.");
    }
}

