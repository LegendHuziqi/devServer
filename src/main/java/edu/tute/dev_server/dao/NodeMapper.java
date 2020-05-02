package edu.tute.dev_server.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface NodeMapper {

    //写入node表
    Integer putNode(@Param("nodeName") String nodeName, @Param("nodeLocation") String nodeLocation, @Param("nodeAbility") String nodeAbility, @Param("nodeCPUCore") String nodeCPUCore, @Param("nodeCPUFrequency") String nodeCPUFrequency, @Param("nodeRAM") String nodeRAM, @Param("nodeDisk") String nodeDisk, @Param("ip") String ip, @Param("runService") String runService);

}
