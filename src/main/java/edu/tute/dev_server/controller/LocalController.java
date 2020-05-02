package edu.tute.dev_server.controller;


import edu.tute.dev_server.pojo.ResponseMsg;
import edu.tute.dev_server.pojo.localRequest.UploadServiceRequest;
import edu.tute.dev_server.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalController {
    @Autowired
    LocalService localService;
    //申请加入集群
    @PostMapping("/uploadService")
    public ResponseMsg uploadService(@RequestBody UploadServiceRequest uploadServiceRequest){
        ResponseMsg responseMsg = new ResponseMsg();
        responseMsg = localService.uploadService(uploadServiceRequest);
        return responseMsg;
    }



}
