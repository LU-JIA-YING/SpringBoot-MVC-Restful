# 呂佳穎_08/05 HW-2討論

###### tags: `Homework`、`H2 Database`、`Spring Data JPA`

>- [查看作業題目](https://reurl.cc/RXbQDg)
>- [作業繳交連結](https://reurl.cc/zNW7oa)

## 目錄
[TOC]

## **1. @Entity 的使用時機與用途**
告訴JPA(Java Persistence API)這個是Entity類別，JPA會自動連接到類別名稱對應的資料表(customer)

## **2. @Table 的使用時機與用途**
指定對應的資料表名稱

## **3. @Id的使用時機與用途**
某個欄位為資料表的主鍵(primary key)

## **4. @Column的使用時機與用途**
指定對應的欄位名稱

## **5. @Repository的使用時機與用途**
標註資料訪問層元件（Dao層）的類標識為Spring Bean

```java=
@Repository(value="userDao")
```

EX: 該標註是告訴Spring，讓Spring建立一個名字叫“userDao”的UserDaoImpl例項

當Service需要使用Spring建立的名字叫“userDao”的UserDaoImpl例項時，就可以使用@Resource(name = "userDao")註解告訴Spring，Spring把建立好的userDao注入給Service即可

## **6. @Query的使用時機與用途**
下Java Persistence Query Language(JPQL)查詢(語法類似SQL)，好處是方法名稱可以自訂

## **7. @Modifying 的使用時機與用途**
將@Query標註的方法從查詢轉變為修改

## **8. Java 中 Interface 的使用時機與用法**
定義一些方法的接口，並沒有實現
EX: 填飽肚子這件事情，都有共同的行為“吃”，狗、貓、魚、人類都有“吃”的功能，但實現起來不一樣。那麽我們就可以抽象出一個接口“筆”

```java=
interface 填飽肚子{
    void 吃();
}
```

## **9. Java 中 implement 的使用時機與用法**
是實現接口
不可以覆蓋父類的方法或者變數
EX: 狗、貓、魚、人類要有”吃“的這個功能，就需要實現接口”填飽肚子“的”吃“功能。而這個關鍵字implement就是實現的意思

```java=
class 狗 implement 填飽肚子{
    void 吃(){
        用狗嘴吃；
    }
}

class 貓 implement 填飽肚子{
    void 吃(){
        用貓嘴吃；
    }
}
```

## **10. Java 中 extends 的使用時機與用法**
是指一個繼承關系，子類繼承父類的功能
會覆蓋父類定義的變數或者函式
EX: 父類”填飽肚子“具有”吃“的功能
而子類"貓"，只需要 extends 父類”填飽肚子“就擁有了”吃“的共功能。

```java=
class 貓 extends 填飽肚子{
    
}
```

## **11. application.properties 是什麼**
存放著我們的Spring Boot的參數配置，ex:資料庫連線資訊

## **12. DAO 是什麼**
是一個數據存取接口(Data Access Object)
傳統MVC中Model的關鍵角色

## **13. DTO 是什麼**
數據傳輸對象(Data Transfer Object)，是一種設計模式之間傳輸數據的軟件應用系統

## **14. CRUD 各自代表什麼**
操作儲存資料方式
(新增:Create , 讀取:Read, 更新: Update, 刪除:Delete)

## **15. 撰寫 README.md 的目的是什麼**
介紹、解釋此專案的文本文件。

------
[Spring Boot - RestController](https://reurl.cc/RXj1rx)

[第二週回家預習內容](https://reurl.cc/nOE0x2)
