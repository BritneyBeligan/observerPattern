package observerPattern;
import java.util.*;

public class NewSubscriptionService {
    public static void main(String[] args){

        Subscribers briyi = new Subscribers();
        briyi.setClientName("Briyi");

        Subscribers eddy = new Subscribers();
        eddy.setClientName("Eddy");

        Subscribers romeo = new Subscribers();
        romeo.setClientName("Romeo");

        //add the subscribers to the subscribers list
        List<Subscribers> subscribersList = new ArrayList<>();
        subscribersList.add(briyi);
        subscribersList.add(eddy);
        subscribersList.add(romeo);

        news stock = new news();
        stock.setStockName("Hi There!");
        stock.setClientList(subscribersList);

        //notify the subscribers
        System.out.println("Updates! Hello Subscribers! The News industry buzzing with the latest News!");
        System.out.println(stock.notifySubscribers());

        // remove eddy, add Edward and notify updates
        stock.detach(eddy);

        Subscribers edward = new Subscribers();
        edward.setClientName("Edward");
        stock.attach(edward);

        // updates for the news
        System.out.println("Updates recently!");
        System.out.println(stock.notifySubscribers());
    }
}
