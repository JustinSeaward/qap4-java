## Medication & Patient Reading & Writing Filing Systems

### Project Description

A Java-based CLI application to demonstrate data persistence. This project manages Patient 
records by reading and writing to a local text file (Patients.txt) and Medication records 
by using a Postgres database (qap4) using JDBC (Java Database Connectivity). This application 
has a menu that allows users to add and view records across both storage types.

### Summary of project

Overall, the project went well, but I had to overcome a couple of hurdles. I initially ran 
into a problem that threw a NumberFormatException when parsing the text file data because 
of how my toString() method for my Patient class was formatted. I also ran into a file 
overwriting "bug", when writing data to the text file, the file would overwrite the old data 
instead of appending it. I was missing a parameter for the FileWriter constructor to tell it 
to append the file. Instead, it was creating a new file each time new data was entered.

Author

Justin Seaward
