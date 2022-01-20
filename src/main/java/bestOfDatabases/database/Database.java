package bestOfDatabases.database;


import bestOfDatabases.database.table.Table;
import bestOfDatabases.database.table.column.Column;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Database implements CreateTable, DeleteTable, ShowTable {
    private List<Table> tables;

    public Database(List<Table> tables) {
        this.tables = tables;
    }

    public Object setTables(Table table) {
        return this.tables.add(table);
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    public void createTable(String nameOfTable, String columns) throws IOException {
        String[] columnsArr = columns.split(",");
        ArrayList<Column> columnsArrayList = new ArrayList<>();
        for (int i = 0; i < columnsArr.length; i++) {
            columnsArrayList.add(new Column<>(columnsArr[i]));
        }
        Table newTable = new Table("C:\\DB\\", nameOfTable, columnsArrayList);
        this.tables.add(newTable);
    }

    @Override
    public void deleteTable(String name) throws IOException {
        for (int i = 0; i < this.tables.size(); i++){
            if(this.tables.get(i).getNameOfTable() == name){
                this.tables.remove(tables.get(i));
            }
        }
        FileUtils.deleteDirectory(new File("C:\\DB\\", name));
    }

    @Override
    public void show(String name) {
    }
}
