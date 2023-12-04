package observerPattern;

public class Subscribers implements SubscriberObserver{
    private String subscriberName;

    public String getClientName() {
        return subscriberName;
    }

    public void setClientName(String clientName) {
        this.subscriberName = clientName;
    }

    @Override
    public void updateStock(news stock) {

    }
}
