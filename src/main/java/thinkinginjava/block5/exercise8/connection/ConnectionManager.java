package thinkinginjava.block5.exercise8.connection;

public class ConnectionManager {

    public static final int DEFAULT_POOL_SIZE = 4;

    private static Connection[] connections;

    static {
        connections = new Connection[DEFAULT_POOL_SIZE];
        for (int i = 0; i < connections.length; i++) {
            connections[i] = new Connection();
        }
    }

    public static Connection getNewConnection() {
        return getAvailableConnection(connections);
    }

    private static Connection getAvailableConnection(Connection[] connectionPool) {
        for (int i = 0; i < connectionPool.length; i++) {
            if (connectionPool[i] != null) {
                Connection connection = connectionPool[i];
                connectionPool[i] = null;
                return connection;
            }
        }
        return null;
    }

}
