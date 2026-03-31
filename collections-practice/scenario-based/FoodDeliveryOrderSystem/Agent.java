package FoodDeliveryOrderSystem;

public class Agent {
    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    private String agentName;
    private int agentId;

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    private boolean isAvailable;

    public Agent(String agentName, int agentId,boolean isAvailable){
        this.agentName = agentName;
        this.agentId = agentId;
        this.isAvailable = isAvailable;
    }
}
