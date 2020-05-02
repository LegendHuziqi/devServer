package edu.tute.dev_server.service;

import edu.tute.dev_server.pojo.ResponseMsg;
import edu.tute.dev_server.pojo.localRequest.UploadServiceRequest;
import org.springframework.stereotype.Service;

@Service
public interface LocalService {
    ResponseMsg uploadService(UploadServiceRequest uploadServiceRequest);
}
