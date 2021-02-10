SET FOREIGN_KEY_CHECKS = 0;

CREATE TABLE COACH 
(	C_ssn				varchar(20)		NOT NULL,
	C_name				varchar(20)		NOT NULL,
	Title				varchar(20),
    Contract_ID			int				NOT NULL,
    PRIMARY KEY (C_ssn),
    FOREIGN KEY (Contract_ID) REFERENCES CONTRACT (Contract_ID));
    
CREATE TABLE CONFERENCE
(	Conf_ID				int				NOT NULL,
	Conf_name			varchar(20)		NOT NULL,
    PRIMARY KEY (Conf_ID));
    
CREATE TABLE CONTRACT
(	Contract_ID			int				NOT NULL,
	Salary				double			NOT NULL,
    Start_date			varchar(20)		NOT NULL,
    End_date			varchar(20)		NOT NULL,
    T_ID				int				NOT NULL,
    PRIMARY KEY (Contract_ID),
    FOREIGN KEY (T_ID) REFERENCES TEAM(T_ID));
    
CREATE TABLE DIVISION
(	Div_ID				int				NOT NULL,
	Div_name			varchar(20)		NOT NULL,
    Conf_ID				int				NOT NULL,
    PRIMARY KEY (Div_ID),
    FOREIGN KEY (Conf_ID) REFERENCES CONFERENCE (Conf_ID));

CREATE TABLE FAN_DEMOGRAPHICS
(	T_ID				int				NOT NULL,
	Male				double			NOT NULL,
    Female				double			NOT NULL,
    Sub_30				double			NOT NULL,
    Thirty_to_50		double			NOT NULL,
    Fifty_Plus			double			NOT NULL,
    White				double			NOT NULL,
    Black				double			NOT NULL,
    Other				double			NOT NULL,
    FOREIGN KEY T_ID REFERENCES TEAM (T_ID));
    
CREATE TABLE PLAYER
(	P_ssn				varchar(20)		NOT NULL,
	P_name				varchar(30)		NOT NULL,
    Position			varchar(20),
    Contract_ID			int				NOT NULL,
    PRIMARY KEY (P_ssn),
    FOREIGN KEY (Contract_ID) REFERENCES CONTRACT (Contract_ID));

CREATE TABLE SCOUT
(	Sc_ssn				varchar(20)		NOT NULL,
	Sc_name				varchar(20)		NOT NULL,
	Agency				varchar(20),
    PRIMARY KEY (Sc_ssn));

CREATE TABLE SCOUT_REPORT
(	Report_ID			int				NOT NULL,
	Report_date			varchar(20)		NOT NULL,
    Sc_ssn				varchar(20)		NOT NULL,
    P_ssn				varchar(20)		NOT NULL,
    Rating				int				NOT NULL,
    Commentary			varchar(50),
    PRIMARY KEY (Report_ID),
    FOREIGN KEY (Sc_ssn) REFERENCES SCOUT (Sc_ssn),
    FOREIGN KEY (P_ssn) REFERENCES PLAYER (P_ssn));
    
CREATE TABLE TEAM
(	T_ID				int				NOT NULL,
	T_name				varchar(20)		NOT NULL,
	T_city				varchar(20)		NOT NULL,
    Div_ID				int				NOT NULL,
    Stad_name			varchar(20)		NOT NULL,
    Stad_address		varchar(20),
    Stad_capacity		int				NOT NULL,
    PRIMARY KEY (T_ID),
    FOREIGN KEY (Div_ID) REFERENCES DIVISION (Div_ID));
    
CREATE TABLE TEAM_OWNER
(	O_ssn				varchar(20)		NOT NULL,
	O_name				varchar(20)		NOT NULL,
    T_ID				int				NOT NULL,
    Net_worth			double			NOT NULL,
    PRIMARY KEY (O_ssn),
    FOREIGN KEY (T_ID) REFERENCES TEAM (T_ID));
    
SET FOREIGN_KEY_CHECKS = 1;