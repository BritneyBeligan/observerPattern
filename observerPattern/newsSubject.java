package observerPattern;

public interface newsSubject {
    public void attach(Subscribers client);
    public void detach(Subscribers client);
    public String notifySubscribers();

}
