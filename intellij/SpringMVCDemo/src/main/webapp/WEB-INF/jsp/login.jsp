<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<h1>Login @RequestParam</h1>

<form action="/login">
    <label for="username">Username</label>
    <input type="text" id="username" name="username" required>
    <br>
    <label for="password">Password</label>
    <input type="password" id="password" name="password" required>
    <br>
    <button type="submit">Login</button>
</form>
<br>

<h1>Login @ModelAttribute</h1>
<form action="/register">
    <label for="username">Username</label>
    <input type="text" id="userName" name="userName" required>
    <br>
    <label for="password">Password</label>
    <input type="password" id="password" name="password" required>
    <br>
    <button type="submit">Login</button>
</form>
<br>

<h1>Login @RequestBody</h1>
<form id="registerForm">
    <label for="username">Username</label>
    <input type="text" id="userName" name="userName" required>
    <br>
    <label for="password">Password</label>
    <input type="password" id="password" name="password" required>
    <br>
    <button type="button" onclick="submitForm()">Login</button>
</form>
<script>
    function submitForm() {
        const form = document.getElementById('registerForm');
        const formData = new FormData(form);
        const object = {};
        formData.forEach((value, key) => object[key] = value);
        const json = JSON.stringify(object);

        fetch('/register', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: json
        })
        .then(response => response.text())
        .then(data => console.log(data))
        .catch(error => console.error(error));
    }
</script>
</body>
</html>