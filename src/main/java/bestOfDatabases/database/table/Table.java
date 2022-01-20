package bestOfDatabases.database.table;

import bestOfDatabases.FileManagement.WriteToXml;
import bestOfDatabases.database.table.column.Column;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Table implements InsertRecord {
    private String nameOfTable;
    private List<Column> columns;

    public Table(String path, String nameOfTable, List<Column> columns) throws IOException {
        this.nameOfTable = nameOfTable;
        this.columns = columns;
        WriteToXml writeToXml = new WriteToXml();
        for (int i = 0; i < columns.size(); i++) {
            Files.createDirectories(Paths.get(path + nameOfTable + "\\" + columns.get(i).getName()));
            Path pathOfTable = Path.of(path + nameOfTable + "\\" + columns.get(i).getName());
            writeToXml.write(pathOfTable + "\\String", "");
        }
    }

    public String getNameOfTable() {
        return nameOfTable;
    }

    public List<Column> getColumns() {
        return columns;
    }

    @Override
    public void insert(String record) throws IOException {
        String[] columnsArr = record.split(",");
        WriteToXml writeToXml = new WriteToXml();
        for (int i = 0; i < this.columns.size(); i++) {
            writeToXml.write("C:\\DB\\" + this.nameOfTable + "\\" + this.columns.get(i).getName() + "\\String\\" , columnsArr[i]);
        }
    }

}
