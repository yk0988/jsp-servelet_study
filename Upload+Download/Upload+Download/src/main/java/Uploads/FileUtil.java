package Uploads;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.Part;

public class FileUtil {
  
    public static String uploadFile(HttpServletRequest req, String sDirectory) throws ServletException, IOException {
        // 파일을 업로드하는 Part 객체
        Part part = req.getPart("ofile");
        
        // "content-disposition" 헤더에서 파일 이름을 추출
        String partHeader = part.getHeader("content-disposition");
        
        // "filename=" 이후에 파일명이 오는 부분을 추출
        String[] phArr = partHeader.split("filename=");
        String originalFileName = phArr[1].trim().replace("\"", "");

        if(!originalFileName.isEmpty()){
        	part.write(sDirectory+File.separator+originalFileName);
        }
        // 업로드된 파일의 이름을 반환
        return originalFileName;
    
}
    public static String renameFile(String sDirectory,String fileName) {
    		
        String ext = fileName.substring(fileName.lastIndexOf("."));
        String now = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String newFileName = now + ext;
        File oldFile=new File(sDirectory + File.separator + fileName);
        File newFile=new File(sDirectory + File.separator + newFileName);
        oldFile.renameTo(newFile);
        
        return newFileName;
        
    }
}