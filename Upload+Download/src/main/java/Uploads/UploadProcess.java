package Uploads;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import fileupload.MyFileDAO;
import fileupload.MyFileDTO;

@WebServlet("/UploadProcess.do")  // 수정: URL 패턴 앞에 / 추가(빠트리면 실행 안될수 있음)
@MultipartConfig(
	location = "c:/temp", 
    maxFileSize = 1024 * 1024 * 1,  // 최대 파일 크기 1MB
    maxRequestSize = 1024 * 1024 * 10  // 최대 요청 크기 10MB
)
public class UploadProcess extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
        throws ServletException, IOException {
        try {
            // 파일을 업로드하고 이름을 변경하는 부분
            String saveDirectory = "D:\\kimbomin\\uploads"; // 받는 폴더명 입력
            String originalFileName = FileUtil.uploadFile(req, saveDirectory);
            String savedFileName = FileUtil.renameFile(saveDirectory, originalFileName);
            insertMyFile(req, originalFileName, savedFileName);
            resp.sendRedirect("FileList.jsp");  // 정상 처리 후 리다이렉션
        } catch (Exception e) {
            e.printStackTrace();
            req.setAttribute("errorMessage", "파일 업로드 오류");
            req.getRequestDispatcher("FileUploadMain.jsp").forward(req, resp);  // 오류 발생 시 포워딩
        }
    }

    protected void insertMyFile(HttpServletRequest req, String oFileName, String sFileName) {
        String title = req.getParameter("title");
        String[] cateArray = req.getParameterValues("cate");
        StringBuffer cateBuf = new StringBuffer();
        if (cateArray == null) {
            cateBuf.append("선택한 항목 없음");
        } else {
            for (String s : cateArray) {
                cateBuf.append(s + ",");
            }
        }

        MyFileDTO dto = new MyFileDTO();
        dto.setTitle(title);
        dto.setCate(cateBuf.toString());  // 수정: oFileName이 아닌 카테고리 값 할당
        dto.setOfile(oFileName);
        dto.setSfile(sFileName);

        MyFileDAO dao = new MyFileDAO();
        dao.insertFile(dto);  // DAO에 파일 정보 삽입
        dao.close();
    }
}
