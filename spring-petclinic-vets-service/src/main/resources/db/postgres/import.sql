INSERT INTO vets (first_name, last_name) VALUES ('James', 'Carter') ON CONFLICT DO NOTHING;
INSERT INTO vets (first_name, last_name) VALUES ('Helen', 'Leary') ON CONFLICT DO NOTHING;
INSERT INTO vets (first_name, last_name) VALUES ('Linda', 'Douglas') ON CONFLICT DO NOTHING;
INSERT INTO vets (first_name, last_name) VALUES ('Rafael', 'Ortega') ON CONFLICT DO NOTHING;
INSERT INTO vets (first_name, last_name) VALUES ('Henry', 'Stevens') ON CONFLICT DO NOTHING;
INSERT INTO vets (first_name, last_name) VALUES ('Sharon', 'Jenkins') ON CONFLICT DO NOTHING;

INSERT INTO specialties (name) VALUES ('radiology') ON CONFLICT DO NOTHING;
INSERT INTO specialties (name) VALUES ('surgery') ON CONFLICT DO NOTHING;
INSERT INTO specialties (name) VALUES ('dentistry') ON CONFLICT DO NOTHING;

INSERT INTO vet_specialties (vet_id, specialty_id) VALUES (2, 1) ON CONFLICT DO NOTHING;
INSERT INTO vet_specialties (vet_id, specialty_id) VALUES (3, 2) ON CONFLICT DO NOTHING;
INSERT INTO vet_specialties (vet_id, specialty_id) VALUES (3, 3) ON CONFLICT DO NOTHING;
INSERT INTO vet_specialties (vet_id, specialty_id) VALUES (4, 2) ON CONFLICT DO NOTHING;
INSERT INTO vet_specialties (vet_id, specialty_id) VALUES (5, 1) ON CONFLICT DO NOTHING;
