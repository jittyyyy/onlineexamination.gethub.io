<%@page contentType="text/html" pageEncoding="UTF-8"%>
<?php
session_start();
$email=$_SESSION['email'];
require('./model/dbconnection.php');
	$sqlSelect="SELECT * FROM login_details where email='$email'";
	$data=mysql_query($sqlSelect);
	if(mysql_num_rows($data)>0)
	{
		$row=mysql_fetch_array($data);
		




?>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Skill Meter-Change Password</title>

    
    <link href="css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="css/animate.css">
	<link href="css/prettyPhoto.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet" />	
    
  </head>
  <body>
	<header>		
		<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
			<div class="navigation">
				<div class="container">					
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse.collapse">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<div class="navbar-brand">
							<a href="index.html"><h1><span>Online </span>Exame</h1></a>
						</div>
					</div>
					
					<div class="navbar-collapse collapse">							
						<div class="menu">
							<ul class="nav nav-tabs" role="tablist">
								<li role="presentation"><a href="welcome.jsp">Home</a></li>
								<li role="presentation"><a href="viewprofile.jsp" >Profile</a></li>
								<li role="presentation"><a href="index.html">Logout</a></li>						
								
														
							</ul></div>
					</div>						
				</div>
			</div>	
		</nav>		
	</header>
	
	<div id="breadcrumb">
		<div class="container">	
			<div class="breadcrumb">							
				<li><a href="welcome.jsp">Home</a></li>
				<li>Change Password</li>			
			</div>		
		</div>	
	</div>
	
	<div class="services">
		<div class="container">
			<h3 align="center">Change Password</h3>
			<hr>
			
			
			<div class="col-md-6">
				<div class="media">
				
				<form action="./model/changepass.jsp" method="post">
				
				<table width='900'>
				<tr>
						<td><span style="color:#6e6e6e;">New Password</span></td>
						<td>
							<span style="color:#6e6e6e;">
							<INPUT TYPE="password" NAME="password" VALUE="" >
							 </span>
						</td>
					</tr>
					<tr>
						<td><span style="color:#6e6e6e;">Confirm New Password</span></td>
						<td>
							<span style="color:#6e6e6e;">
							<INPUT TYPE="password" NAME="confirmpassword" VALUE="" >
							 </span>
						</td>
					</tr>
					<tr>
					<td>
					<div class="text-center">
					<button type="submit" name="btn_changepass" class="btn btn-primary btn-lg" required="required">Save New Password</button></div>
					</td>
					</tr>
				</table>
				                        
				</form>
					
				</div>
			</div>
		</div>
	</div>	
	
	<div class="sub-services">
		<div class="container">
			<div class="col-md-6">
				<div class="media">
					
				</div>
			</div>
						
			
		</div>
	</div>
	
	
	<footer>
		<div class="footer">
			<div class="container">
				<div class="social-icon">
					<div class="col-md-4">
						<ul class="social-network">
							<li><a href="#" class="fb tool-tip" title="Facebook"><i class="fa fa-facebook"></i></a></li>
							<li><a href="#" class="twitter tool-tip" title="Twitter"><i class="fa fa-twitter"></i></a></li>
							<li><a href="#" class="gplus tool-tip" title="Google Plus"><i class="fa fa-google-plus"></i></a></li>
							<li><a href="#" class="linkedin tool-tip" title="Linkedin"><i class="fa fa-linkedin"></i></a></li>
							<li><a href="#" class="ytube tool-tip" title="You Tube"><i class="fa fa-youtube-play"></i></a></li>
						</ul>	
					</div>
				</div>
				
				<div class="col-md-4 col-md-offset-4">
					<div class="copyright">
						&copy;  KMITL , 2021.
                        <div class="credits">
                            
                            <a href="https://bootstrapmade.com/free-business-bootstrap-themes-website-templates/"></a><a href="https://bootstrapmade.com/"></a>
                        </div>
					</div>
				</div>						
			</div>
			<div class="pull-right">
				<a href="#home" class="scrollup"><i class="fa fa-angle-up fa-3x"></i></a>
			</div>
		</div>
	</footer>
	
    
	<script src="js/jquery-2.1.1.min.js"></script>	
   
    <script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/jquery.isotope.min.js"></script>  
	<script src="js/wow.min.js"></script>
	<script src="js/functions.js"></script>
    
</body>
</html>
<?php } ?>
