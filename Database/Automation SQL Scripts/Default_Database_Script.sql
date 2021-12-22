Begin Transaction;
IF object_id('TestGroups') is null
create table TestGroups 
(
GID integer primary key,
Group_Name varchar,
Group_Status bit);
ELSE 
PRINT 'Object Already Exist'
COMMIT TRANSACTION


Begin Transaction;
IF object_id('TestExecutorConfig') is null
create table TestExecutorConfig
(
SID integer primary key,
Suite_Name varchar,
Scenario_Name varchar,
TestCases varchar,
Parallel_Execution bit,
Exec_GroupID integer,
CONSTRAINT FK_TestExecutorConfig_Exec_GroupID FOREIGN KEY (Exec_GroupID)
        REFERENCES  dbo.TestGroups (GID)
        ON DELETE CASCADE
        ON UPDATE CASCADE  
)
else
PRINT 'Object Already Exist'
COMMIT TRANSACTION;

Begin Transaction
IF object_id('TestCases') is null
create table TestGroups 
(

);
ELSE 
PRINT 'Object Already Exist'
Commit Transaction

