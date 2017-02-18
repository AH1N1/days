<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>${COUNTER.getDaysLeft()} days left</title>
    <style>
        .days {
            background-color: lightgray;
            padding: 10px;
            width: 25%;
        }

        .day {
            background-color: #ebff73;

            padding: 5px;
            margin: 5px;
            /*display: inline-block;*/

        }

        li {
            color: rgba(36, 27, 30, 0.9);
            list-style: none;
            text-align: left;
            font-size: large;
            text-decoration-style: solid;
        }

        .mainWrapper {
            width: 80%;
            display: flex;
            /*justify-content: center;*/
            background-color: aqua;
            margin: auto;
            justify-content: flex-start;
            align-items: flex-start;
        }

        .banner {
            background-color: aquamarine;
            height: 300px;
            /*justify-content: center;*/
            /*align-items: center;*/
            display: flex;
            /*width:100%;*/
            /*display: block;*/

        }

        .bannerAndMailWrapper {
            /*display: flex;*/
            background-color: chocolate;
            width: 75%;
            height: auto;
        }

        .mail {
            background-color: #efefef;
            height: 100px;
            /*!*display: flex;*! to psuje wyswietlanie*/

            /*width: 100%;*/
            justify-content: center;
            /*align-items: center;*/

        }

        .nextDay {
            background-color: royalblue;
            width: 50%;

        }

        .daysLeft {
            background-color: darkgreen;
            width: 50%;
            font-size: 50px;
        }

        /*input [type="text"] {*/
        /*padding: 10px;*/
        /*border: none;*/
        /*border-bottom: solid 2px #c9c9c9;*/
        /*transition: border 0.3s;*/
        /*width: 100%;*/
        /*border-radius: 4px;*/
        /*}*/
        /*input [type="text"]:focus{*/
        /*border-bottom: solid 2px #969696;*/
        /*}*/

        input[type=text] {
            width: 90%;
            padding: 12px 20px;
            margin: 8px 0;
            display: block;
            border: none;
            border-bottom: solid 2px #c9c9c9;
            /*border-radius: 4px;*/
            box-sizing: border-box;

        }
        input[type=submit]{
            display: block;

        }
        form{
            display: flex;
            justify-content: center;
            align-items: stretch;
        }

        /*input[type="text"] {*/
            /*padding: 12px 20px;*/
            /*margin: 8px 0;*/
            /*display: inline-block;*/
            /*!*margin: 0;*!*/
            /*width: 100%;*/
            /*font-family: sans-serif;*/
            /*font-size: 18px;*/
            /*!*appearance: none;*!*/
            /*box-shadow: none;*/
            /*border-radius: 4px;*/
            /*!*padding: 10px;*!*/
            /*border: none;*/
            /*border-bottom: solid 2px #c9c9c9;*/
            /*transition: border 0.3s;*/
            /*box-sizing: border-box;*/
        /*}*/
        /*input[type="text"]:focus {*/
            /*border-bottom: solid 2px #969696;*/
        /*}*/



    </style>
    <script type="text/javascript">
        function send() {
            var http = new XMLHttpRequest();
            http.open("POST", "days.do", true);
            http.setRequestHeader("Content-type", "application/xml");
            http.send(document.MAIL);
            alert("You have subscribed to newsletter!")
            return false;
        }


    </script>
</head>
<body>

<div class="mainWrapper">

    <div class="days">
        <c:forEach var="day" items="${ALL_DAYS}" varStatus="status">

            <div class="day">
                <ul>
                    <li>id: <c:out value="${day.getId()}"></c:out></li>
                    <li>name: <c:out value="${day.getName()}"></c:out></li>
                    <li>date: <c:out value="${day.getDate()}"></c:out></li>
                    <li>description: <c:out value="${day.getDescription()}"></c:out></li>
                </ul>
            </div>
        </c:forEach>
        <%--<a href="http://localhost:8080/sda/days.do?id=${day.id}"><div style="background-color:red"><c:out value="${day.id}"></div></a>--%>
    </div>
    <%-----------------------------------------------banner---------------------------------------%>
    <div class="bannerAndMailWrapper">
        <div class="banner">
            <div class="daysLeft">
                <c:out value="${COUNTER.getDaysLeft()}"></c:out>
            </div>
            <div class="nextDay">
                <c:out value="${COUNTER.getNextDay()}"></c:out>
            </div>

        </div>
        <h2>Days:</h2>

        <%-----------------------------------------------mail---------------------------------------%>

        <div class="mail">
            <%-- dodac ponizej action="days.do" --%>
            <form method="post" modelAttribute="MAIL">
                <%--Subscribe to newsletter--%>
                <input type="text" name="mail" id="sendMail" placeholder="Subscribe to newsletter" ><br>
                <input type="submit" value="Submit">
            </form>
        </div>
        <div class="singleDay">
            tu pojedynczy dzien

        </div>
    </div>

</div>


<%--<form:form action="days.do" method="post" commandName="MAIL">--%>

<%--<table width="500" style="border-collapse: collapse;" border="0" bordercolor="#006699" cellspacing="2" cellpadding="2">--%>
<%--<tr>--%>
<%--<td width="100" align="right">Name</td>--%>
<%--<td width="150">--%>
<%--<input type="text" name="mail" />--%>
<%--<td align="left"/>--%>
<%--</tr>--%>

<%--<tr>--%>
<%--<td colspan="3" align="center">--%>
<%--<input type="submit" name="" value="save">--%>
<%--&nbsp;&nbsp;--%>
<%--<input type="reset" name="" value="Resetuj">--%>
<%--&nbsp;&nbsp;--%>
<%--</td>--%>
<%--</tr>--%>
<%--</table>--%>
<%--</form:form>--%>


<%--<table style="border-collapse: collapse;" border="1"--%>
<%--bordercolor="#006699" width="700">--%>
<%--<tr bgcolor="lightblue">--%>

<%--<th>Id</th>--%>
<%--<th>Name</th>--%>
<%--<th>Date</th>--%>
<%--<th>Description</th>--%>
<%--</tr>--%>
<%--<c:forEach var="day" items="${ALL_DAYS}" varStatus="status">--%>

<%--<tr>--%>

<%--<td><a href="http://localhost:8080/sda/days.do?id=${day.id}"><div><c:out value="${day.id}"></div></a></td>--%>
<%--<td><c:out value="${day.name}"></c:out></td>--%>
<%--<td><c:out value=""></c:out></td>--%>
<%--<td><c:out value="${day.description}"></c:out></td>--%>

<%--</tr>--%>
<%--<a href="http://localhost:8080/sda/days.do?id=${day.id}"><div style="background-color:red"><c:out value="${day.id}"></div></a>--%>
<%--</c:forEach>--%>
<%--</table>--%>

</body>
</html>