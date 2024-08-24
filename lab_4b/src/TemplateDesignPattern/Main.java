package TemplateDesignPattern;

public class Main {
    public static void main(String[] args) {
        AuctionProcess standardAuction = new StandardAuction();
        standardAuction.runAuction();

        AuctionProcess reserveAuction = new ReserveAuction();
        reserveAuction.runAuction();
    }
}

