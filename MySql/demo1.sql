create database demo1
 use demo1
CREATE TABLE Stud(studreg INT PRIMARY KEY,
studname VARCHAR (30) NOT NULL,
studgpa DECIMAL (10,2)
);
INSERT INTO Stud(studreg,studname,studgpa)
VALUES(106038,'SELVAKUMAR',7.5),(106010,'DHINAGAR',8.0),(6026,'Navin',7.19);
select * from Stud;
delete from Stud
where studreg=106038;