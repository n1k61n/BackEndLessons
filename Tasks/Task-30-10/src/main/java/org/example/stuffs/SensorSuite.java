package org.example.stuffs;


/**
 * SensorSuite
 * Sahələr:
 * boolean cameraOk, boolean radarOk, boolean lidarOk, boolean gpsOk, boolean laneAssistOk
 * Metod:
 * boolean allOk() → autopilot üçün hamısı true olmalıdır.
 * Autopilot şərtləri
 * enableAutopilot() yalnız:
 * isRunning == true
 * sensors.allOk() == true
 */
public class SensorSuite {
    private boolean cameraOk;
    private boolean radarOk;
    private boolean lidarOk;
    private boolean gpsOk;
    private boolean laneAssistOk;



    public boolean allOK(){
        if(cameraOk && radarOk && lidarOk && gpsOk && laneAssistOk)
            return true;
        return false;
    }

    public void sensorLaneAssistOnOff() {
        this.laneAssistOk = !this.laneAssistOk;
    }

    public void sensorGpsOnOff() {
        this.gpsOk = !this.gpsOk;
    }

    public void sensorLidarOnOff(){
        lidarOk = !lidarOk;
    }

    public void sensorCameraOnOff(){
        cameraOk = !cameraOk;
    }

    public void sensorRadarOnOff(){
        radarOk = !radarOk;
    }

    public void setLaneAssistOk(boolean laneAssistOk) {
        this.laneAssistOk = laneAssistOk;
    }

    public void setGpsOk(boolean gpsOk) {
        this.gpsOk = gpsOk;
    }

    public void setLidarOk(boolean lidarOk) {
        this.lidarOk = lidarOk;
    }

    public void setRadarOk(boolean radarOk) {
        this.radarOk = radarOk;
    }

    public void setCameraOk(boolean cameraOk) {
        this.cameraOk = cameraOk;
    }
}
