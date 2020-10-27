class Invoice{
    public long totalAmount ,totalRides;
    private String Id;
    public double averageFare;
    
    Invoice(String Id,long totalAmount, long totalRides, double avgFare)
    {
        this.Id=Id;
        this.totalAmount=totalAmount;
        this.totalRides=totalRides;
        this.averageFare=avgFare;
    }

    @Override
    public String toString()
    {
        return "UserId : " + Id + ", Total Fare : " + totalAmount + 
                ", Total number of rides: " + totalRides + ", Average Amount : " + averageFare;
    }
}
