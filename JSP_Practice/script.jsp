 <%@ page contentType="text/html;charset=EUC-KR"%>
<html>
<head><title>��ũ��Ʈ ���</title></head>
<body>
  <h1>Script Example</h1>
 <%!
 	     String declaration = "Declaration";

 	public String decMethod(){
 	
 	 return declaration;
	}

%> 
 	 
 	 
<% 	String scriptlet = "Scriptlet";
    String comment = "Comment";

 	out.println("���尴ü�� �̿��� ��� : " + declaration + "<p/>");
 %>

 ������ ���1 : <%=declaration%><p/>
 ������ ���2 : <%=decMethod()%><p/>
 ��ũ��Ʈ���� ��� : <%=scriptlet%><p/>
<!-- �ּ��κ� -->
 <%  /* �ּ� 
    (������ �ּ�)
     */  
 %> 
 <%// �ּ�(���� �ּ�)%>
 </body>
 </html>