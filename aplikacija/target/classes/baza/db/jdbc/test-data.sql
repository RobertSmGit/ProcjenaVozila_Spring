INSERT INTO user(ime, prezime,username,password,enabled, kId) VALUES ('Admin','Adminic','admin','$2a$10$y7h57oWgMp8Mk9R3gJwXiue1aVk//k2ZslPJZhALOpQdP8gh20E5O', true, 1);
INSERT INTO user(ime, prezime,username,password,enabled, kId) VALUES ('Probni','Korisnik','korisnik','$2a$10$YrQ.dEwsjj3OJmO9k3Yge.KPHLP/hURLON/a5SFjiEicx8QZwClwi', true, 2);
INSERT INTO user(ime, prezime,username,password,enabled, kId) VALUES ('Robert','Sm','robert','$2a$10$gZmh1BQAAgezZJWFyNr6hOHZHm4s5B9sXNfSBGlvsEgGWvBgedhAG', true, 3);


INSERT INTO user_role (username, role) VALUES ('korisnik', 'ROLE_USER');
INSERT INTO user_role (username, role) VALUES ('robert', 'ROLE_USER');
INSERT INTO user_role (username, role) VALUES ('admin', 'ROLE_USER');
INSERT INTO user_role (username, role) VALUES ('admin', 'ROLE_ADMIN');


INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Alfa Romeo', true, 1);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Audi', true, 2);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('BMW', true, 3);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Chevrolet', true, 4);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Citroen', true, 5);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Dacia', true, 6);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Fiat', true, 7);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Ford', true, 8);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Honda', true, 9);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Hyundai', true, 10);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Jaguar', true, 11);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Kia', true, 12);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Lancia', true, 13);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Land Rover', true, 14);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Lexus', true, 15);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Mazda', true, 16);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Mercedes', true, 17);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('MINI', true, 18);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Mitsubishi', true, 19);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Nissan', true, 20);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Opel', true, 21);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Peugeot', true, 22);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Porsche', true, 23);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Renault', true, 24);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Seat', true, 25);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Smart', true, 26);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Subaru', true, 27);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Suzuki', true, 28);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Skoda', true, 29);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Toyota', true, 30);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('Volvo', true, 31);
INSERT INTO automobilMarka(marka, enabled, markaId) VALUES ('VW', true, 32);



INSERT INTO automobilModel(naziv, bId) VALUES('Odaberite model', 0);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('147', 120000, 1);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('156', 160000, 1);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('159', 180000, 1);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Mito', 136000, 1);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Giulietta', 160000, 1);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Giulia ', 260000, 1);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('A1', 142000, 2);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('A3', 200000, 2);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('A4', 300000, 2);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('A5', 380000, 2);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('A6', 410000, 2);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('A7', 600000, 2);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('A8', 880000, 2);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Q3', 250000, 2);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Q5', 410000, 2);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Q7', 670000, 2);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Serija 1', 210000, 3);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Serija 2', 250000, 3);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Serija 3', 285000, 3);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Serija 4', 360000, 3);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Serija 5', 480000, 3);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Serija 6', 760000, 3);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Serija 7', 900000, 3);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Serija X1', 320000, 3);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Serija X3', 400000, 3);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Serija X5', 520000, 3);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Serija X6', 760000, 3);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Matiz', 70000, 4);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Spark', 72000, 4);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Aveo', 76000, 4);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Kalos', 80000, 4);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Lacetti', 95000, 4);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Cruze', 120000, 4);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Captiva', 160000, 4);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Camaro', 380000, 4);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Corvette', 500000, 4);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('C1', 80000, 5);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('C3', 88000, 5);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('DS3', 122000, 5);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('C4', 120000, 5);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('DS4', 205000, 5);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('C5', 210000, 5);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('DS5', 255000, 5);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Logan', 75000, 6);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Sandero', 82000, 6);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Duster', 110000, 6);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Punto', 88000, 7);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Stilo', 110000, 7);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Bravo', 125000, 7);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Fiesta', 91000, 8);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Focus', 122000, 8);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Mondeo', 178000, 8);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Mustang', 450000, 8);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Civic', 145000, 9);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Accord', 190000, 9);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('CR-V', 230000, 9);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Accent', 75000, 10);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('i10', 77000, 10);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('i20', 86000, 10);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('i30', 110000, 10);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('i40', 160000, 10);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('X-type', 260000, 11);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('S-type', 350000, 11);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('XE', 300000, 11);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('XF', 380000, 11);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('XJ', 600000, 11);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Rio', 85000, 12);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Ceed', 120000, 12);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Optima', 170000, 12);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Sportage', 180000, 12);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Y', 84000, 13);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Delta', 125000, 13);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Range Rover Evoque', 380000, 14);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Range Rover', 600000, 14);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('CT', 180000, 15);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('IS', 420000, 15);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('2', 100000, 16);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('3', 130000, 16);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('6', 176000, 16);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('CX-3', 136000, 16);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('MX-5', 200000, 16);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('CLA', 315000, 17);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('GLA', 330000, 17);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('CLS', 630000, 17);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('A klasa', 192000, 17);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('B klasa', 208000, 17);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('C klasa', 265000, 17);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('E klasa', 385000, 17);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('S klasa', 920000, 17);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('M klasa', 400000, 17);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('One', 140000, 18);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Cooper', 170000, 18);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Colt', 84000, 19);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Lancer', 120000, 19);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Carisma', 150000, 19);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Micra', 88000, 20);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Juke', 125000, 20);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Qashqai', 165000, 20);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Adam', 95000, 21);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Corsa', 88000, 21);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Astra', 126000, 21);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Vectra', 182000, 21);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Insignia', 188000, 21);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Zafira', 170000, 21);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('206', 80000, 22);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('207', 81000, 22);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('208', 89000, 22);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('2008', 130000, 22);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('307', 105000, 22);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('308', 126000, 22);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('3008', 180000, 22);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('406', 160000, 22);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('407', 165000, 22);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('508', 220000, 22);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('911', 1200000, 23);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Panamera', 1100000, 23);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Macan', 640000, 23);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Cayenne', 720000, 23);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Twingo', 77000, 24);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Clio', 88000, 24);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Megane', 119000, 24);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Laguna', 160000, 24);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Talisman', 200000, 24);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Ibiza', 94000, 25);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Cordoba', 96000, 25);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Toledo', 116000, 25);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Leon', 124000, 25);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Ateca', 155000, 25);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Fortwo', 100000, 26);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Forfour', 110000, 26);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Impreza', 145000, 27);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Forester', 280000, 27);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Swift', 95000, 28);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Belone', 115000, 28);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Vitara', 130000, 28);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('SX4', 135000, 28);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Fabia', 85000, 29);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Rapid', 102000, 29);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Octavia', 131000, 29);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Superb', 200000, 29);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Yaris', 85000, 30);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Auris', 122000, 30);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Corolla', 123000, 30);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Avensis', 191000, 30);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('V40', 205000, 31);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('S40', 210000, 31);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('S60', 260000, 31);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('S80', 460000, 31);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('S90', 620000, 31);

INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Up', 76000, 32);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Polo', 110000, 32);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Golf', 132000, 32);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Passat', 200000, 32);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Tiguan', 185000, 32);
INSERT INTO automobilModel(naziv, cijena, bId) VALUES('Touareg', 545000, 32);



