/**
 * Represents a relational table.
 */
public class RelationalTable {
    private String tableName;
    private String[] columns;

    /**
     * Constructs a new relational table.
     *
     * @param tableName The name of the table.
     * @param columns   An array of column names.
     */
    public RelationalTable(String tableName, String[] columns) {
        this.tableName = tableName;
        this.columns = columns;
        // Initialization logic
    }

    /**
     * Retrieves the name of the table.
     *
     * @return The name of the table.
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Retrieves the array of column names.
     *
     * @return An array of column names.
     */
    public String[] getColumns() {
        return columns;
    }
}