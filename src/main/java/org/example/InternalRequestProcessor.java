package org.example;

public class InternalRequestProcessor {

    public void processInternalRequest(InternalRequest internalRequest) {
        ElevatorMgr elevatorMgr = ElevatorMgr.getElevatorMgr();
        Elevator srcElevator = elevatorMgr.getElevator(internalRequest.getSrcElevatorId());
        srcElevator.moveToFloor(internalRequest.getDestFloor());
    }
}
