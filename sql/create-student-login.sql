USE [master];
GO

CREATE LOGIN [student] WITH 
	PASSWORD=N'P@$$w0rd', 
	DEFAULT_DATABASE=[TransactionExercises], 
	CHECK_EXPIRATION=OFF, 
	CHECK_POLICY=OFF;
GO

USE [TransactionExercises];
GO

CREATE USER [student] FOR LOGIN [student];
GO

ALTER ROLE [db_datareader] ADD MEMBER [student];
GO

ALTER ROLE [db_datawriter] ADD MEMBER [student];
GO