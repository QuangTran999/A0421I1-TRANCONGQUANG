create database quanlysinhvien;
use quanlysinhvien;

create table class(
	classID int not null primary key auto_increment,
    className varchar(60) not null,
    startDate datetime not null,
    status bit
);
create table student(
	studentID int not null primary key auto_increment,
    studentName varchar(30) not null,
    address varchar(50),
    phone varchar(20),
    status bit not null,
    classID int not null,
    foreign key (classID) references class (classID)
);
create table subject(
	subID int not null primary key auto_increment,
    subName varchar(30) not null,
    credit tinyint not null default 1,
    status bit default 1,
     check (credit>=1)
);

create table mark(
	markID int not null primary key auto_increment,
    subID int not null ,
    studentID int not null,
    mark float default 0,
    examTimes tinyint default 1,
    foreign key(subID) references subject (subID),
    foreign key(studentID) references student (studentID)
);

INSERT INTO Class
VALUES (1, 'A1', '2008-12-20', 1);
INSERT INTO Class
VALUES (2, 'A2', '2008-12-22', 1);
INSERT INTO Class
VALUES (3, 'B3', current_date, 0);

INSERT INTO Student (StudentName, Address, Phone,Status, ClassId)
VALUES ('Hung', 'Ha Noi', '0912113113',1, 1);
INSERT INTO Student (StudentName, Address,Status, ClassId)
VALUES ('Hoa', 'Hai phong',0, 1);
INSERT INTO Student (StudentName, Address, Phone,Status, ClassId)
VALUES ('Manh', 'HCM', '0123123123',1, 2);

INSERT INTO Subject
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
       
INSERT INTO Mark (SubId, StudentId, Mark, ExamTimes)
VALUES (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);

select * from Student;
select * from Student where status = 1;

select * from subject where credit<10;

select className, studentName from class
join student
on student.classID = class.classID
where className = 'A1';

select * from subject where subName = 'CF';

SELECT S.StudentId, S.StudentName, Sub.SubName, M.Mark
FROM Student S join Mark M on S.StudentId = M.StudentId join Subject Sub on M.SubId = Sub.SubId;

SELECT S.StudentId, S.StudentName, Sub.SubName, M.Mark
FROM Student S join Mark M on S.StudentId = M.StudentId join Subject Sub on M.SubId = Sub.SubId
WHERE Sub.SubName = 'CF';
-- --------------------------------------------------------------------------------------------
-- bài 1
--
select * from student
where studentName like "H%";

-- 
select * from class
join student
on class.classID = student.classID
where startDate like '%12%';
--

select * from subject
where credit=5 or credit=4 or credit=3;
--
-- làm không đc
select class.classID, student.studentName  from class
join student
on class.classID = student.classID
where student.studentName = 'Hung';

update class join student
set classID = 2
where stustudentName = 'Hung';
-- 

select s.studentName, sub.subName, m.mark from student as s
join mark as m
on s.studentID = m.studentID
join subject as sub
on m.subID = sub.subID
order by m.mark, s.studentName;
-- ---------------------------------------------------------