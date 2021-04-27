<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.PaperCategoryDao"%>
<%@page import="bean.PaperCategoryBean"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Skill Meter-Show Subjects</title>

   
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
								<li role="presentation"><a href="adminwelcome.html">Home</a></li>
								<li role="presentation"><a href="showcategories.jsp" class="active">Subjects</a></li>
								<li role="presentation"><a href="showquestionpaper.jsp">Questions</a></li>
								<li role="presentation"><a href="studentlist.jsp">Students</a></li>							
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
				<li><a href="adminwelcome.html">Home</a></li>
				<li>Subjects</li>			
			</div>		
		</div>	
	</div>
	
	<div class="services">
		<div class="container">
			<h3 align="center">Examination Subjects</h3>
			
			
			
			<div class="col-md-10" >
				<div class="media " style="margin-left:190px">
				
				<table width = "100%"  class="table bordered">
					<tr>
					<th><span style="color:#6e6e6e;">Serial No</span></th>
				<th><span style="color:#6e6e6e;"> Name</span></th>
				
				<th><span style="color:#6e6e6e;"> Description</span></th>
				<!--<th colspan="2"><span style="color:#6e6e6e;"> Action</span></th>-->
				
				
				</tr>
                                <%
                                    ArrayList<PaperCategoryBean> alist=new ArrayList<PaperCategoryBean>();
                                    alist = new PaperCategoryDao().showAllPaperCategory();
                                    if(alist!=null)
                                    {
                                        for(int i=0;i<alist.size();i++)
                                        {
                                            
                                %>
                                 
					<tr>
						<td>
							<span style="color:#6e6e6e;">
                                                            <%= alist.get(i).getCatId() %>
							</span>
						</td>
						<td>
							<span style="color:#6e6e6e;">
							 <%= alist.get(i).getCatName() %>
							</span>
						</td>
						<td>
							<span style="color:#6e6e6e;">
							 <%= alist.get(i).getCatDetail()  %>
							</span>
						</td>
						<!--
                                                <td>
							<a href="./updatecat.php?catid=<?php echo $row['catid'];?>">Edit</a>
							
							
						</td>
						<td>
							<a href="./deletecat.php?catid=<?php echo $row['catid'];?>">Delete</a>
							
							</span>
						</td>
                                                -->
					</tr>
					
					
					<%
                                            }
                                        }
                                        %>
					
					
				</table>
				<form action="papercat.html" method="post" role="form" class="contactForm">
				<div class="text-center"><button type="submit"  class="btn btn-primary btn-lg" name="btn_papercat" required="required">Add Subject</button></div>
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
