<%-- 
    Document   : index
    Created on : 19/03/2021, 8:40:18 a. m.
    Author     : carolina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="stilo1.css" rel="stylesheet" type="text/css"/>
        <script src="https://www.google.com/recaptcha/api.js" async defer></script>
    </head>
    <body>
<form action="iniciarSesion" method="POST">
    <center>
     <div id="cuadro">
            <form>
                <p id="titulo"> Iniciar Sesiòn</P>
                <img class="avatar" src="folder/img/logo.png" alt=""/>
                <hr>
                <br/><br/>
                                <label id="subtitulo1">USUARIO</label>
                                 <br/><br/>
                                 
    <input placeholder="Usuario" type="username" name="username" value="" size="40" requerid>
     
         <br/><br/>
         <label id="subtitulo2">CONTRASEÑA</label>
          <br/><br/>
             <input placeholder="Contraseña"type="password" name="password" value="" size="40" requerid/>
   
         <br/><br/>
      <div class="g-recaptcha" data-sitekey="6LcVA4YaAAAAAA9DfVSOELViNmlSxdDe1itXV0hy"></div>
          <br/><br/>
         <input id="boton" type="submit" value="INGRESAR">
     
       <br/><br/>
      <a href="registro.jsp">crear cuenta</a>
      </div><!-- comment -->
      </center>
    </form>
    </body>
</html>
