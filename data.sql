-- Use vaasthunirmaan

use vaasthunirmaan

-- Drop database

drop database if exists vaasthunirmaan;

-- Database management

create database vaasthuNirmaan;
use vaasthuNirmaan;

-- Create tables

create table Agent(firstName varchar(20), lastName varchar(20), aadharID varchar(13), phoneNumber varchar(10), Area varchar(45), password varchar(16) not null, primary key(aadharID, Area));

create table Customer(firstName varchar(20), lastName varchar(20), aadharID varchar(13), phoneNumber varchar(10), password varchar(16) not null, primary key(aadharID));

create table Plot(sellerID varchar(13), buyerID varchar(13), agentID varchar(13), startDate date not null, colonyName varchar(45), cityName varchar(45), state varchar(45) not null, price numeric(9,0) not null, facing varchar(5) not null, squareFeet numeric(10,0) not null, endDate date, primary key(sellerID, agentID, startDate));

create table Home(sellerID varchar(13), buyerID varchar(13), agentID varchar(13), startDate date not null, sellingState varchar(4) not null, colonyName varchar(20), cityName varchar(20), state varchar(20) not null, price numeric(10,0) not null, facing varchar(5) not null, yearOfConstruction numeric(4,0) not null, squareFeet numeric(5,0) not null, endDate date, bhk numeric(1, 0) not null, primary key(sellerID, agentID, startDate));


-- Agent table values

insert into agent values ('Dhaipule','Sujith Sai','A805943490932','9704465097','Anantapur','SWLj3sOTHiw#1$2');
insert into agent values ('Boda ','Devraj','A184361354287','8125314281','Kothagudam','&o_hum6Swu+2wib');
insert into agent values ('Banoth','Sathish','A290455768885','9676354096','Warangal','?l-*uBrawrO61DR');
insert into agent values ('Manish','Indwar','A363894057710','7667270976','Hyderabad','bR#$9POwr$spoD4');
insert into agent values ('Sai Srinivas','Aathreya','A937892433882','9515292343','Nellore','tRicrLcl&AS0OP5');
insert into agent values ('Boda ','Devraj','A184361354287','8125314281','Khammam','&o_hum6Swu+2wib');
insert into agent values ('Manish','Indwar','A363894057710','7667270976','Vijayawada','bR#$9POwr$spoD4');
insert into agent values ('s','s','A111111111111','9876543210','s','S');

-- Customer table values

insert into customer values ('Rohit','Dhaipule','C701165580431','7993380799','wRu0REHu?wEfrE!');
insert into customer values ('Harshith','Dhaipule','C927496829917','8019190801','1ephug#wEtlROcr');
insert into customer values ('Anusha','Boda','C899263817981','8617876586','3P@sW&2+ikeJOtH');
insert into customer values ('Santhosh','Banoth','C941715064189','7979725015','mLChap*lsL17Z3s');
insert into customer values ('Prashant ','Indwar','C757178076471','8240729083','4ridruJiq@cipr9');
insert into customer values ('Karan','Indwar','C782647511000','7092218476','dr6rE8-@?2ROsow');
insert into customer values ('Deepak','Indwar','C314453187635','6127933397','cH_kist5te5lmLp');
insert into customer values ('Prem','Indwar','C404199981685','8777667787','1lNu2uK*ZE2HErA');
insert into customer values ('Rahul','Yavvari','C842876021130','6578536005','xO@ivl3ha_atrec');
insert into customer values ('Manish','Kumar','C724521260849','7970416209','x3c8APru*8nlxUk');
insert into customer values ('Sandeep','Kumar','C918707708841','6121349873','FLcrUBRlJ6gaw=1');
insert into customer values ('Bhargav','Manne','C194856517453','7887682961','7=PAn2$2aKuteCh');
insert into customer values ('Praharsha','Vemula','C448476889948','6718316706','d2A=Iruba7rL7_I');
insert into customer values ('Praveen','Upparapalli','C237993169789','6127923150','phoS4_-2s?oxl3a');
insert into customer values ('Ramesh','Nenavath','C851595363660','7979772855','sw!mot5&aBr_Cos');
insert into customer values ('Anil ','Banavath','C722758086067','7887965976','$idrig4=ugUdraY');
insert into customer values ('Bhagavan','Nagara','C186260830702','6127936822','vuHi_9SP80+lH&w');
insert into customer values ('Prashanth','Karuvu','C680969382569','6127992384','3rId_p+!thuSpe0');
insert into customer values ('Bharath','Bandi','C351572795904','9687456126','st6pECis3nApur=');
insert into customer values ('Sumit','Mishra','C194760292370','7584914758','duMoma*-9p9Ucre');
insert into customer values ('s','s','C111111111111','9876543210','s','S');

-- Home table values

