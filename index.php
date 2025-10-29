
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../style.css">
    <title>Login</title>
</head>
<body style="justify-content: center; color: aliceblue;" >
    <h2>CSD</h2>
        <p class="pr">class data</p>
   
    <form method="post" action="../login.php">
        <label>nome:</label>
        <input type="text" name="usuario" required><br><br>
        <label>Senha:</label>
        <input type="password" name="senha" required><br><br>
        <button type="submit">Entrar</button>
    </form>
</body>
</html>