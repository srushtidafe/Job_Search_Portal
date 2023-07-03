# Job_Search_Portal
>## Framework Used 
 * SpringBoot
>## Database Used 
 * H2 Database
>## Language Used
* Java
>## For Querying use these
* Crud Repository
* Custom Finder
* Custom Query 
>## Data flow
In this project, we have four layers-
 **Model** - In this model, we have some private methods and we used some Annotation on joc class and validation on member variables
 
 **Controller** -  JobController class has CRUD methods and their endpoints Basically controller layer handles the HTTP requests, translates the JSON parameter to an object,  authenticates the request, and transfers it to the business (service) layer. In short, it consists of views i.e., frontend part.
 
 **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
 
 **Repository** - This is the interface class that extends the crudRepo class. basically, this layer maintains the h2-database thing on which CRUD operations are performed


>## Data Structure used in my project
 



>## Project Summary
*CRUD operation on Job entity and add validation on entity class. Use spring boot validation using annotations*
In job class
   Integer id;
   String title;
   String description;
   String location;
   Double salary; 
   String companyEmail; 
   String companyName;
   String employerName;
   <Some-Enum> jobType;
   
     hint:-  *JOB could be IT, HR , Sales, Marketing, etc...choose anything u want put the types should be in an enum) -
             *values corresponding to the Job should be stored as Strings in the table rather than numbers. ( @Enumerated)
             *(@min for salary : should be above 20,000)




