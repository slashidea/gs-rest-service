package com.slashidea.commuteassist.model;

public class DriveShareGroup {

    private Long userId;
    private Long driverId;
    private LatLon latLon;

    public DriveShareGroup() {
        
    }
    
    public DriveShareGroup(Long userId, Long driverId, LatLon latLon) {
        this.userId = userId;
        this.driverId = driverId;
        this.latLon = latLon;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public LatLon getLatLon() {
        return latLon;
    }

    public void setLatLon(LatLon latLon) {
        this.latLon = latLon;
    }

}
