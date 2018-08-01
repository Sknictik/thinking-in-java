package thinkinginjava.block5.exercise8;

import thinkinginjava.Exercise;
import thinkinginjava.block5.exercise8.connection.Connection;
import thinkinginjava.block5.exercise8.connection.ConnectionManager;

import static net.mindview.util.Print.print;
import static thinkinginjava.TestUtils.assertTrue;

public class ObjectPoolExercise extends Exercise {
    @Override
    public String getId() {
        return "8";
    }

    @Override
    public String getName() {
        return "Managing pool of objects";
    }

    @Override
    public String getDescription() {
        return "Following the form of the example Lunch.java, create a class called " +
                "ConnectionManager that manages a fixed array of Connection objects." +
                " The client programmer must not be able to explicitly create" +
                " Connection objects, but can only get them via a static method in" +
                " ConnectionManager. When the ConnectionManager runs out of objects," +
                " it returns a null reference. Test the classes in main( ).";
    }

    @Override
    public int getDifficulty() {
        return 4;
    }

    @Override
    protected void run() {
        print("Testing connection manager");
        Connection newConnection;
        Connection[] retrievedConnections = new Connection[ConnectionManager.DEFAULT_POOL_SIZE];
        for (int i = 0; i < ConnectionManager.DEFAULT_POOL_SIZE; i++) {
            print("Attempting to retrieve new connection");
            newConnection = ConnectionManager.getNewConnection();
            assertTrue(newConnection != null);
            assertTrue(!contains(retrievedConnections, newConnection));
            retrievedConnections[i] = newConnection;
            print("New connection " + newConnection + " retrieved!");
        }
        print("Attempting to retrieve connection with empty pool");
        assertTrue(ConnectionManager.getNewConnection() == null);
        print("Failed to retrieve connection (connection is null)");
    }

    private boolean contains(Connection[] connections, Connection connectionToTest) {
        for (Connection connection : connections) {
            //Obviously you should use equals for objects but in this case we need to check that they are indeed refer to the same memory
            if (connection == connectionToTest) {
                return true;
            }
        }
        return false;
    }

}
