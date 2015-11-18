<%
out.println("CODIGO JAVA , SE COPILA EN EL METODO SERVICE<BR>");
%>
<%!
public String metodoFueradeService(){
return "METODO DECLARADO CON DECLARATIONS<BR>";
}
%>
<%=metodoFueradeService()%>
<%="los objetos se pasan a toString();"%>