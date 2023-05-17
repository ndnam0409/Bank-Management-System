create database BankManagementSystem;
use BankManagementSystem;

create table signup(
    formno varchar(20),
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
    primary key(formno)
);

create table signuptwo(
    formno varchar(20),
    religion varchar(20),
    category varchar(20),
    income varchar(20),
    educational varchar(20),
    occupation varchar(20), 
    pan varchar(20),
    aadhar varchar(40),
    citizen varchar(25),
    existaccount varchar(20),
    primary key(formno)
);

create table signupthree (
    formno varchar(20),
    accountType varchar(40),
    cardno varchar(25),
    pin varchar(10),
    facility varchar(100),
    primary key(formno)
);

create table login(
    formno varchar(20),
    cardno varchar(25),
    pin varchar(10)
);

create table bank(
	pin varchar(10), 
	date varchar(50), 
	type varchar(20), 
	amount varchar(20)
);






