<html
xmlns="http://www.w3.org/1999/xhtml" 
   xmlns:h="http://java.sun.com/jsf/html"
   xmlns:f="http://java.sun.com/jsf/core"
   >
<body>
<h2>Hello World!</h2>
<h:dataTable value="#{demo.model.ModelList.mls}" var="mdl">
	<h:column>    				
      <f:facet name="header">Id</f:facet>    				
      #{mdl.id}
   </h:column>
   <h:column>    				
      <f:facet name="header">Name</f:facet>    				
      #{mdl.name}
   </h:column>
   <h:column>
      <f:facet name="header">ModerTime</f:facet>
      #{mdl.modertime}
   </h:column>
   <h:column>
      <f:facet name="header">Status</f:facet>
      #{mdl.status}
   </h:column>
   <h:column>
      <f:facet name="header">Publics</f:facet>
      #{mdl.publics}
   </h:column>
</h:dataTable>
</body>
</html>
