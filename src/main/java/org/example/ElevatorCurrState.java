package org.example;

public class ElevatorCurrState {

    private int currFloor;
    private ElevatorDirection currDirection;
    private ElevatorStatus currStatus;

    public ElevatorCurrState() {
        currFloor = 0;
        currDirection = ElevatorDirection.IDLE;
        currStatus = ElevatorStatus.IDLE;
    }

    public int getCurrFloor() {
        return currFloor;
    }

    public void setCurrFloor(int currFloor) {
        this.currFloor = currFloor;
    }

    public ElevatorDirection getCurrDirection() {
        return currDirection;
    }

    public void setCurrDirection(ElevatorDirection currDirection) {
        this.currDirection = currDirection;
    }

    public ElevatorStatus getCurrStatus() {
        return currStatus;
    }

    public void setCurrStatus(ElevatorStatus currStatus) {
        this.currStatus = currStatus;
    }
}
