<%-- 
    Document   : registro
    Created on : 24/03/2021, 12:17:31 p. m.
    Author     : carolina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="estiloregistro.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <form action="registrar" method="POST">
       <div id="cuadro">
           
                <p id="titulo"> Registrarse</P>
               
                <br/><br/>
        <label id="subtitulo1">Nombre</label>
        <br/><br/>
      <input placeholder="Usuario" type="username" name="username" value="" size="40" requerid>
    <br/><br/>
    <label id="subtitulo2">Apellido</label>
      <br/><br/>
      <input placeholder="Apellido" type="apellido"  name="apellido" value="" size="40" requerid>
          <br/><br/>
        <br/><br/>
         <label id="subtitulo4">Contraseña</label>
          <br/><br/>
             <input placeholder="Contraseña"type="password" name="password" value="" size="40" requerid/>
              <br/><br/>
              
        <br/><br/>
        
            <label id="subtitulo3">Email</label>
                                 <br/><br/>
                                 
    <input placeholder="Email" type="email" name="email" value="" size="40" requerid>
      
   
    
          <br/><br/>
         <input id="boton" type="submit" value="Registrarse">
     
   
     
      </div>
</form>
    </body>
</html>
