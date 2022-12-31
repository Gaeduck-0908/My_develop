<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<%@ include file="layout/db_connect.jsp" %>
<%

	String sql="select custno, custname, phone, address, "
			+ " to_char(joindate, 'yyyy-mm-dd') joindate, grade, city "
			+ " from member_tbl_02 "
			+ " where custno="+request.getParameter("custno");
	
  PreparedStatement pstmt = conn.prepareStatement(sql);
  ResultSet rs = pstmt.executeQuery();
  rs.next();
  int num = rs.getInt(1);	  
%>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="./css/style.css?ver=1.1.3">
	<script type="text/javascript">
	   function checkValue() {
		   var cv = document.data;
		   if(!cv.custname.value) {
			       alert("회원성명을 입력하세요.");
			       cv.custname.focus();
			       return false; 
	       } else if(!cv.phone.value) {
				   alert("전화번호를 입력하세요.");
				   cv.phone.focus();
				   return false;
	   	   } else if(!cv.address.value) {
			 	  alert("주소를 입력하세요.");
			  	  cv.address.focus();
			 	  return false;
		   } else if(!cv.joindate.value) {
				   alert("가입일자를 입력하세요.");
				   cv.joindate.focus();
				   return false;
			} else if(!cv.grade.value) {
				   alert("고객등급을 입력하세요.");
				   cv.grade.focus();
				   return false;
			} else if(!document.data.city.value) {
				   alert("도시코드를 입력하세요.");
				   document.data.city.focus();
				   return false;
			}
	   }	
	   
	   function checkDel(custno){
			msg = "삭제하시겠습니까?"
			if(confirm(msg)!=0){
				location.href="delete.jsp?custno="+custno
				alert("삭제가 완료되었습니다")
			} else{
				alert("삭제가 취소되었습니다.")
				return
			}
		}
	   
	</script>
	<title>쇼핑물 회원관리</title>
</head>
<body>
	<header>
		<jsp:include page="layout/header.jsp"></jsp:include>
	</header>

	<nav>
		<jsp:include page="layout/nav.jsp"></jsp:include>
	</nav>

	<main id="section">
		<h2 class="title">홈쇼핑 회원 정보 수정</h2>
		<form name="data" action="update_p.jsp" method="post" onsubmit="return checkValue()">
		<table class="table_line">
			<tr>
				<th>회원번호(자동발생)</th>
				<td><input type="text" name="custno" value="<%= rs.getString(1) %>"
						    size="10" readonly></td>
			</tr>
			
			<tr>
				<th>회원성명</th>
				<td><input type="text" name="custname" value="<%= rs.getString(2) %>" size="10"></td>
			</tr>	
				
			
			<tr>
				<th>회원전화</th>
				<td><input type="text" name="phone" value="<%= rs.getString(3) %>" size="15"></td>
			</tr>
			
			
			<tr>
				<th>회원주소</th>
				<td><input type="text" name="address" value="<%= rs.getString(4) %>" size="25"></td>
			</tr>
			
			<tr>
				<th>가입일자</th>
				<td><input type="text" name="joindate" value="<%= rs.getString(5) %>" size="10"></td>
			</tr>
			
			<tr>
				<th>고객등급 A-VIP B-일반 C-직원</th>
				<td><input type="text" name="grade" value="<%= rs.getString(6) %>" size="10"></td>
			</tr>
			
			<tr>
				<th>도시코드</th>
				<td>
					<select name = "city" id = "city">
						<option value="">코드선택</option>
						<%
							sql = "select city, city_name from city_code_tbl_02";
						
							pstmt = conn.createStatement(sql);
							rs = pstmt.executeQuery(sql);
							while(rs.next()) {
							
						%>
						<% } %>
					</select>
				</td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="수정">
					<input type="button" value="조회"
										 onclick="location.href='member_list.jsp'">
					<input type="button" value="삭제" 
										 onclick="checkDel(<%= rs.getString("custno") %>);">
				</td>
			</tr>							 							 	
		</table>
		<script>
			
		</script>
		</form>
	</main>	
	
	<footer>
		<jsp:include page="layout/footer.jsp"></jsp:include>
	</footer>
</body>
</html>