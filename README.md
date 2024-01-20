# jwt-apigateway-security

## Regist an user

```
http://localhost:8080/auth/register
{
    "name":"test8",
    "password":"root",
    "email":"test8@gmail.com"
}

```

## Generate token

```
http://localhost:8080/auth/token
{
    "username":"test8",
    "password":"root"
}
```
## Access student-service

```
http://localhost:8080/student/3

Note: add token to request
```

## Validate token

```
http://localhost:8080/auth/validate?token=eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ0ZXN0OCIsImlhdCI6MTcwNTY3NzQ5MiwiZXhwIjoxNzA1Njc5MjkyfQ.DEY-OVQq1oQR0bUxlFXabR4-2ffPOBcTn9rri4u1WHM
```
