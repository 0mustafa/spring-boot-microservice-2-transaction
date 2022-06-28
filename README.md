## Spring Boot MicroService 2 - Transaction Service

### Endpoints

#### 1- Save Transaction

````
POST /api/transaction HTTP/1.1
Host: localhost:4444
Authorization: Basic base64(username:password)
Content-Type: application/json
Content-Length: 42

{
    "userId": 1,
    "productId": 1
}
````


#### 2- Get Transactions Of User

````
GET /api/transaction/1 HTTP/1.1
Host: localhost:4444
Authorization: Basic base64(username:password)
````


#### 3- Delete Transaction By Id

````
DELETE /api/transaction/4 HTTP/1.1
Host: localhost:4444
Authorization: Basic base64(username:password)
````