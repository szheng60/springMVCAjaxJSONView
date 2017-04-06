<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Spring MVC AJAX</title>
    <spring:url value="/resources/css/bootstrap.min.css" var="bootstrapcss"/>
    <spring:url value="/resources/js/jquery.1.10.2.min.js" var="jquery"/>
    <spring:url value="/resources/js/ajaxCall.js" var="ajacCall"/>
    <link href="${bootstrapcss}" rel="stylesheet">
    <script src="${jquery}"></script>
    <script src="${ajacCall}"></script>
</head>
<body>
<br>
<div>
    <form class="form-horizontal" id="form">
        <div class="form-group form-group-lg">
            <label class="col-sm-2 control-label">Username</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="username" placeholder="username"/>
            </div>
        </div>
        <div class="form-group form-group-lg">
            <label class="col-sm-2 control-label">Email</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="email" placeholder="email"/>
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-4">
                <div class="col-xs-6 text-left">
                    <button type="submit" id="search" class="btn btn-primary btn-lg">Search</button>
                </div>
                <div class="col-xs-6 text-right">
                    <button type="submit" id="detail" class="btn btn-primary btn-lg">Detail</button>
                </div>
            </div>
        </div>


    </form>
</div>
<div id="result"></div>
</body>
</html>