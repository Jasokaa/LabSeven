/**
 * The director class that orchestrates the building process.
 */
public class TableDirector {
    private TableBuilder tableBuilder;

    /**
     * Constructs a TableDirector with the specified TableBuilder.
     *
     * @param tableBuilder The TableBuilder to use for building the table.
     */
    public TableDirector(TableBuilder tableBuilder) {
        this.tableBuilder = tableBuilder;
    }

    /**
     * Constructs a relational table using the provided parameters.
     *
     * @param tableName The name of the table.
     * @param columns   An array of column names.
     * @return The constructed RelationalTable object.
     */
    public RelationalTable constructTable(String tableName, String[] columns) {
        return tableBuilder.setTableName(tableName)
                .setColumns(columns)
                .build();
    }
}