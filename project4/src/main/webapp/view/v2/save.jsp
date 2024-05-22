<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- C태그추가 -->

<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
    <p>	
    	<!-- 자바 객체 출력 -->
        <c:out value="${member.no}"/> 번째 <c:out value="${member.userId}"/> 회원을 추가했습니다!
    </p>
</body>
</html>