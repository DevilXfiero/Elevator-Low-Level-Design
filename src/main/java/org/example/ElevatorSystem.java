package org.example;

public class ElevatorSystem {
    private static ElevatorSystem elevatorSystemInstance = null;
    private int noOfFloors;
    private int noOfElevators;
    private ExternalRequestProcessor externalRequestProcessor;
    private InternalRequestProcessor internalRequestProcessor;


    private ElevatorSystem() {}

    public static ElevatorSystem getElevatorSystem() {
        if(elevatorSystemInstance == null) {
            elevatorSystemInstance = new ElevatorSystem();
        }
        return  elevatorSystemInstance;
    }
    public void initializeElevatorSystem(int noOfFloors, int noOfElevators) {
        this.noOfElevators = noOfElevators;
        this.noOfFloors = noOfFloors;

        System.out.println("Initializing Elevator System with "  + noOfFloors + " floors and " + noOfElevators + " elevators!");
        System.out.println("------------------------------------------------------------------");

        ElevatorMgr elevatorMgr = ElevatorMgr.getElevatorMgr();
        elevatorMgr.initializeElevators(noOfElevators);

        externalRequestProcessor = new ExternalRequestProcessor();
        internalRequestProcessor = new InternalRequestProcessor();
    }

    public void setElevatorSelectionStrategy(ElevatorSelectionStrategy selectionStrategy) {
        externalRequestProcessor.setElevatorSelectionStrategy(selectionStrategy);
    }

    public void sendExternalRequest(ElevatorDirection direction, int srcFloor) {
        externalRequestProcessor.processExternalRequest(new ExternalRequest(direction, srcFloor));
    }

    public void sendInternalRequest(int destFloor, int elevatorId) {
        internalRequestProcessor.processInternalRequest(new InternalRequest(destFloor, elevatorId));
    }
}
