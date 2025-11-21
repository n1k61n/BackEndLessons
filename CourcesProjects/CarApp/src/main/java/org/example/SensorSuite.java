package org.example;

public class SensorSuite {
    private boolean cameraOk;
    private boolean radarOk;
    private boolean lidarOk;
    private boolean gpsOk;
    private boolean laneAssistOk;

    public SensorSuite(boolean cameraOk, boolean radarOk, boolean lidarOk, boolean gpsOk, boolean laneAssistOk) {
        this.cameraOk = cameraOk;
        this.radarOk = radarOk;
        this.lidarOk = lidarOk;
        this.gpsOk = gpsOk;
        this.laneAssistOk = laneAssistOk;
    }

    public boolean allOk() {
        return cameraOk && radarOk && lidarOk && gpsOk && laneAssistOk;
    }

    public void setSensor(String name, boolean status) {
        switch (name.toLowerCase()) {
            case "camera" -> cameraOk = status;
            case "radar" -> radarOk = status;
            case "lidar" -> lidarOk = status;
            case "gps" -> gpsOk = status;
            case "laneassist" -> laneAssistOk = status;
            default -> System.out.println("Yanlış sensor adı!");
        }
    }

    @Override
    public String toString() {
        return "Sensors{" +
                "camera=" + cameraOk +
                ", radar=" + radarOk +
                ", lidar=" + lidarOk +
                ", gps=" + gpsOk +
                ", laneAssist=" + laneAssistOk +
                '}';
    }
}
