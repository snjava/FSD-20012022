
<!-- <h1>This Is Html Header tag</h1> -->

<%
	int a = 10;
	for(int i = 1; i<=10; i++)
	{
		System.out.println(i);
	}

%>

<%-- <%= "Square is : "+a*a %> --%>

<%!
	int b = 20;
	public void demo() {
	
		System.out.println("This is custom method on  JSP page");
	}
%>

<br/>

<%
	int num = 5;

	for(int i = 1 ; i<=10; i++) {
%>
		<%= num + " * " + i + " = " + (num*i) %>
		<br/>
<%
	}
%>



























