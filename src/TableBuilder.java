/**
 * Interface for building a relational table.
 */
public interface TableBuilder {
    /**
     * Sets the name of the table.
     *
     * @param tableName The name of the table.
     * @return A reference to this TableBuilder instance.
     */
    TableBuilder setTableName(String tableName);

    /**
     * Sets the columns of the table.
     *
     * @param columns An array of column names.
     * @return A reference to this TableBuilder instance.
     */
    TableBuilder setColumns(String[] columns);

    /**
     * Builds the relational table.
     *
     * @return The constructed RelationalTable object.
     */
    RelationalTable build();
}