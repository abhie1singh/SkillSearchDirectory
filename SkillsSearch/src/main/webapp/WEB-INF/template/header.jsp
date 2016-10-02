<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="/home">Skill Search Directory</a>
		</div>
		<div class="collapse navbar-collapse" id="myNavbar">
			<form class="navbar-form navbar-right" role="search" action="/searchresults">
				<div class="form-group input-group">
					<input type="text" class="form-control" placeholder="Search..">
					<span class="input-group-btn">
						<button class="btn btn-default" type="submit">
							<span class="glyphicon glyphicon-search"></span>
						</button>
					</span>
				</div>
			</form>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="/editprofile"><span class="glyphicon glyphicon-user"></span>
						My Account</a></li>
			</ul>
		</div>
	</div>
</nav>