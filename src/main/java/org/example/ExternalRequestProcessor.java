package org.example;

public class ExternalRequestProcessor {

    private ElevatorSelectionStrategy elevatorSelectionStrategy;

    public ExternalRequestProcessor() {
        elevatorSelectionStrategy = new OddEvenElevatorSelStrategy();
    }

    public void setElevatorSelectionStrategy(ElevatorSelectionStrategy elevatorSelectionStrategy) {
        this.elevatorSelectionStrategy = elevatorSelectionStrategy;
    }

    public void processExternalRequest(ExternalRequest externalRequest) {
        int assignedElevatorId = elevatorSelectionStrategy.selectElevator(externalRequest);
        ElevatorMgr elevatorMgr = ElevatorMgr.getElevatorMgr();
        Elevator assignedElevator = elevatorMgr.getElevator(assignedElevatorId);
        assignedElevator.moveToFloor(externalRequest.getSrcFloor());
    }
}
