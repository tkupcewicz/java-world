import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tymek on 30.12.2015.
 */
public abstract class Building extends PhysicalObject {
    private List connections;

    public List getConnections() {
        return connections;
    }

    public void setConnections(List connections) {
        this.connections = connections;
    }
}