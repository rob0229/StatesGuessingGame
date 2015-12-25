<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>States Guessing Game</title>

<spring:url value="/resources/js/raphael.min.js" var="raphaelJS" />
<spring:url value="/resources/js/scale.raphael.js" var="scaleraphaelJS" />
<spring:url value="/resources/js/jquery.js" var="jqueryJS" />
<spring:url value="/resources/js/paths.js" var="pathsJS" />
<spring:url value="/resources/js/init.js" var="initJS" />
<spring:url value="/resources/css/reset.css" var="resetCSS" />
<spring:url value="/resources/css/font.css" var="fontCSS" />
<spring:url value="/resources/css/style.css" var="styleCSS" />
<spring:url value="/resources/css/map.css" var="mapCSS" />


<script src="${raphaelJS}"></script>
<script src="${scaleraphaelJS}"></script>
<script src="${jqueryJS}"></script>
<script src="${pathsJS}"></script>
<script src="${initJS}"></script>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.js"></script>
<script type="text/javascript">

function reset(){
    var r = confirm("Are you sure you want to reset the game?");
    if (r == true) {
       console.log("You pressed OK!");
    } else {
        console.log("You pressed Cancel!");
    }
}
</script>
<% String postGuess = request.getParameter("guess");  %>
<link href="${resetCSS}" rel="stylesheet" type="text/css" />
<link href="${fontsCSS}" rel="stylesheet" type="text/css" />
<link href="${styleCSS}" rel="stylesheet" type="text/css" />
<link href="${mapCSS}" rel="stylesheet" type="text/css" />

</head>
<body>
	<div id="container">

		<div class="mapWrapper">
			<div id="map"></div>
			<!--  <div id="text"></div> -->
		</div>
		<h1>States Guessing Game Landing Page! Guess is <%= request.getParameter("playerGuess") %></h1>
		<div id="instructionBlock">
			<p>The object of this game is to guess the randomly selected
				state in the least amount of tries.</p>
			<p>On start, the computer will randomly select a State. You will
				then guess a State and the computer will tell you if you are hot,
				warm, cold, or freezing.</p>
			<ul>
				<li>Hot = Your guessed state is touching the secret state!</li>
				<li>Warm = Your guessed state is 1 state away from the secret
					state!</li>
				<li>Cold = Your guessed state is 2 states away from the secret
					state!</li>
				<li>Freezing = Your guessed state is 3 or more states away from
					the secret state!</li>
			</ul>
		</div>
		<div>
			<form action="#" method="GET" type="submit">
				<div>
					<input type="text" id="playerGuess" name="playerGuess" />
				</div>
				<div>
					<input type="submit" value="Submit Guess"> 
					<input type="button" value="Reset" onclick=reset()>
				</div>
		</div>
		</form>
	<div>
		<h2>Results are: ${results}</h2>
	</div>
		
	</div>
	<jsp:include page="footer.jsp" />