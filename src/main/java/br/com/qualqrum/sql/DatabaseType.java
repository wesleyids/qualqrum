package br.com.qualqrum.sql;

public enum DatabaseType {
    MYSQL("MySQL"),
    MSSQL("SQL Server"),
    POSTGRESQL("PostgreSQL"),
    ORACLE("Oracle"),
    MONGODB("MongoDB");

    DatabaseType(String description) {
        this.description = description;
    }

    private String description;

    public String description() {
        return this.description;
    }

}
