package bestOfDatabases;

import bestOfDatabases.FileManagement.WriteToXml;
import bestOfDatabases.database.Database;
import bestOfDatabases.database.table.Table;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Table> tables = new ArrayList<>();
        Database database = new Database(tables); // path- C:\\DB\\
        database.createTable("table1", "id,name,age" );
        database.createTable( "table2", "id, name" );
        tables.get(0).insert("3256598, Linoy Malol, 18");
    }
}
