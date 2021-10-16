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

-- Hiển thị số lượng sinh viên ở từng nơi
select address, count(studentID) as `so luong sinh vien` from student
group by address;

-- Tính điểm trung bình các môn học của mỗi học viên: ý nghĩa của các hàm thống kê
SELECT S.StudentId, S.StudentName, AVG(Mark)
FROM Student S join Mark M on S.StudentId = M.StudentId
GROUP BY S.StudentId, S.StudentName;

-- Hiển thị những bạn học viên co điểm trung bình các môn học lớn hơn 15
SELECT S.StudentId, S.StudentName, AVG(Mark) as TBC
FROM Student S join Mark M on S.StudentId = M.StudentId
GROUP BY S.StudentId, S.StudentName
having AVG(Mark)>15;

-- Hiển thị thông tin các học viên có điểm trung bình lớn nhất.
SELECT S.StudentId, S.StudentName, AVG(Mark) as TBC
FROM Student S join Mark M on S.StudentId = M.StudentId
GROUP BY S.StudentId, S.StudentName
HAVING AVG(Mark) >= ALL (SELECT AVG(Mark) FROM Mark GROUP BY Mark.StudentId); -- ????????????



-- bài tập
-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select *, max(credit) as `credit max` from subject
group by status; 

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select sub.subID, sub.subName, max(m.mark) from subject as sub
join mark as m
on sub.subID = m.subID
group by status;

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select s.studentID, s.studentName, avg(mark) as avg_mark from student as s
join mark as m
on s.studentID = m.studentID
group by studentName
order by avg(mark);


