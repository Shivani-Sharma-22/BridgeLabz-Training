package FoodDeliveryOrderSystem;
import java.util.*;

public class DeliveryService {
    private Queue<Order> orders = new LinkedList<>();
    private List<Agent> agents = new ArrayList<>();
    private Map<Order,Agent> activeDelivery = new HashMap<>();

    public Queue<Order> getOrders() {
        return orders;
    }

    public void setOrders(Queue<Order> orders) {
        this.orders = orders;
    }

    public List<Agent> getAgents() {
        return agents;
    }

    public Map<Order, Agent> getactiveDelivery() {
        return activeDelivery;
    }

    public void setMap(Map<Order, Agent> activeDelivery) {
        this.activeDelivery = activeDelivery;
    }

    public void setAgents(List<Agent> agents) {
        this.agents = agents;
    }
    //Add agent
    public void addAgent(Agent agent){
        agents.add(agent);
    }
    // Place Order
    public void placeOrder(Order order){
        orders.add(order);
        System.out.println("Order placed! "+ order.getOrderId());
    }
    //assign Delivery
    public void assignDelivery() throws NoAgentAvailableException{
        if(orders.isEmpty()){
            System.out.println("No order to deliver.");
            return;
        }
        Order order = orders.poll();
        for(Agent agent:agents){
            if(agent.isAvailable()){
                agent.setAvailable(false);
                activeDelivery.put(order,agent);
                System.out.println("Order "+ order.getOrderId() +" Assigned to Agent "+agent.getAgentName());
                return;
            }
        }
        orders.add(order);
        throw new NoAgentAvailableException("No delivery agent available");
    }
  // Cancel Delivery
    public void cancelDelivery(int orderId){
        Iterator<Map.Entry<Order,Agent>>  iterator = activeDelivery.entrySet().iterator();

        while ((iterator.hasNext())){
            Map.Entry<Order,Agent> entry = iterator.next();
            if(entry.getKey().getOrderId() == orderId){
                Agent agent = entry.getValue();
                agent.setAvailable(true);
                iterator.remove();

                System.out.println("Order "+ orderId +" Cancelled");
                return;
            }
        }
        System.out.println("Order not found");
    }
    //Show Activate Deliveries
    public void viewActiveDeliveries(){
        if(activeDelivery.isEmpty()){
            System.out.println("No active Delivers");
            return;
        }
        for(Map.Entry<Order,Agent> entry: activeDelivery.entrySet()){
            System.out.println("Order "+ entry.getKey().getOrderId() +" -> Agent "+ entry.getValue().getAgentName());
        }
    }

}
