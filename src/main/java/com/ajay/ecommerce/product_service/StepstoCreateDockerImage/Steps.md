Steps:

--> Create Dockerfle in root :

![img.png](img.png)

--> refer DockerFile from our project 

--> open maven and double click on package:

![img_1.png](img_1.png) so the jar file will be created

--> use any one of the step to create Image : ![img_2.png](img_2.png)

--> run this command to run the created image :  docker run -p 8080:8080 --name=myspringapp imagename:version
 
--> open browser and hit the endpoints