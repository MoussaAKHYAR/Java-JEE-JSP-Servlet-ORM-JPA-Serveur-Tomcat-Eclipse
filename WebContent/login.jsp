<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 03/04/2020
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html class="no-js" lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Login</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- favicon
		============================================ -->
    <link rel="shortcut icon" type="image/x-icon" href="public/login/img/favicon.ico">
    <!-- Google Fonts
		============================================ -->
    <link href="https://public/login/fonts.googleapis.com/?family=Roboto:100,300,400,700,900" rel="stylesheet">
    <!-- Bootstrap css
		============================================ -->
    <link rel="stylesheet" href="public/login/css/bootstrap.min.css">
    <!-- Bootstrap css
		============================================ -->
    <link rel="stylesheet" href="public/login/css/font-awesome.min.css">
    <!-- owl.carousel css
		============================================ -->
    <link rel="stylesheet" href="public/login/css/owl.carousel.css">
    <link rel="stylesheet" href="public/login/css/owl.theme.css">
    <link rel="stylesheet" href="public/login/css/owl.transitions.css">
    <!-- animate css
		============================================ -->
    <link rel="stylesheet" href="public/login/css/animate.css">
    <!-- normalize css
		============================================ -->
    <link rel="stylesheet" href="public/login/css/normalize.css">
    <!-- main css
		============================================ -->
    <link rel="stylesheet" href="public/login/css/main.css">
    <!-- morrisjs css
		============================================ -->
    <link rel="stylesheet" href="public/login/css/morrisjs/morris.css">
    <!-- mCustomScrollbar css
		============================================ -->
    <link rel="stylesheet" href="public/login/css/scrollbar/jquery.mCustomScrollbar.min.css">
    <!-- metisMenu css
		============================================ -->
    <link rel="stylesheet" href="public/login/css/metisMenu/metisMenu.min.css">
    <link rel="stylesheet" href="public/login/css/metisMenu/metisMenu-vertical.css">
    <!-- calendar css
		============================================ -->
    <link rel="stylesheet" href="public/login/css/calendar/fullcalendar.min.css">
    <link rel="stylesheet" href="public/login/css/calendar/fullcalendar.print.min.css">
    <!-- forms css
		============================================ -->
    <link rel="stylesheet" href="public/login/css/form/all-type-forms.css">
    <!-- style css
		============================================ -->
    <link rel="stylesheet" href="public/login/style.css">
    <!-- responsive css
		============================================ -->
    <link rel="stylesheet" href="public/login/css/responsive.css">
    <!-- modernizr JS
		============================================ -->
    <script src="public/login/js/vendor/modernizr-2.8.3.min.js"></script>
</head>

<body>

<!--[if lt IE 8]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
<![endif]-->

<div class="color-line"></div>
<div class="container-fluid">
    <div class="row">
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <div class="back-link back-backend">
<!--                 <a href="index.jsp" class="btn btn-primary">Aller à l'accueil</a>
 -->            </div>
        </div>
    </div>
</div>
<div class="container-fluid">
    <div class="row">
        <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12"></div>
        <div class="col-md-4 col-md-4 col-sm-4 col-xs-12">
            <div class="text-center m-b-md custom-login">
                <h3>CONNECTEZ VOUS A L'APPLICATION</h3>
                
            </div>
            <div class="hpanel">
                <div class="panel-body">
                    <form action="Login" id="loginForm" method="post">
                        <div class="form-group">
                            <label class="control-label" for="username">Username</label>
                            <input type="text" placeholder="example@gmail.com" title="Please enter you username" required="" name="email" id="username" class="form-control">
                            <span class="help-block small">Your unique username to app</span>
                        </div>
                        <div class="form-group">
                            <label class="control-label" for="password">Password</label>
                            <input type="password" title="Please enter your password" placeholder="******" required=""  name="password" id="password" class="form-control">
                            <span class="help-block small">Yur strong password</span>
                        </div>
                      
                        <button class="btn btn-success btn-block loginbtn" type="submit">Se connecter</button>
                    </form>
                </div>
            </div>
        </div>
        <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12"></div>
    </div>
    
</div>

<!-- jquery
    ============================================ -->
<script src="public/login/js/vendor/jquery-1.11.3.min.js"></script>
<!-- bootstrap JS
    ============================================ -->
<script src="public/login/js/bootstrap.min.js"></script>
<!-- wow JS
    ============================================ -->
<script src="public/login/js/wow.min.js"></script>
<!-- price-slider JS
    ============================================ -->
<script src="public/login/js/jquery-price-slider.js"></script>
<!-- meanmenu JS
    ============================================ -->
<script src="public/login/js/jquery.meanmenu.js"></script>
<!-- owl.carousel JS
    ============================================ -->
<script src="public/login/js/owl.carousel.min.js"></script>
<!-- sticky JS
    ============================================ -->
<script src="public/login/js/jquery.sticky.js"></script>
<!-- scrollUp JS
    ============================================ -->
<script src="public/login/js/jquery.scrollUp.min.js"></script>
<!-- mCustomScrollbar JS
    ============================================ -->
<script src="public/login/js/scrollbar/jquery.mCustomScrollbar.concat.min.js"></script>
<script src="public/js/scrollbar/mCustomScrollbar-active.js"></script>
<!-- metisMenu JS
    ============================================ -->
<script src="public/login/js/metisMenu/metisMenu.min.js"></script>
<script src="public/login/js/metisMenu/metisMenu-active.js"></script>
<!-- tab JS
    ============================================ -->
<script src="public/login/js/tab.js"></script>
<!-- icheck JS
    ============================================ -->
<script src="public/login/js/icheck/icheck.min.js"></script>
<script src="public/login/js/icheck/icheck-active.js"></script>
<!-- plugins JS
    ============================================ -->
<script src="public/login/js/plugins.js"></script>
<!-- main JS
    ============================================ -->
<script src="public/login/js/main.js"></script>
</body>

</html>