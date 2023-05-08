package com.pratik.irda.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
@Table(name="pendingStatusReports")
public class PendingStatusReport {
	@Id
	private int reportId;
	private String stage;
	@Positive
	@NotNull
	private int count;
	private String month;
	private int year;
	public PendingStatusReport(int reportId, String stage, int count, String month, int year) {
		super();
		this.reportId = reportId;
		this.stage = stage;
		this.count = count;
		this.month = month;
		this.year = year;
	}
	public PendingStatusReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PendingStatusReport [reportId=" + reportId + ", stage=" + stage + ", count=" + count + ", month="
				+ month + ", year=" + year + "]";
	}
	public int getReportId() {
		return reportId;
	}
	public void setReportId(int reportId) {
		this.reportId = reportId;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
