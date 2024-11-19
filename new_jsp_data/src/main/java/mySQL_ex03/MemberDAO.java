package mySQL_ex03;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;




//데이타 베이스 내에 테이블이 없어도 실행 안됨
//오라클 같은 경우 마지막에 commit; 해줘야 함.
public class MemberDAO {
    

	private PreparedStatement pstmt;
    private Connection con;
    private DataSource dataFactory;

    
    public MemberDAO() {
		
    	try {
    	    Context ctx = new InitialContext();
    	    Context envContext = (Context) ctx.lookup("java:/comp/env");
    	    dataFactory = (DataSource) envContext.lookup("jdbc/mysql");
    	} catch (Exception e) {
    	    e.printStackTrace();
    	}

    }
	
    
    public List<MemberVo> listMembers() {
        List<MemberVo> list = new ArrayList<>();
   
		try {
			con = dataFactory.getConnection();
			
			 String query = "SELECT * FROM member"; //테이블 명 데이타 베이스와 같아야 함//
	            System.out.println("prepareStatement"+query);
	           
	            pstmt=con.prepareStatement(query);
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

	
}
