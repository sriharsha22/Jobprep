<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix='c' %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix='fmt' %>

<c:set var="theLocale" value="${not empty param.locale? param.theLocale : pageContext.request.locale }" scope="session" />
<fmt:setLocale value="${theLocale }"/>
<<fmt:bundle basename="tagdemo.i18n.resources.mylabels"></fmt:bundle>
<html>

<body>
<a href="i18n-messages.test.jsp?theLocale=en_US">English(US)</a>
|
<a href="i18n-messages.test.jsp?theLocale=te_IN">Telugu(IN)</a>
|
<a href="i18n-messages.test.jsp?theLocale=hi_IN">Hindi(IN)</a>
<br/>
<fmt:message key="label.greeting"/> <br/><br/>
<fmt:message key="label.firstName"/> <br/><br/>
<fmt:message key="label.lastName"/> <br/><br/>
<fmt:message key="label.message"/> <br/><br/>
</body>
</html>