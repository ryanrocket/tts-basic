-- selects all assignments where name is 'Ryan Wans'

select student.fullname, exam.exam_name, grade FROM maindb.grades as main
inner join students as student on main.stu_id = student.id
inner join exams as exam on main.exam_id = exam.exam_id
where student.fullname="Ryan Wans";

-- select all assignments under certain course

select exam.exam_name, grade from maindb.grades as main
inner join students as student on main.stu_id = student.id
inner join exams as exam on main.exam_id = exam.exam_id
inner join subjects on main.subj_id = subjects.subj_id
where student.fullname="Ryan Wans" and subjects.subj_title="Algebra";

-- select all courses student is enrolled in

select subjects.subj_title, subj_id from maindb.grades as main
inner join students as student on main.stu_id = student.id
inner join subjects on main.subj_id = subjects.subj_id
where student.fullname="Ryan Wans";

-- Above should return all courses... but could use tuning

-- the next query should get the grades from a certain course and average them to one grade
-- however this should be done client-side in the java method.

-- a better way to select all courses :)
while rs.next():     -- a result query jdbc thing :)
	select subjects.subj_title from maindb.stusub as main
	inner join subjects on main.sub_id = subjects.subj_id
	inner join students on main.stu_id = students.stu_id
	where student.stu_id=661888;
