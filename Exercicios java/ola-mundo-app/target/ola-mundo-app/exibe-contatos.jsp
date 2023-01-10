<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> 
<%@ page import="java.util.*, com.ola.mundo.app.dao.*,
com.ola.mundo.app.model.*"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
  <head>
    <meta hhtp-equiv="Content-Type" content="text/html" ; charset="UTF-8" />
    <title>Contatos</title>
  </head>

  <body>
    <table>
      !%----Criando instancia da classe ContatoDao---%
      !%----ContatoDao=new Contato();---%
      <jsp:useBean id="dao" class="com.ola.mundo.app.dao.ContatoDao"/>


    </table>
  </body>
</html>
