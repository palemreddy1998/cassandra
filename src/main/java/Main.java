import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        CassandraClient cassandraClient = new CassandraClient();
        cassandraClient.connect("127.0.0.1");
        ResultSet resultSet = (ResultSet) cassandraClient.executeQuery("select * from emp;", "reddyks");
        printResultToConsole(resultSet);
        cassandraClient.close();
    }

    private static void printResultToConsole(ResultSet result) {
        Iterator<Row> resultIterator = result.iterator();
        while(resultIterator.hasNext())
        {
            Row currentRow = resultIterator.next();
            System.out.println(currentRow);
        }
    }

}
