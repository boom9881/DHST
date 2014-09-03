<%@ include file="/html/init.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<% 
long satffId = ParamUtil.getLong(request, "satffId");

if(Validator.isNotNull(satffId)){
		
}
%>

<portlet:actionURL var="editUserActionURL">
	<portlet:param name="action" value="editUser" />
</portlet:actionURL>

<portlet:renderURL var="backURL" windowState="<%= WindowState.MAXIMIZED.toString() %>" >
	<portlet:param name="mvcPath" value="/html/satff/view.jsp" />
</portlet:renderURL>

<aui:form action="<%= backURL.toString() %>" method="post" name="fm">
	<liferay-ui:header
		backURL="<%= backURL %>"
		title='<%= (selUser == null) ? "add-user" : LanguageUtil.format(pageContext, "edit-user-x", HtmlUtil.escape(selUser.getFullName())) %>'
	/>
	
	<aui:input name="searchDep" label="部门" value="" />
	
	<input type="submit" value="submit" />
	
</aui:form>