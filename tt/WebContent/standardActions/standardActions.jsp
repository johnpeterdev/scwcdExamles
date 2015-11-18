<%-- EJEMPLOS DE CUANDO NO VIENE EL OBJETO EN EL SCOPE--%>
<jsp:useBean id="pruebaBeanTO" class="scwcd.directives.BeanTO" type="scwcd.directives.BeanTO">
<jsp:setProperty property="nombre" name="pruebaBeanTO" value="SE EJECUTA LO QUE ESTA DENTRO DEL CONSTRUCTOR POR
	SER UN OBJETO NUEVO" />
</jsp:useBean>
<%-- class , el tipo de objeto no debe tener constructor con argumentos y no debe ser una clase abstracta
	 id , el id para referenciarlo
	 type, el tipo sirve para polimorfismo, si usea type pero no class el objeto debe existir en el request
	       si no viene en el request y no se usa class , no se ejecut el body
	 el body no se ejecuta si el objeto viene en el scope, solo se ejecuta cuando se crea un objeto nuevo
--%>
<jsp:getProperty name="pruebaBeanTO"  property="nombre" />
<%-- name es el id de use bean , y property la propiedad que queres ver --%>
<BR>
<jsp:setProperty property="nombre" name="pruebaBeanTO" value="CAMBIO VALOR APROPIEDAD " />
<BR>
<jsp:getProperty name="pruebaBeanTO"  property="nombre" />

<%-- EJEMPLOS DE CUANDO NO VIENE EL OBJETO EN EL SCOPE--%>
<BR>
<%-- EJEMPLOS DE CUANDO VIENE EL OBJETO EN EL SCOPE--%>
<jsp:useBean  id="pruebaBeanRequestTO" scope="request" class="scwcd.directives.BeanTO" type="scwcd.directives.BeanTO" >
<jsp:setProperty property="nombre" name="pruebaBeanRequestTO" value="NO SE EJECUTA SI VIENE EN EL REQUEST" />
</jsp:useBean>
<BR>
<jsp:getProperty name="pruebaBeanRequestTO"  property="nombre" />	 
<BR>
<jsp:setProperty property="nombre" name="pruebaBeanRequestTO" value ="<%= request.getAttribute("vengoenparametros") %>"/>
You cannot use both the param and value attributes in a jsp:setProperty tag. 
<jsp:getProperty name="pruebaBeanRequestTO"  property="nombre" />

<BR>
<jsp:setProperty property="nombre" name="pruebaBeanRequestTO" param ="parametro"/>
<%-- param asigna el valor de un parametro --%>
<BR>
<jsp:getProperty name="pruebaBeanRequestTO"  property="nombre" />


<BR>
<jsp:setProperty property="*" name="pruebaBeanRequestTO"/>
<%--hace el mapeo automatico de los parametros que se llamen igual que las propiedades del objeto --%>
<BR>
<jsp:getProperty name="pruebaBeanRequestTO"  property="nombre2" />
<BR>
<jsp:include page="incluy.jsp" /> 



