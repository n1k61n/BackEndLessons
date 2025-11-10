package org.example;


import java.util.Stack;

public  class VersionManager {
    private int major;
    private int minor;
    private int patch;
    private Stack<int[]> history= new Stack<>();


    public VersionManager() {
        this("0.0.1");
    }

    public VersionManager(String version){
        if(version == null || version.trim().isEmpty()){
            version = "0.0.1";
        }
        String[] parts  = version.split("\\.");
        try{
            this.major = Integer.parseInt(parts[0]);
            this.minor = (parts.length > 1) ? Integer.parseInt(parts[1]) : 0;
            this.patch = (parts.length > 2) ? Integer.parseInt(parts[2]) : 0;

        }catch(Exception e){
            throw new RuntimeException("Error occured while parsing version!");
        }
    }

    public VersionManager major(){
        saveState();
        major++;
        minor = 0;
        patch = 0;
        return this;
    }

    public VersionManager minor(){
        saveState();
        this.minor++;
        this.patch = 0;
        return this;
    }

    public VersionManager patch(){
        saveState();
        this.patch++;
        return this;
    }


    public VersionManager rollback(){
        if (history.isEmpty()) {
            throw new RuntimeException("Cannot rollback!");
        }
        int[] prev = history.pop();
        major = prev[0];
        minor = prev[1];
        patch = prev[2];
        return this;
    }

    private void saveState() {
        history.push(new int[]{major, minor, patch});
    }

    public String release(){
        return "%s.%s.%s".formatted(major, minor, patch);
    }
}
