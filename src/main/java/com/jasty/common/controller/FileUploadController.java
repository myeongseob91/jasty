package com.jasty.common.controller;

import com.jasty.util.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018-02-25.
 */
@Controller
public class FileUploadController {

    @Resource(name="fileUtils")
    private FileUtils fileUtils;

    @RequestMapping(value="/imageFile")
    public String imageFileUpload(MultipartHttpServletRequest req){

        HashMap<String,Object> map = new HashMap<String,Object>();

        map.put("IDX","1");

        try {
            List<Map<String,Object>> list = fileUtils.parseInsertFileInfo(map,req);
            System.out.println(list.get(0).get("BOARD_IDX"));
            System.out.println(list.get(0).get("ORIGINAL_FILE_NAME"));
            System.out.println(list.get(0).get("STORED_FILE_NAME"));
            System.out.println(list.get(0).get("FILE_SIZE"));


        } catch (Exception e) {
            e.printStackTrace();
        }


        return "timeLine";
    }
}
