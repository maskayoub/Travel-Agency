<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Connexion</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="images/png" href="LoginTemplate/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="LoginTemplate/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="LoginTemplate/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="LoginTemplate/fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="LoginTemplate/vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="LoginTemplate/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="LoginTemplate/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="LoginTemplate/vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="LoginTemplate/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="LoginTemplate/css/util.css">
	<link rel="stylesheet" type="text/css" href="LoginTemplate/css/main.css">
<!--===============================================================================================-->

	<i><link rel="shortcut icon" href="LoginTemplate/images/favicon.ico" type="image/x-icon"></i>

</head>
<body>
	
	<div class="limiter">
		<div class="container-login100" style="background-image: url('LoginTemplate/images/bg-01.jpg');">
			<div class="wrap-login100">
				<form class="login100-form validate-form" action = "connexion.do" method = post>
					<span class="login100-form-logo">
<!-- 						<i class="zmdi zmdi-account-o"></i> -->
					<span class="iconify" data-icon="ls:login" data-inline="false"></span>
					</span>

					<span class="login100-form-title p-b-34 p-t-27">
						Se Connecter
					</span>

					<div class="wrap-input100 validate-input" data-validate = "Enter username">
						<input class="input100" type="text" name="email" placeholder="E-Mail">
						<span class="focus-input100" data-placeholder="&#xf207;"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="Enter password">
						<input class="input100" type="password" name="motdepasse" placeholder="Mot De Passe">
						<span class="focus-input100" data-placeholder="&#xf191;"></span>
					</div>
				


					<div class="container-login100-form-btn">
							<button class="login100-form-btn" type="submit" name = "action" value="connexion" >
								Connexion
							</button>
					</div>
					
					<h4>${err}</h4>

				</form>
			</div>
		</div>
	</div>
	

	<div id="dropDownSelect1"></div>
	
<!--===============================================================================================-->
	<script src="LoginTemplate/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="LoginTemplate/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="LoginTemplate/vendor/bootstrap/js/popper.js"></script>
	<script src="LoginTemplate/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="LoginTemplate/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="LoginTemplate/vendor/daterangepicker/moment.min.js"></script>
	<script src="LoginTemplate/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="LoginTemplate/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="LoginTemplate/js/main.js"></script>
	<script src="https://code.iconify.design/1/1.0.3/iconify.min.js"></script>
	<script src="https://code.iconify.design/1/1.0.3/iconify.min.js"></script>
	<script src="https://code.iconify.design/1/1.0.3/iconify.min.js"></script>
</body>
</html>