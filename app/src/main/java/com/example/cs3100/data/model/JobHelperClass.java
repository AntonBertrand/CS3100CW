package com.example.cs3100.data.model;

public class JobHelperClass {

    String job_title, job_desc;

    public JobHelperClass() {
    }

    public JobHelperClass(String job_title, String job_desc) {
        this.job_title = job_title;
        this.job_desc = job_desc;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getJob_desc() {
        return job_desc;
    }

    public void setJob_desc(String job_desc) {
        this.job_desc = job_desc;
    }
}
