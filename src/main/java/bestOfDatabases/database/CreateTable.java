package bestOfDatabases.database;

import bestOfDatabases.database.table.Table;
import bestOfDatabases.database.table.column.Column;

import java.io.IOException;
import java.util.List;

public interface CreateTable {
    void createTable(String nameOfTable, String columns) throws IOException;
}
