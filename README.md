# TODO_JDBC
Title:JSP and JDBC ToDo Application

Table of Contents

    Introduction
    Features
    Prerequisites
    Database
    Steps used to build this application

Introduction:

    This is a simple ToDo application built using JavaServer Pages (JSP) for the frontend and Java Database Connectivity (JDBC) for database interaction. 
    The application allows users to register, log in, create ToDo items and delete them.


Features:

    User authentication (register and login)
    Create and delete ToDo items
    Personalized ToDo lists for each registered user.
    Logout
    
Prerequisites:

    Before you begin, ensure you have the following:

     Java Development Kit (JDK) installed
     Apache Tomcat or JSP-compatible server
     MySQL workbench database system installed and configured
     An IDE (IntelliJ) for Java development

Database

    This application uses a MySQL database to store user information and ToDo items.
    Tables used for each sections:
       1. "🗃️-Auth table" for storing user data.
       2. "🗃️-Todo table" for storing Items.
       
Steps used to build this application:

    👉 Added the required maven dependencies (SQL, Servlet, JSTL).
    👉 Installed and used Tom cat server for server communication.
    👉 Connected Database for storing and accessing data.
    👉 Used MVC (Model, View, Controller) Architecture.
    👉 Extended "HttpServlet" for HTTP request (GET, POST).
    👉 Used HttpSession for storing session values.
    👉 Used JSP and JSTL for writing Java code inside HTML.
    👉 Used Dispatcher for navigation.
    👉 Used Data Access Object (dao) for accessing Database using queries.
