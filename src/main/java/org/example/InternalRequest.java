package org.example;

public class InternalRequest {

    private int destFloor;
    private int srcElevatorId;

    public InternalRequest(int destFloor, int srcElevatorId) {
        this.destFloor = destFloor;
        this.srcElevatorId = srcElevatorId;
    }

    public int getDestFloor() {
        return destFloor;
    }

    public void setDestFloor(int destFloor) {
        this.destFloor = destFloor;
    }

    public int getSrcElevatorId() {
        return srcElevatorId;
    }

    public void setSrcElevatorId(int srcElevatorId) {
        this.srcElevatorId = srcElevatorId;
    }
}
