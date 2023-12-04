package observerPattern;
import java.util.List;
public class news implements newsSubject {

    private String stockName;
    private List<Subscribers> clientList ;

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public List<Subscribers> getClientList() {
        return clientList;
    }

    public void setClientList(List<Subscribers> clientList) {
        this.clientList = clientList;
    }

    @Override
    public void attach(Subscribers client) {
        clientList.add(client);
    }

    @Override
    public void detach(Subscribers client) {
        clientList.remove(client);
    }

    @Override
    public String notifySubscribers() {
        String output = new String();
        for(Subscribers client : clientList){
            output +=  "Jolly News! Hi, " + client.getClientName() + "!\n";
            output += stockName + " Breaking News Update! ";
        }
        return output;
    }

}
