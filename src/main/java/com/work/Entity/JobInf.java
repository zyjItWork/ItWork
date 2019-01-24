package com.work.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class JobInf {
    @Id
    private String busId;
    private String jobId;
    private String jobTitle;
    private String jobType;
    private String jobPlace;
    private String jobPhone;
    private String jobPNum;
    private String jobIntroduce;
    private String jobStatus;
    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getJobPlace() {
        return jobPlace;
    }

    public void setJobPlace(String jobPlace) {
        this.jobPlace = jobPlace;
    }

    public String getJobPhone() {
        return jobPhone;
    }

    public void setJobPhone(String jobPhone) {
        this.jobPhone = jobPhone;
    }

    public String getJobPNum() {
        return jobPNum;
    }

    public void setJobPNum(String jobPNum) {
        this.jobPNum = jobPNum;
    }

    public String getJobIntroduce() {
        return jobIntroduce;
    }

    public void setJobIntroduce(String jobIntroduce) {
        this.jobIntroduce = jobIntroduce;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }
}