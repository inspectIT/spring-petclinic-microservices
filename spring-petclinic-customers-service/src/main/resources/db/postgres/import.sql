INSERT INTO types (name) VALUES ('cat') ON CONFLICT DO NOTHING;
INSERT INTO types (name) VALUES ('dog') ON CONFLICT DO NOTHING;
INSERT INTO types (name) VALUES ('lizard') ON CONFLICT DO NOTHING;
INSERT INTO types (name) VALUES ('snake') ON CONFLICT DO NOTHING;
INSERT INTO types (name) VALUES ('bird') ON CONFLICT DO NOTHING;
INSERT INTO types (name) VALUES ('hamster') ON CONFLICT DO NOTHING;

INSERT INTO owners (first_name, last_name, address, city, telephone) VALUES ('George', 'Franklin', '110 W. Liberty St.', 'Madison', '6085551023') ON CONFLICT DO NOTHING;
INSERT INTO owners (first_name, last_name, address, city, telephone) VALUES ('Betty', 'Davis', '638 Cardinal Ave.', 'Sun Prairie', '6085551749') ON CONFLICT DO NOTHING;
INSERT INTO owners (first_name, last_name, address, city, telephone) VALUES ('Eduardo', 'Rodriquez', '2693 Commerce St.', 'McFarland', '6085558763') ON CONFLICT DO NOTHING;
INSERT INTO owners (first_name, last_name, address, city, telephone) VALUES ('Harold', 'Davis', '563 Friendly St.', 'Windsor', '6085553198') ON CONFLICT DO NOTHING;
INSERT INTO owners (first_name, last_name, address, city, telephone) VALUES ('Peter', 'McTavish', '2387 S. Fair Way', 'Madison', '6085552765') ON CONFLICT DO NOTHING;
INSERT INTO owners (first_name, last_name, address, city, telephone) VALUES ('Jean', 'Coleman', '105 N. Lake St.', 'Monona', '6085552654') ON CONFLICT DO NOTHING;
INSERT INTO owners (first_name, last_name, address, city, telephone) VALUES ('Jeff', 'Black', '1450 Oak Blvd.', 'Monona', '6085555387') ON CONFLICT DO NOTHING;
INSERT INTO owners (first_name, last_name, address, city, telephone) VALUES ('Maria', 'Escobito', '345 Maple St.', 'Madison', '6085557683') ON CONFLICT DO NOTHING;
INSERT INTO owners (first_name, last_name, address, city, telephone) VALUES ('David', 'Schroeder', '2749 Blackhawk Trail', 'Madison', '6085559435') ON CONFLICT DO NOTHING;
INSERT INTO owners (first_name, last_name, address, city, telephone) VALUES ('Carlos', 'Estaban', '2335 Independence La.', 'Waunakee', '6085555487') ON CONFLICT DO NOTHING;

INSERT INTO pets (name, birth_date, owner_id, type_id) VALUES ('Leo', '2000-09-07', 1, 1) ON CONFLICT DO NOTHING;
INSERT INTO pets (name, birth_date, owner_id, type_id) VALUES ('Basil', '2002-08-06', 6, 2) ON CONFLICT DO NOTHING;
INSERT INTO pets (name, birth_date, owner_id, type_id) VALUES ('Rosy', '2001-04-17', 2, 3) ON CONFLICT DO NOTHING;
INSERT INTO pets (name, birth_date, owner_id, type_id) VALUES ('Jewel', '2000-03-07', 2, 3) ON CONFLICT DO NOTHING;
INSERT INTO pets (name, birth_date, owner_id, type_id) VALUES ('Iggy', '2000-11-30', 3, 4) ON CONFLICT DO NOTHING;
INSERT INTO pets (name, birth_date, owner_id, type_id) VALUES ('George', '2000-01-20', 4, 5) ON CONFLICT DO NOTHING;
INSERT INTO pets (name, birth_date, owner_id, type_id) VALUES ('Samantha', '1995-09-04', 1, 6) ON CONFLICT DO NOTHING;
INSERT INTO pets (name, birth_date, owner_id, type_id) VALUES ('Max', '1995-09-04', 1, 6) ON CONFLICT DO NOTHING;
INSERT INTO pets (name, birth_date, owner_id, type_id) VALUES ('Lucky', '1999-08-06', 5, 7) ON CONFLICT DO NOTHING;
INSERT INTO pets (name, birth_date, owner_id, type_id) VALUES (1'Mulligan', '1997-02-24', 2, 8) ON CONFLICT DO NOTHING;
INSERT INTO pets (name, birth_date, owner_id, type_id) VALUES (1'Freddy', '2000-03-09', 5, 9) ON CONFLICT DO NOTHING;
INSERT INTO pets (name, birth_date, owner_id, type_id) VALUES (1'Lucky', '2000-06-24', 2, 10) ON CONFLICT DO NOTHING;
INSERT INTO pets (name, birth_date, owner_id, type_id) VALUES (1'Sly', '2002-06-08', 1, 10) ON CONFLICT DO NOTHING;

