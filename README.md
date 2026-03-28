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

### Screenshots of features

Writing data to a .txt file.
<img width="1461" height="1036" alt="AddingDataToTextFile" src="https://github.com/user-attachments/assets/8019fd4c-c7f6-4e48-8511-f9f717bfe54f" />

Reading data from .txt file.
<img width="1542" height="1068" alt="ReadingDataFromTextFile" src="https://github.com/user-attachments/assets/44dbe9a7-80a0-44eb-92e3-a1b69101641f" />

Writing data to a database.
<img width="1538" height="1062" alt="WriteToDatabase" src="https://github.com/user-attachments/assets/66b8e37b-59bc-47c0-9345-8f7f53f1bcab" />

Reading data from a databased.
<img width="1543" height="1080" alt="ReadFromDatabase" src="https://github.com/user-attachments/assets/28b6df97-6460-48fd-91cc-95532bc8a1b4" />



#### Author

Justin Seaward
