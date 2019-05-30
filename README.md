### Spring Boot - JWT

## Instruções
- git clone https://github.com/thiagohernandes/everis-security.git
- Rotas desprotegidas: http://localhost:8080/api/nosecurity (GET) e http://localhost:8080/login (POST) - body: {"username": "admin", "password": "password"}
- Depois do POST, e colocar o Bearer Token no Header, a rota http://localhost:8080/api/pessoas será liberada para acesso
