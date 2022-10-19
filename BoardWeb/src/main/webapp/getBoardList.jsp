<%@page import="java.util.List"%>
<%@page import="com.springbook.biz.board.impl.BoardDAO" %>
<%@page import="com.springbook.biz.board.BoardVO" %>
<%@page contentType="text/html; charset=UTF-8" %>

<%
   BoardVO vo = new BoardVO();
   BoardDAO boardDAO = new BoardDAO();
   List<BoardVO> boardList = boardDAO.getBoardList(vo);
%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>글 목록</title>
    <style>
        html, body, div, span, h1, h2, h3, p, a,  input, select, option, table, tr, th, td,search,input {
      margin: 0;padding: 0;border: 0;box-sizing: border-box; color: #333; texdt-decoration: none;}
        .wrap{max-width: 1000px; margin: 0 auto; padding: 50px;}
        .tit{text-align: center; font-size: 30px; font-weight: bold; background-color: pink; padding: 50px 0; } 
        .sub_tit{text-align: center; margin-bottom: 30px; margin-top: 20px;}
        .sub_tit a{color: #fff; background-color: pink; padding: 5px 20px; display: inline-block; text-decoration: none; border-radius: 20px;}
        .sub_tit a:hover{background-color: #888;}
        .sub_tit strong{font-weight: bold; font-size: 24px;}
        
        .board_table{width: 100%; border-collapse: collapse; text-align: center;}
        .b_list th, .b_list td{height: 50px; line-height: 50px;}
        .b_list tr{border-bottom: 1px solid #eaeaea; background-color: #fafafa;}
        .board_table .b_tit{background-color: #fff; border-top: 3px solid pink; border-bottom: 1px solid #ccc;  }
        .b_search{margin: 20px auto; width: 400px; height: 40px; border: none;}
        .b_search *{height: 40px; border-radius: 10px;}
        .b_search select{width: 90px; transform: translateY(-2px); border: 1px solid #ccc;}
        .b_search input:nth-of-type(1){background-color: #fafafa; border: 1px solid #ccc;}
        .b_search input:nth-of-type(2){width: 80px; cursor: pointer; background-color: pink; color: #fff;}
        .b_search input:nth-of-type(2):hover{background-color: #888;}
        .newWrite a{display: block; width: 100%; height: 40px; line-height: 40px;  text-align: center; background-color: pink; color: #111; margin-top: 20px; text-decoration: none;}
        .newWrite a:hover{background-color: #888;}
    </style>
</head>
<body>
   <div class="wrap">
    <h1 class="tit">HELL SPRING</h1>
    <h3 class="sub_tit"><strong>현정</strong>님 환영합니다.  <a href="logout_proc.jsp">Log-out</a></h3>
    
<!--    검색 시작-->
<form action="getBoardList.jsp" method="post">
    <table class="board_table b_search">
       <tr>
           <td>
               <select name="searchCondition">
                   <option value="TITLE">제목</option>
                   <option value="CONTENT">내용</option>
               </select>
               <input type="text" name="searchKeyword"/>
               <input type="submit" value="검색">
           </td>
        </tr>
    </table>
</form>
<!-- 검색 종료 -->
    <table class="board_table b_list">
        <tr class="b_tit">
            <th width="80">번호</th>
            <th width="520">제목</th>
            <th width="150">작성자</th>
            <th width="150">등록일</th>
            <th width="100">조회수</th>
        </tr>
        
        <% for(BoardVO board : boardList) { %>
        <tr>
            <td><%= board.getSeq() %></td>
            <td><a href="getBoard.jsp?seq=<%= board.getSeq() %>">
                <%= board.getTitle() %></a></td>
            <td><%= board.getWriter() %></td>
            <td><%= board.getRegDate() %></td>
            <td><%= board.getCnt() %></td>

        </tr>
        <% } %>
    </table>
<p class="newWrite"><a href="insertBoard.jsp">새 글 등록</a></p>
</div>
</body>
</html>