insert into home values ('C927496829917','C701165580431','A805943490932','2020-04-10','rent','Anjaneyanagar','Anantapur','Andhra Pradesh','13500','North','2023','731','2022-01-10', 1);
insert into home values ('C941715064189','C899263817981','A290455768885','2020-06-25','rent','Kazipet','Warangal','Telangana','3000','North','2017','557','2021-03-22', 1);
insert into home values ('C782647511000','C757178076471','A805943490932','2020-10-17','rent','Ram Nagar','Anantapur','Andhra Pradesh','11000','North','2021','806','2023-05-17', 2);
insert into home values ('C404199981685','C314453187635','A290455768885','2021-08-06','sale','Warangal','Warangal','Telangana','2100000','North','2021','996','2023-08-29', 2);
insert into home values ('C724521260849','C842876021130','A937892433882','2021-09-06','rent','VRC Centre','Nellore','Andhra Pradesh','3500','South','2018','580','2021-09-30', 1);
insert into home values ('C194856517453','C918707708841','A363894057710','2021-11-05','sale','Kukatpally','Hyderabad','Telangana','4100000','South','2016','862','2022-06-15', 2);
insert into home values ('C237993169789','C448476889948','A805943490932','2021-11-11','sale','Ram Nagar','Anantapur','Andhra Pradesh','3400000','South','2019','1355','2022-08-15', 3);
insert into home values ('C722758086067','C851595363660','A290455768885','2021-12-17','sale','Hanmakonda','Warangal','Telangana','7500000','South','2017','1411','2023-11-18', 3);
insert into home values ('C680969382569','C186260830702','A290455768885','2022-02-20','sale','Warangal','Warangal','Telangana','4500000','East','2015','828','2023-03-12', 2);
insert into home values ('C194760292370','C351572795904','A363894057710','2022-06-24','sale','Kukatpally','Hyderabad','Telangana','2500000','East','2020','575','2023-04-14', 1);
insert into home values ('C724521260849','C448476889948','A805943490932','2022-10-02','sale','Srikantam circle','Anantapur','Andhra Pradesh','13500000','North','2015','1798','2022-11-15', 3);
insert into home values ('C941715064189','C851595363660','A937892433882','2022-11-23','rent','VRC Centre','Nellore','Andhra Pradesh','14000','North','2020','1665','2022-12-29', 3);
insert into home values ('C722758086067','C899263817981','A805943490932','2023-04-16','sale','Srikantam circle','Anantapur','Andhra Pradesh','12500000','East','2022','1545','2023-09-10', 3);
insert into home values ('C237993169789','C757178076471','A363894057710','2023-06-14','sale','Jubilee Hills','Hyderabad','Telangana','28000000','South','2020','1337','2023-12-25', 3);
insert into home values ('C404199981685','C842876021130','A937892433882','2023-12-25','sale','Netaji Nagar','Nellore','Andhra Pradesh','5400000','North','2023','1757','2024-05-10', 3);

-- Plot table values

insert into plot values ('C701165580431','C782647511000','A805943490932','2019-06-24','Anjaneyanagar','Anantapur','Andhra Pradesh','2733000','East','1139','2020-08-22');
insert into plot values ('C314453187635','C941715064189','A290455768885','2019-07-23','Kazipet','Warangal','Telangana','2745000','West','1281','2019-09-10');
insert into plot values ('C186260830702','C757178076471','A363894057710','2019-08-11','Secunderabad','Hyderabad','Telangana','2926000','North','1016','2020-01-15');
insert into plot values ('C194856517453','C722758086067','A937892433882','2019-09-05','Netaji Nagar','Nellore','Andhra Pradesh','1868000','North','740','2021-10-14');
insert into plot values ('C899263817981','C194856517453','A363894057710','2019-09-27','Jubilee Hills','Hyderabad','Telangana','5478000','West','1309','2022-11-11');
insert into plot values ('C351572795904','C404199981685','A363894057710','2020-01-09','Kukatpally','Hyderabad','Telangana','3481000','South','1116','2021-03-17');
insert into plot values ('C186260830702','C680969382569','A937892433882','2020-03-23','VRC Centre','Nellore','Andhra Pradesh','1547000','West','546','2022-05-08');
insert into plot values ('C918707708841','C194760292370','A290455768885','2020-04-22','Warangal','Warangal','Telangana','2032000','South','941','2023-12-25');
insert into plot values ('C701165580431','C927496829917','A184361354287','2020-08-20','VDO Colony','Khammam','Telangana','4068000','North','1356','2022-07-14');
insert into plot values ('C899263817981','C842876021130','A184361354287','2020-12-17','Balaji Nagar','Khammam','Telangana','2307000','North','1358','2022-04-05');
insert into plot values ('C194760292370','C722758086067','A363894057710','2021-01-15','Kukatpally','Hyderabad','Telangana','1784000','South','572','2023-05-06');
insert into plot values ('C194856517453','C186260830702','A184361354287','2021-07-29','Sujathnagar','Kothagudam','Telangana','2546000','East','1061','2022-10-04');
insert into plot values ('C448476889948','C724521260849','A937892433882','2021-12-09','VRC Centre','Nellore','Telangana','3333000','North','1323','2022-08-16');
insert into plot values ('C701165580431','C194760292370','A184361354287','2021-12-31','Mangapeta','Kothagudam','Telangana','2415000','East','804','2022-11-12');
insert into plot values ('C757178076471','C782647511000','A363894057710','2022-02-24','Jubilee Hills','Hyderabad','Telangana','4783000','West','1143','2022-04-15');
insert into plot values ('C314453187635','C194856517453','A184361354287','2022-03-21','Balaji Nagar','Khammam','Telangana','1780000','South','1203','2023-09-17');
insert into plot values ('C351572795904','C186260830702','A184361354287','2022-04-21','Mangapeta','Kothagudam','Telangana','1864000','South','777','2023-07-19');
insert into plot values ('C314453187635','C680969382569','A290455768885','2022-06-03','Hanmakonda','Warangal','Telangana','3553000','East','1030','2022-09-13');
insert into plot values ('C851595363660','C724521260849','A805943490932','2022-06-05','Ram Nagar','Anantapur','Andhra Pradesh','1433000','South','853','2022-12-15');
insert into plot values ('C724521260849','C237993169789','A805943490932','2022-08-10','Srikantam circle','Anantapur','Andhra Pradesh','3278000','East','1457','2023-09-10');

UPDATE Plot SET endDate = NULL;

UPDATE Home SET endDate = NULL;
