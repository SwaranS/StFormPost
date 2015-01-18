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
<div id ="outer">
  <select name="car" id="firstSelect">
    <option value="volvo">Volvo</option>
    <option value="saab">Saab</option>
    <option value="opel">Opel</option>
    <option value="audi">Audi</option>
  </select>
  <script language="javascript" type="text/javascript" defer>

    var counter = 0;
    var options = document.getElementById("firstSelect").innerHTML;
    function add_fields() {
      document.getElementById('some').innerHTML += '<span>Label: <select  name="dateFrom">'+options+'</select>' +
      'Label: <input type="text" name="dateFrom'+counter+'">' +
      'Label: <input type="text" name="dateTo'+counter+'"></br></span>';
      counter++;
    }

  </script>
  <input type="button" id="more_fields" onclick="add_fields();" value="Add More" />
  <div class="content" id="wrapper">
    Content
  </div>

<s:form action="list-demo" theme="simple">
  <table>
    <s:iterator value="model" status="rowStatus">
      <tr>
<div id ="some">
        <td><s:textfield name="model[%{#rowStatus.index}].value1" /></td>
        <td><s:textfield name="model[%{#rowStatus.index}].value2" /></td>
        <td><s:hidden name="model[%{#rowStatus.index}].value3" value="c2415-345-8563" /></td>
     </div> </tr>
    </s:iterator>
  </table>
  <s:submit/>
</s:form>
</body>
</html>