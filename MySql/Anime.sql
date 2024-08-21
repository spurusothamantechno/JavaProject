create database Main
use Main
CREATE TABLE Anime(sno INT PRIMARY KEY , aniname VARCHAR(30) ,ratings DECIMAL(10,2));
insert into Anime(sno,aniname,ratings,reviews)
values(101,'NARUTO',9.5,'Superb'),(102,'JUJUTSU KAISEN',9,'very good'),(103,'SOLO LEVELING',8.5,'good'),(104,'BLACK CLOVER',8.3,'ultimate');
select*from Anime;
alter table Anime
add reviews varchar(50);
delete from Anime
where sno=1;
delete from Anime
where sno=2;
delete from Anime
where sno=3;
delete from Anime
where sno=4;

update Anime
set ratings=9.7,reviews='Mindblowing'
where sno=101;
