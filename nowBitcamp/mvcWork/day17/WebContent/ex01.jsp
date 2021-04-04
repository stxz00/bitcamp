<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src = "js/jquery-1.12.4.js"></script>
<script type="text/javascript">

	var loginForm;

	$(function() {
	   loginForm = $('.login').html();
	   $('.login button').click(function() {
	      var id = $('#id').val();
	      var pw = $('#pw').val();
	      var param = {id:id, pw:pw};
	      
	      $.post('login.bit',param,function(data){
	    	 console.log(data);
	         if (data.login[0].loginResult) {
	            var id = data.login[0].loginID; 
	            $('.login').html('<p>login - '+id+'</p>');
	         }
	      });
	   });
	});

</script>

</head>
<body>
   <header>
      <h1>비트교육센터</h1>
      <div class="login">
      <c:if test = '${loginResult eq null}'>
         <label for="id">id</label>
         <input type="text" id="id"/>
         <label for="pw">pw</label>
         <input type="text" id="pw"/>
         <button>LOGIN</button>
        </c:if>
        
        <c:if test="${loginResult eq true}">
           <p>login - ${loginID }</p>
        </c:if>
      </div>
   </header>
   
   <nav>
      <a href = "ex01.bit">ex01.bit</a>
      <a href = "ex02.bit">ex02.bit</a>
   </nav>
   
   <section>
      <h2>first page</h2>
   </section>
</body>
</html>