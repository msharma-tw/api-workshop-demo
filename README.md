#Rest Assured Demo Project

![GITHUB LINK](https://github.com/msharma-tw/api-workshop-demo)

Base project created for API workshop using java. 

###Libraries Installed
- rest-assured
- testng  
- json-simple
- allure-testng

###Steps
1. Create new maven project.
2. Install the dependency in pom.xml and reload the project.
3. Write the test using testng annotations.
4. Run the test. There are various ways of triggering the test. 
   - from the test-level
   - from testng.xml 
   - from command line by using following command:

        `mvn clean test -DsuiteXmlFile=testng.xml`

5. Test reports created under allure-results/. Use below command to convert json files. It will show allure report in the browser.:

         `allure serve allure-results`
----------------------------------------------------------------------
