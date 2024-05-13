/**
 * Concrete implementation of TableBuilder interface.
 */
public class ConcreteTableBuilder implements TableBuilder {
    private String tableName;
    private String[] columns;

    /**
     * Constructs a ConcreteTableBuilder.
     */
    public ConcreteTableBuilder() {
        // Initialization logic
    }

    @Override
    public TableBuilder setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    @Override
    public TableBuilder setColumns(String[] columns) {
        this.columns = columns;
        return this;
    }

    @Override
    public RelationalTable build() {
        return new RelationalTable(tableName, columns);
    }
}

