package fileupload;

import java.sql.Date;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MyFileDTO {
    private String idx;      // 파일 고유 ID
    private String title;    // 파일 제목
    private String cate;     // 파일 카테고리
    private String ofile;    // 원본 파일명
    private String sfile;    // 저장된 파일명
    private Date postdate;   // 업로드 날짜
}
