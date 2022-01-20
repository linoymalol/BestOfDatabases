package bestOfDatabases.database.table.column;

public class Column <T extends String> {
    String name;
    //T type;

    public Column(String name){
        this.name = name;
       // this.type = type;
    }

    public String getName() {
        return name;
    }
/*
    public T getType() {
        return type;
    }

 */
}
