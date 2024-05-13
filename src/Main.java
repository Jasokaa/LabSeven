/**
 * Program that represent Builder pattern
 */
public class Main {
    public static void main(String[] args) {
        TableBuilder tableBuilder = new ConcreteTableBuilder();
        TableDirector tableDirector = new TableDirector(tableBuilder);

        String[] columns = {"ID", "Name", "Age", "Role"};
        RelationalTable table = tableDirector.constructTable("Employees", columns);

        // Use the constructed table
        System.out.println("Table Name: " + table.getTableName());
        System.out.println("Columns: " + String.join(", ", table.getColumns()));
    }
}