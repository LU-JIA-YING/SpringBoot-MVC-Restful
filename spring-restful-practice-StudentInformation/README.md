# SpringBoot-MVC-Restful

運用 07/29 HW 的 RESTful 應用情境，使用 Spring Boot RestController 撰寫，README.md 中需包含所有 API 的簡介  
.md：即為 Markdown 檔，也就是在 HackMD 中所編寫的語法

>假設學生點名名單  
 必須先知道學生資訊(Get)  
 新增插班的學生(Post)  
 刪除取消上課的學生(Delete)  
 修改錯誤學生資訊(Put)  

> spring-restful-practice-StudentInformation(回家作業) :

取得所有學生資料 http://localhost:8080/information  
根據KeyId取得學生資料 http://localhost:8080/information/:keyId  
新增學生資料 http://localhost:8080/information  
修改學生資料 http://localhost:8080/information/:keyId  
刪除學生資料 http://localhost:8080/information/:keyId
