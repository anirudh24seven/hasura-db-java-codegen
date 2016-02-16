package io.hasura.db.util;

public class Configuration {
    private String hasuraDBUrl;
    private String dbPrefix;
    private String packageName;
    private String dir;
    private String userName;
    private String password;

    public String getPackageName() {
        return this.packageName;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }

    public String getDir() {
        return this.dir;
    }

    public String getDBUrl() {
        return this.hasuraDBUrl;
    }

    public String getDBPrefix() {
        return this.dbPrefix;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public void setDBUrl(String dbUrl) {
        this.hasuraDBUrl = dbUrl;
    }

    public void setDBPrefix(String dbPrefix) {
        this.dbPrefix = dbPrefix;
    }
}
