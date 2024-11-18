package com.company.ex2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//데이타 베이스 내에 테이블이 없어도 실행 안됨
//오라클 같은 경우 마지막에 commit; 해줘야 함.
public class MemberDAO {
    
    private static final String driver = "oracle.jdbc.OracleDriver"; //오라클
    private static final String url = "jdbc:oracle:thin:@localhost:1521:XE"; //오라클 
    private static final String user = "kbm"; //db사용자명
    private static final String pwd = "kbm";//db사용자명

//    private Statement stmt;
    private PreparedStatement pstmt;
    private Connection con;
    
    public List<MemberVo> listMembers() {
        List<MemberVo> list = new ArrayList<>();
        
        try {
            connDB();
            String query = "SELECT * FROM member"; //테이블 명 데이타 베이스와 같아야 함//
            System.out.println("prepareStatement"+query);
            pstmt=con.prepareStatement(query);
            //ResultSet rs = stmt.executeQuery(query);삭제//
            ResultSet rs = pstmt.executeQuery(query);
            
            while (rs.next()) {
                String id = rs.getString("id");
                String pwd = rs.getString("pwd");
                String name = rs.getString("name");
                String email = rs.getString("email");
                Date joinDate = rs.getDate("joinDate");
                
                MemberVo vo = new MemberVo();  
                vo.setId(id);
                vo.setPwd(pwd);
                vo.setName(name);
                vo.setEmail(email);
                vo.setJoinDate(joinDate);
                list.add(vo);
            }
            
            rs.close();
            pstmt.close();  
            con.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    private void connDB() {
        try {
            Class.forName(driver);
            System.out.println("Oracle 드라이버 로딩 성공");
            con = DriverManager.getConnection(url, user, pwd);
            System.out.println("Connection 성공");

     //PreparedStatement//
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
