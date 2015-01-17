<%--
  Created by IntelliJ IDEA.
  User: Home
  Date: 16/01/2015
  Time: 23:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>


</head>
<body>


<s:form action="list-demo" theme="simple">
  <table>
    <s:iterator value="model" status="rowStatus">
      <tr>
        <td><s:textfield name="model[%{#rowStatus.index}].value1" /></td>
        <td><s:textfield name="model[%{#rowStatus.index}].value2" /></td>
      </tr>
    </s:iterator>
  </table>
  <s:submit/>
</s:form>
</body>
</html>