package com.jasty.util;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.*;

/**
 * Created by Administrator on 2018-03-04.
 */
@Component("fileUtils")
public class FileUtils {
    //상대경로로 바꿔야함
    String filePath = "D:\\sqldeveloper\\intelij_sns\\jasty\\src\\main\\resources\\static\\uploadFiles\\";
    //String filePath = "C:\\Users\\Administrator\\IdeaProjects\\jasty\\src\\main\\resources\\static\\uploadFiles\\";

    public List<Map<String,Object>> parseInsertFileInfo(Map<String,Object> map, MultipartHttpServletRequest request) throws Exception{
        MultipartHttpServletRequest multipartHttpServletRequest = request;
        /*Iterator : 어떤 데이터들의 집합체에서 컬렉션으로부터 정보를 얻어올 수 있는 인터페이스
                     Map에 있는 데이터를 while문을 이용해 순차적으로 접근하기 위해 사용*/
        Iterator<String> iterator = multipartHttpServletRequest.getFileNames();

        MultipartFile multipartFile = null;
        String originalFileName = null;
        String originalFileExtension = null;
        String storedFileName = null;

        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        Map<String, Object> listMap = null;

        String boardIdx = (String)map.get("IDX");

        File file = new File(filePath);
        if(file.exists() == false){
            file.mkdirs();
        }

        while(iterator.hasNext()){
            multipartFile = multipartHttpServletRequest.getFile(iterator.next());
            if(multipartFile.isEmpty() == false){
                originalFileName = multipartFile.getOriginalFilename();
                originalFileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));
                storedFileName = CommonUtils.getRandomString() + originalFileExtension;

                file = new File(filePath + storedFileName);
                multipartFile.transferTo(file);

                listMap = new HashMap<String,Object>();
                listMap.put("BOARD_IDX", boardIdx);
                listMap.put("ORIGINAL_FILE_NAME", originalFileName);
                listMap.put("STORED_FILE_NAME", storedFileName);
                listMap.put("FILE_SIZE", multipartFile.getSize());
                list.add(listMap);
            }
        }
        return list;
    }

}
