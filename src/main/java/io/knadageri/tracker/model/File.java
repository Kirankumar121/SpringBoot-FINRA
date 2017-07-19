package io.knadageri.tracker.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by knadageri on 7/16/17.
 */

@Entity
public class File {

    @Id
    private String fileId;
    private String custom;
    private String make;
    private int year;
    private int redlineSpeed;
    private float maxCapacity;
    private Date lastModifiedDate;

    
    

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getCustom() {
		return custom;
	}

	public void setCustom(String custom) {
		this.custom = custom;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getRedlineSpeed() {
		return redlineSpeed;
	}

	public void setRedlineSpeed(int redlineSpeed) {
		this.redlineSpeed = redlineSpeed;
	}

	public float getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(float maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	@Override
    public String toString() {
        return "Vehicle{" +
                "vin='" + fileId + '\'' +
                ", model='" + custom + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                ", redlineRpm=" + redlineSpeed +
                ", maxFuelVolume=" + maxCapacity +
                ", lastServiceDate=" + lastModifiedDate +
                '}';
    }




}
