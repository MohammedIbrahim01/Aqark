package com.abdelazim.x.aqark.favorites.model;

public class ApartmentDetails {
String address,area,numberOfRooms,numberOfBathrooms,floorType,finishingType,equipments;

    public ApartmentDetails(String address, String area, String numberOfRooms, String numberOfBathrooms,
                            String floorType, String finishingType, String equipments) {
        this.address = address;
        this.area = area;
        this.numberOfRooms = numberOfRooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.floorType = floorType;
        this.finishingType = finishingType;
        this.equipments = equipments;
    }

    public ApartmentDetails() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(String numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(String numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public String getFloorType() {
        return floorType;
    }

    public void setFloorType(String floorType) {
        this.floorType = floorType;
    }

    public String getFinishingType() {
        return finishingType;
    }

    public void setFinishingType(String finishingType) {
        this.finishingType = finishingType;
    }

    public String getEquipments() {
        return equipments;
    }

    public void setEquipments(String equipments) {
        this.equipments = equipments;
    }
}
