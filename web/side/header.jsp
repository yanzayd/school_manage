<%-- 
    Document   : header
    Created on : Aug 27, 2019, 11:37:21 AM
    Author     : root
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8" />
	<link rel="icon" type="image/png" href="../style/img/favicon.ico">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	<title>Light Bootstrap Dashboard by Creative Tim</title>

	<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />


    <!-- Bootstrap core CSS     -->
    <link href="../style/css/bootstrap.min.css" rel="stylesheet" />

    <!-- Animation library for notifications   -->
    <link href="../style/css/animate.min.css" rel="stylesheet"/>

    <!--  Light Bootstrap Table core CSS    -->
    <link href="../style/css/light-bootstrap-dashboard.css?v=1.4.0" rel="stylesheet"/>


    <!--  CSS for Demo Purpose, don't include it in your project     -->
    <link href="../style/css/demo.css" rel="stylesheet" />


    <!--     Fonts and icons     -->
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300' rel='stylesheet' type='text/css'>
    <link href="../style/css/pe-icon-7-stroke.css" rel="stylesheet" />
</head>
<body>


<div class="wrapper">
    <div class="sidebar" data-color="azure" data-image="../style/img/sidebar-5.jpg">

    <!--   you can change the color of the sidebar using: data-color="blue | azure | green | orange | red | purple" -->


        
        <div class="sidebar-wrapper">
            <div class="logo">
                <a href="http://www.creative-tim.com" class="simple-text">
                    SCHOOL MANAGEMENT
                </a>
            </div>

            <ul class="nav">
                 <li class="sub-menu">
                            <a href="#">
                              <i class="fa fa-book"></i>
                              <span>Auditoire</span>
                              </a>
                            <ul class="sub">
                              <li><a href="../side/auuser.jsp">Add new Auditoire</a></li>
                              <li><a href="../side/autable.jsp">liste of Auditoires</a></li>
                            </ul>
                <ul class="nav">
                 <li class="sub-menu">
                            <a href="#">
                              <i class="pe-7s-user"></i>
                              <span>Student</span>
                              </a>
                            <ul class="sub">
                              <li><a href="../side/stuser.jsp">Registration</a></li>
                              <li><a href="../side/sttable.jsp">liste of student</a></li>
                            </ul>
                            <ul class="nav">
                 <li class="sub-menu">
                            <a href="#">
                              <i class="pe-7s-user"></i>
                              <span>Teacher</span>
                              </a>
                            <ul class="sub">
                              <li><a href="../side/teauser.jsp">Add new Teacher</a></li>
                              <li><a href="../side/teatable.jsp">liste of Teachers</a></li>
                            </ul>
                            <ul class="nav">
                 <li class="sub-menu">
                            <a href="#">
                              <i class="pe-7s-user"></i>
                              <span>Titulaire</span>
                              </a>
                            <ul class="sub">
                              <li><a href="../side/tiuser.jsp">Add new Titulaire</a></li>
                              <li><a href="../side/titable.jsp">liste of Titulaires</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>