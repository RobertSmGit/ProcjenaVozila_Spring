drop table if exists user;
drop table if exists user_role;
drop table if exists automobilMarka;
drop table if exists automobilModel;
drop table if exists vozilo;


CREATE TABLE user (
id INT(11) IDENTITY PRIMARY KEY,
ime VARCHAR(50) NOT NULL,
prezime VARCHAR(50) NOT NULL,
username VARCHAR(45),
password VARCHAR(100) NOT NULL,
enabled TINYINT NOT NULL DEFAULT 1,
kId INT(11)
);


CREATE TABLE user_role (
user_role_id int(11) IDENTITY PRIMARY KEY,
username varchar(45) NOT NULL,
role varchar(45) NOT NULL,
FOREIGN KEY (username) REFERENCES user (username)
);


CREATE TABLE automobilMarka (
idKeyMarka INT(11) IDENTITY PRIMARY KEY,
marka VARCHAR(50) NOT NULL,
enabled TINYINT NOT NULL DEFAULT 1,
markaId INT(11)
);


CREATE TABLE automobilModel (
naziv VARCHAR(50) PRIMARY KEY,
cijena DOUBLE,
bId INT(11)
);



CREATE TABLE vozilo (
id INT(11) IDENTITY PRIMARY KEY,
naslov VARCHAR(100),
tekst VARCHAR(1000),
korisnik VARCHAR(45) NOT NULL,
automobilModel VARCHAR(50) NOT NULL,
automobilMarka VARCHAR(50) NOT NULL,
cijena DOUBLE,
godiste INT(11),
kilometraza DOUBLE(11),
ocuvanost VARCHAR(50),
oprema VARCHAR(50),
motor VARCHAR(50),
mjenjac VARCHAR(50),
vlasnik VARCHAR(50),
FOREIGN KEY (korisnik) REFERENCES user (username),
FOREIGN KEY (automobilModel) REFERENCES automobilModel (naziv)
);


