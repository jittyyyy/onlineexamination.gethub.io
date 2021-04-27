<%
                               HttpSession sessionObj=request.getSession(false);
                               String username=(String)sessionObj.getAttribute("username");
                           %> 
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Skill Meter-Welcome</title>

    
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
								
														
							</ul>
						</div>
					</div>						
				</div>
			</div>	
		</nav>		
	</header>
	
	<div id="breadcrumb">
		<div class="container">	
			<div class="breadcrumb">							
				<li><a href="welcome.jsp">Home</a></li>
				<li>Welcome</li>			
			</div>		
		</div>	
	</div>
	
	<div class="services">
		<div class="container">
			<h3>Welcome <span style="color:#1BBD36;"> 
                           <%= username %>
                            </span>To Your Profile</h3>
			<hr>
			<div class="col-md-6">
				<img src="images/4.jpg" class="img-responsive">
				
			</div>
			
			<div class="col-md-6">
				<div class="media">
					<ul>
						<li>
							<div class="media-left">
								<i class="fa fa-book"></i>						
							</div>
							<div class="media-body">
								<h4 class="media-heading"><a href="viewprofile.jsp">View Profile</a></h4>
								<p></p>
							</div>
						</li>
						<li>
							<div class="media-left">
							<i class="fa fa-pencil"></i>							
							</div>
							<div class="media-body">
								<h4 class="media-heading"><a href="updateprofile.jsp">Update Profile</a></h4>
								<p></p>
							</div>
						</li>
						<li>
							<div class="media-left">
								<i class="fa fa-rocket"></i>						
							</div>
							<div class="media-body">
								<h4 class="media-heading"><a href="changepass.jsp">Change Password</a></h4>
								<p></p>
							</div>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>	
	
	<div class="sub-services">
		<div class="container">
			<div class="col-md-6">
				<div class="media">
					<ul>
						<li>
							<div class="media-left">
								<i class="fa fa-pencil"></i>						
							</div>
							<div class="media-body">
								<h4 class="media-heading"><a href="selectsubject.jsp">Start Test</a></h4>
								<p></p>
							</div>
						</li>
						<li>
							<div class="media-left">
								<i class="fa fa-book"></i>						
							</div>
							<div class="media-body">
								<h4 class="media-heading"><a href="previousresult.jsp">View Previous Result</a></h4>
								<p></p>
							</div>
						</li>
						 
					</ul>
				</div>
			</div>
						
			<div class="col-md-6">
				<img src="images/4.jpg" class="img-responsive">
				<p></p>
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
						&copy; KMITL , 2021.
                        <div class="credits">
                            
                            
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