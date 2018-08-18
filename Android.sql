--------------------------------------------------------
------------VIEW 3-----------------------------
Select emp_code,name,ca_Code,dept,_date,convert(char(5), _timein , 108) [_timein],convert(char(5), _timeout , 108) [_timeout],
convert(char(5), timein , 108) [timein],convert(char(5), timeout , 108) [timeout] ,_days,_holyday,_holystr,gracetime,late_count,present_count ,
Case 
When _timein IS null and _timeout IS NULL and timein IS Null and timeout IS Null and _days = 'Sunday'  then 'Sunday'
When late_count = 1 Then 'Late'
When absent_count = 1 and leave_count = 0 Then 'Absent'
When  leave_count = 1 Then 'Leave' 
When early_count = 1 then 'Early Going'
When Sunday_count = 1 Then 'Sunday'
else 'Not Define' End AS [Status]
from AttendanceMob ('2017/04/01','2017/04/12','10002','10002','%')
---------------------------------------------------------------- 
----------------View 4---------------------------------------
Select emp_code ,name,ca_Code,dept,
SUM(absent_count)totalA,SUM(present_count)totalP,SUM(leave_count)totalLE,
SUM(late_count)totalL,SUM(Sunday_count)totalS
from AttendanceMob ('2017/04/01','2017/04/12','10007','10007','%')
group by emp_code ,name,ca_Code,dept
-------------------------------------------------------------------------
Select emp_code,_date ,absent_count,present_count,leave_count,late_count,Sunday_count 
from AttendanceMob ('2017/04/03','2017/04/03','10002','10011')
-------------------------------------------------------------------------
---------Daily Attendance & Daily Attendance Chart-----------------------------------------------------------
Select count(emp_code)TotalEMP , SUM(absent_count)totalAbsent,SUM(present_count)totalPresant,SUM(leave_count)totalLeave,
SUM(late_count)totalLate,SUM(Sunday_count)totalSunday from AttendanceMob('2017/04/01','2017/04/01','10001','10011','%')
-----------------------------------------------------------------------------------------
------------View2--------------------------------------------------------------
Select dept ,count(emp_code)TotalEMP , SUM(absent_count)totalAbsent,SUM(present_count)totalPresant,SUM(leave_count)totalLeave,
SUM(late_count)totalLate,SUM(Sunday_count)totalSunday from AttendanceMob ('2017/04/01','2017/04/01','10001','10011','01-001-0001')
group by dept










---------Daily Attendance & Daily Attendance Chart-----------------------------------------------------------
Select count(emp_code)emp , SUM(absent_count)[absent],SUM(present_count)[present],SUM(leave_count)[leave],
SUM(late_count)[late] from AttendanceMob('2017/04/28','2017/04/28)','10001','10011','%')
-----------------------------------------------------------------------------------------


------------Attendance Report big-----------------------------
Select convert(varchar(20),_date,106) dat,convert(char(5), _timein , 108) ti
,convert(char(5), _timeout , 108) too,
Case 
When _timein IS null and _timeout IS NULL and timein IS Null and timeout IS Null and _days = 'Sunday'  then 'Sunday'
When late_count = 1 Then 'Late'
When absent_count = 1 and leave_count = 0 Then 'Absent'
When  leave_count = 1 Then 'Leave' 
When early_count = 1 then 'Early Going'
When Sunday_count = 1 Then 'Sunday'
else 'Not Define' End AS sta
from AttendanceMob ('2017/04/01','2017/04/5','10002','10002','%')
-------------------------  Attendance Report big ---------------------------------------




-------------------------  Late ---------------------------------------
Select name,convert(char(5), _timein , 108) ti,
Case 
When _timein IS null and _timeout IS NULL and timein IS Null and timeout IS Null and _days = 'Sunday'  then 'Sunday'
When late_count = 1 Then 'Late'
When absent_count = 1 and leave_count = 0 Then 'Absent'
When  leave_count = 1 Then 'Leave' 
When early_count = 1 then 'Early Going'
When Sunday_count = 1 Then 'Sunday'
else 'Not Define' End AS [Status]
from AttendanceMob ('2017/04/3','2017/04/3','10001','10011','%')
where late_count=1
--------------------------- Late ------------------------------------- 


create TABLE [login] (
id int identity(1,1) primary key,
name varchar(20),
pass varchar(20) 
) 
select name,pass from [login]

--------------------------- Combo DepRT and employee name -------------------------------------
Select Distinct D.ca_title as Dept  from Pay_emp_info e
inner join SCM_Department D on
D.ca_Code = e.ca_code


Select distinct e.emp_code as code  from Pay_emp_info e
inner join SCM_Department D on
D.ca_Code = e.ca_code
where e.name = 'ibtesam ahmed'



Select e.emp_code as code ,e.name as name from Pay_emp_info e
inner join SCM_Department D on
D.ca_Code = e.ca_code where D.ca_title = 'IT'


Select e.emp_code ,e.name from Pay_emp_info e
inner join SCM_Department D on
D.ca_Code = e.ca_code where D.ca_title = 'ACCOUNTS'


Select e.emp_code ,e.name from Pay_emp_info e
inner join SCM_Department D on
D.ca_Code = e.ca_code where D.ca_title = 'GENERAL DEPARTMENT'


Select e.emp_code ,e.name from Pay_emp_info e
inner join SCM_Department D on
D.ca_Code = e.ca_code where D.ca_title = 'ADMINISTRATION'

--------------------------- Combo DepRT and employee name -------------------------------------















select DB_NAME()







select _user,_pass from _reus_sys