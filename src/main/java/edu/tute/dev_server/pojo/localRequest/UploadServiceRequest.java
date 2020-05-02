package edu.tute.dev_server.pojo.localRequest;

public class UploadServiceRequest {
    private String path;
    private String ServiceId;


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getServiceId() {
        return ServiceId;
    }

    public void setServiceId(String serviceId) {
        ServiceId = serviceId;
    }
}
