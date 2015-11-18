<%!public void jspInit() {
	 System.out.println ("jspInit()" +getServletConfig().getInitParameter("initParame")        ) ;
	 System.out.println ("jspInit()" +getServletConfig().getServletContext().getInitParameter("initParamContext")        ) ;
}
%>