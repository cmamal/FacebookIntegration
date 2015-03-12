# FacebookIntegration
Web project using facebook javascript SDK for fb login service

Steps to create a FB login in your web page.

1. Create a facebook app : https://developers.facebook.com/apps/ -> Click "Add a new App" 
2. Add the return url i.e the URL of your application. Your FB Application -> Settings -> Site URL
   In this APP , "http://localhost:8181/" is given where the application runs in localhost 8181 tomcat port.
2. Use the APP ID in your FB javascipt : fblogin.jsp:
FB.init({
    appId  : <YOURAPPID>
3. Build the application : mvn clean install
4. Run the web application : mvn -Dmaven.tomcat.port=8181 tomcat:run
5. Access the URL : http://localhost:8181/facebook-int/
6. Now you can use FB login in the application
