<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<!DOCTYPE html>
<html lang="en">
<head>
	<title>Modification</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="tableTemplate/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="tableTemplate/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="tableTemplate/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="tableTemplate/vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="tableTemplate/vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="tableTemplate/vendor/perfect-scrollbar/perfect-scrollbar.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="tableTemplate/css/util.css">
	<link rel="stylesheet" type="text/css" href="tableTemplate/css/main.css">
<!--===============================================================================================-->
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">MD Voyages</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="indexAdmin.jsp">Accueil <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Link</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Dropdown
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Action</a>
          <a class="dropdown-item" href="#">Another action</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Something else here</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="#">Disabled</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Rechercher</button>
    </form>
  </div>
</nav>
	<div class="limiter">
		<div class="container-table100">
<!-- 		<form href="indexAdmin.jsp"> -->
<!-- 		<button type="button" class="btn btn-dark" align="left" >Accueil</button> -->
<!-- 		</form> -->
			<div class="wrap-table100">
				<div class="table100">
<!-- 					<div> -->
<!-- 					<a href="indexAdmin.jsp"><h3>Accueil</h3></a> -->
<!-- 					</div> -->
					<table>
						<thead>
							<tr class="table100-head">
								<th class="column1">N#</th>
								<th class="column2">Destinatiom</th>
								<th class="column3">Intitulé</th>
								<th class="column4">Type</th>
								<th class="column5">Prix</th>
								<th class="column6">Modifier</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items = "${modd.listeVoyages}" var = "r">
								<tr>
									<td class="column1">${r.num_voy}</td>
									<td class="column2">${r.dest_voy}</td>
									<td class="column3">${r.nom_voy}</td>
									<td class="column4">${r.type_voy}</td>
									<td class="column5">${r.prix_voy}</td>
									<td class="column6"><a href="modifier.do?action=modVoyage&ref1=${r.num_voy}"><img src="myButtons/edit-icon-png-0.png" width="30" height="30"  /></a></td>
								</tr>
							</c:forEach>	
								
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>


	

<!--===============================================================================================-->	
	<script src="tableTemplate/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="tableTemplate/vendor/bootstrap/js/popper.js"></script>
	<script src="tableTemplate/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="tableTemplate/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="tableTemplate/js/main.js"></script>

</body>
</html>