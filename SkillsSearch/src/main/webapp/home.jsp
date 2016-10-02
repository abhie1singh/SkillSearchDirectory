<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
/* Set black background color, white text and some padding */
footer {
	background-color: #555;
	color: white;
	padding: 15px;
}
</style>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Skill Search Directory</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
				</ul>
				<form class="navbar-form navbar-right" role="search">
					<div class="form-group input-group">
						<input type="text" class="form-control" placeholder="Search..">
						<span class="input-group-btn">
							<button class="btn btn-default" type="button">
								<span class="glyphicon glyphicon-search"></span>
							</button>
						</span>
					</div>
				</form>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#"><span class="glyphicon glyphicon-user"></span>
							My Account</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container text-center">
		<div class="row">
			<div class="col-sm-3 well">
				<div class="well">
					<p>
						<a href="#">My Profile</a>
					</p>
					<img src="/public/images/abhie.jpg" class="img-circle" height="65"
						width="65" alt="Avatar">
				</div>
				<div class="well">
					<p>
						<a href="#">Skills</a>
					</p>
					<p>
						<span class="label label-default">Java</span> <span
							class="label label-primary">Python</span> <span
							class="label label-success">Machine Learning</span> <span
							class="label label-info">Spring</span> <span
							class="label label-warning">Hibernate</span> <span
							class="label label-danger">JPA</span>
					</p>
				</div>
				<div class="alert alert-success fade in">
					<a href="#" class="close" data-dismiss="alert" aria-label="close">×</a>
					<p>
						<strong>Hey</strong>
					</p>
					People are requesting your Guidance. Find out who.
				</div>
				<p>
					<a href="#">Link</a>
				</p>
				<p>
					<a href="#">Link</a>
				</p>
				<p>
					<a href="#">Link</a>
				</p>
			</div>
			<div class="col-sm-7">

				<div class="row">
					<div class="col-sm-12">
						<div class="panel panel-default text-left">
							<div class="panel-body">
								<p contenteditable="true">Requesting help for using CyberArk
									and Git setup for my project (Regulatory Compliance AM)</p>
								<button type="button" class="btn btn-default btn-sm">
									<span class="glyphicon glyphicon-thumbs-up"></span> Offer
									Guidance
								</button>
								<button type="button" class="btn btn-default btn-sm">
									<span class="glyphicon glyphicon-thumbs-up"></span> Me too
								</button>
							</div>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-sm-3">
						<div class="well">
							<p>John</p>
							<img src="/public/images/abhie.jpg" class="img-circle"
								height="55" width="55" alt="Avatar">
						</div>
					</div>
					<div class="col-sm-6">
						<div class="well">
							<p>John is guiding Jane for DataScience and Hadoop for Global
								workflow in Regulatory Compliance, AM</p>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="well">
							<p>Jane</p>
							<img src="/public/images/abhie.jpg" class="img-circle"
								height="55" width="55" alt="Avatar">
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-3">
						<div class="well">
							<p>John</p>
							<img src="/public/images/abhie.jpg" class="img-circle"
								height="55" width="55" alt="Avatar">
						</div>
					</div>
					<div class="col-sm-6">
						<div class="well">
							<p>John is guiding Jane for DataScience and Hadoop for Global
								workflow in Regulatory Compliance, AM</p>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="well">
							<p>Jane</p>
							<img src="/public/images/abhie.jpg" class="img-circle"
								height="55" width="55" alt="Avatar">
						</div>
					</div>
				</div>
				<div class="row">
					<p>
						<b>Tech Gurus</b>
					</p>
					<div class="col-sm-3">
						<div class="well">
							<img src="/public/images/abhie.jpg" class="img-circle"
								height="55" width="55" alt="Avatar">
							<p>
								<strong>Abhie</strong>
								<button class="btn btn-primary">Seek Guidance</button>
							</p>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="well">
							<img src="/public/images/abhie.jpg" class="img-circle"
								height="55" width="55" alt="Avatar">
							<p>
								<strong>Abhie</strong>
								<button class="btn btn-primary">Seek Guidance</button>
							</p>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="well">
							<img src="/public/images/abhie.jpg" class="img-circle"
								height="55" width="55" alt="Avatar">
							<p>
								<strong>Abhie</strong>
								<button class="btn btn-primary">Seek Guidance</button>
							</p>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="well">
							<img src="/public/images/abhie.jpg" class="img-circle"
								height="55" width="55" alt="Avatar">
							<p>
								<strong>Abhie</strong>
								<button class="btn btn-primary">Seek Guidance</button>
							</p>
						</div>
					</div>

				</div>
			</div>
			<div class="col-sm-2 well">
				<div class="thumbnail">
					<p>
						<b>Upcoming Events</b>
					</p>
				</div>
				<div class="thumbnail">
					<p>Hackathon</p>
					<img src="/public/images/jc3.jpg" alt="Paris" width="400"
						height="300">
					<p>
						<strong>Jersey City</strong>
					</p>
					<p>Thurs. 2 October 2016</p>
					<button class="btn btn-primary">Info</button>
				</div>
				<div class="thumbnail">
					<p>Tech Townhall</p>
					<img src="/public/images/nyc.jpg" alt="Paris" width="400"
						height="300">
					<p>
						<strong>New York City</strong>
					</p>
					<p>Tue. 25 October 2016</p>
					<button class="btn btn-primary">Info</button>
				</div>
			</div>
		</div>
	</div>

	<footer class="container-fluid text-center">
		<p>Copyright © 2016, Abhie Inc</p>
	</footer>

</body>
</html>

