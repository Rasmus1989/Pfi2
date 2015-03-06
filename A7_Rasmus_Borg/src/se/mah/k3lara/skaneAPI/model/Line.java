package se.mah.k3lara.skaneAPI.model;

import java.util.Calendar;

public class Line {
	private String lineName;
	private boolean isTimingPoint;
	private String stopPoint;
	private int lineTypeId;
	private String lineTypeName;
	private String towards;
	
	//
	private String line;
	private Calendar depTime;
	private String depTimeDeviation;
	public Line() {
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public Calendar getDepTime() {
		return depTime;
	}
	public void setDepTime(Calendar depTime) {
		this.depTime = depTime;
	}
	public String getDepTimeDeviation() {
		return depTimeDeviation;
	}
	public void setDepTimeDeviation(String depTimeDeviation) {
		this.depTimeDeviation = depTimeDeviation;
	}
	public void setName(String lineName) {
		this.lineName = lineName;
	}
	public String getLineName(){
		return this.lineName;
	}
	public boolean isTimingPoint() {
		return isTimingPoint;
	}
	public void setIsTimingPoint(boolean isTimingPoint) {
		this.isTimingPoint = isTimingPoint;
	}
	public String getStopPoint() {
		return stopPoint;
	}
	public void setStopPoint(String stopPoint) {
		this.stopPoint = stopPoint;
	}
	public int getLineTypeId() {
		return lineTypeId;
	}
	public void setLineTypeId(int lineTypeId) {
		this.lineTypeId = lineTypeId;
	}
	public String getLineTypeName() {
		return lineTypeName;
	}
	public void setLineTypeName(String lineTypeName) {
		this.lineTypeName = lineTypeName;
	}
	public String getTowards() {
		return towards;
	}
	public void setTowards(String towards) {
		this.towards = towards;
	}
	
	
	
	
}