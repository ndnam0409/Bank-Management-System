create database BankManagementSystem;
use BankManagementSystem;

create table signup(
	formo varchar(20),
    name varchar(20),
    father_name varchar(20),
    dob varchar(20),
    gender varchar(20),
	email varchar(20), 
    marital_status varchar(20),
    address varchar(40),
    city varchar(25),
    pincode varchar(20), 
    state varchar(25), 
    primary key(formo)
);
select * from signup;

create table signuptwo(
	formo varchar(20),
    religion varchar(20),
    category varchar(20),
    income varchar(20),
    educational varchar(20),
	occupation varchar(20), 
    pan varchar(20),
    aadhar varchar(40),
    citizen varchar(25),
    existaccount varchar(20),
    primary key(formo)
);

select * from signuptwo;







