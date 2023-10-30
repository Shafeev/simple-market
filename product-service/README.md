# Run latest mongoDB
```bash
docker pull mongodb/mongodb-community-server
docker run --name mongo -p 27017:27017 -d mongodb/mongodb-community-server:latest
```

## Inspect mongoDB

```bash
docker inspect mongo
```



## POST add product 

![image-20231030131308809](./README.assets/image-20231030131308809.png)

{
"name":"Galaxy note 10",
"description":"Samsung Galaxy Note 10",
"price":120000
}

## GET products

![image-20231030131422894](./README.assets/image-20231030131422894.png)

![image-20231030131456747](./README.assets/image-20231030131456747.png)