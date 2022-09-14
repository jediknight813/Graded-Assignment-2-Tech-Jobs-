package org.launchcode.techjobs.oo;

import java.util.Objects;
import java.util.Random;

public class Job {

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public int getId() {
        return id;
    }

    private int id;
    private static int nextId = 1;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    private String name;
    private Employer employer;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;



    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;

        Job location = (Job) o;
        return getId() == location.getId();
    }


    public String getValue(String checkValue) {
        if (checkValue != "") {
            return checkValue;
        }
        else {
            return "Data not available";
        }
    }

    @Override
    public String toString() {
        // OOPS! This job does not seem to exist.


        return  "\nID: "+getValue(String.valueOf(this.getId())) + "\n" +
                "Name: "+getValue(String.valueOf(this.getName())) +"\n" +
                "Employer: "+getValue(String.valueOf(this.getEmployer().getValue()))+"\n" +
                "Location: "+getValue(String.valueOf(this.getLocation().getValue()))+"\n" +
                "Position Type: "+getValue(String.valueOf(this.getPositionType().getValue()))+"\n" +
                "Core Competency: "+getValue(String.valueOf(this.getCoreCompetency().getValue()))+"\n";
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
