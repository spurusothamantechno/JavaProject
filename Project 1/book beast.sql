create database Bookbeast
use Main
CREATE TABLE Book(sno INT PRIMARY KEY ,BookName VARCHAR(30) ,ratings DECIMAL(10,2));
insert into Book(sno,BookName,ratings,reviews)
values(1,'Harry potter',9.5,'fantastic'),(2,'Black holes and baby universes',9,'Very Good'),(3,'Cosmos',8.5,'useful & superb'),(4,'Great Expectation',8.3,'good');
select*from Book;
alter table Book
add reviews varchar(50);
update Book
set ratings=9.7,reviews='Mindblowing'
where sno=3;
delete from Book
where sno=101;
delete from Book
where sno=102;
delete from Book
where sno=103;
delete from Book
where sno=104;
