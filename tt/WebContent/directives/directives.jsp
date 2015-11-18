<%@ page import="scwcd.directives.BeanTO,scwcd.directives.Bean2TO" %> 
<%-- permite importar clases, si se separa por comas puedes hacer imports multiples--%>
<%@ page  isThreadSafe="true"%>
<%-- marca el servlet como single thread model--%>
<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%--define el MIME DEL CONTENIDO--%>
<%@ page isELIgnored="false"%>
<%-- habilita /deshabilita el EL tiene prioridad sobre descriptor--%>
<%@ page isErrorPage="false"%>
<%-- indica si es una pagina de error , puede usar el objecto exception--%>
<%@ page errorPage="error.jsp"%>
<%-- en caso de haber error manda a llamar a esta pagina--%>
<%@ page session="true"%>
<%-- implicit session object(created by container) is not available.. --%>
<%@ include file= "/directives/incluy.jsp"%>