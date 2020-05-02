package edu.tute.dev_server.service.impl;

import edu.tute.dev_server.dao.NodeMapper;
import edu.tute.dev_server.pojo.ResponseMsg;
import edu.tute.dev_server.pojo.localRequest.UploadServiceRequest;
import edu.tute.dev_server.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;

@Component
public class LocalServiceImpl implements LocalService {
    @Autowired
    NodeMapper nodeMapper;
    @Autowired LocalServiceImpl localService;

    @Override
    public ResponseMsg uploadService(UploadServiceRequest uploadServiceRequest) {
        ResponseMsg responseMsg = new ResponseMsg();
        makeShell(uploadServiceRequest);
        try {
            execshell();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return responseMsg;
    }

    public void makeShell(UploadServiceRequest uploadServiceRequest){
        try {
            FileWriter fw = new FileWriter("/home/legendhu/final/testFile/shell/upload.sh", false);
            fw.write("#!/bin/sh \n");
            //此处是中心服务器的ip
            fw.write("scp -r " + uploadServiceRequest.getPath() + " ubuntu@192.168.56.3:/home/ubuntu/userfiles/" + uploadServiceRequest.getServiceId());
            fw.flush();
            fw.close();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!111");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void execshell() throws IOException, InterruptedException {
        String shpath = "/home/legendhu/final/testFile/shell/upload.sh";
        Process ps = Runtime.getRuntime().exec(shpath);
        ps.waitFor();
    }

}
