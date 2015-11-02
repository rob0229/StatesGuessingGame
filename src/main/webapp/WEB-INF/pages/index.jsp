<html>
<body>
	<h1>States Guessing Game</h1>
	<p>The object of this game is to guess the randomly selected state
		in the least amount of tries.</p>
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
	<div>
		<input type="button"  onclick="location.href='/playGame.jsp'" value="Start Game!" >
	</div>



	<div>
		<h2>Message : ${message}</h2>
		<h2>Counter : ${counter}</h2>
	</div>
	<jsp:include page="footer.jsp" />