package com.xoriant.form_report_server.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "reqs")  // Define MongoDB Collection Name
public class Req {

    @Id
    @JsonProperty("req_id")  // Explicitly map JSON field "req_id"
    private String reqId;

    @JsonProperty("project")
    private String project;

    @JsonProperty("location")
    private String location;

    @JsonProperty("client_manager")  // Explicitly map JSON field "client_manager"
    private String clientManager;

    @JsonProperty("tech_stack")  // Explicitly map JSON field "tech_stack"
    private String techStack;

    @JsonProperty("position")
    private String position;

    @JsonProperty("current_status")  // Explicitly map JSON field "current_status"
    private String currentStatus;

    // Constructors, Getters, and Setters
    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getClientManager() {
        return clientManager;
    }

    public void setClientManager(String clientManager) {
        this.clientManager = clientManager;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }
}
