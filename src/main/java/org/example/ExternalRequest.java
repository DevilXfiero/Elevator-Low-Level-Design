package org.example;

public class ExternalRequest {

    private ElevatorDirection directionToGo;
    private int srcFloor;

    public ExternalRequest(ElevatorDirection direction, int floor) {
        this.directionToGo = direction;
        this.srcFloor = floor;
    }

    public ElevatorDirection getDirectionToGo() {
        return directionToGo;
    }

    public void setDirectionToGo(ElevatorDirection directionToGo) {
        this.directionToGo = directionToGo;
    }

    public int getSrcFloor() {
        return srcFloor;
    }

    public void setSrcFloor(int srcFloor) {
        this.srcFloor = srcFloor;
    }
}
