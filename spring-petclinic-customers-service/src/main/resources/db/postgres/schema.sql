CREATE DATABASE customers;

CREATE TABLE IF NOT EXISTS types (
  id SERIAL PRIMARY KEY,
  name VARCHAR(80) NOT NULL
);

CREATE TABLE IF NOT EXISTS owners (
  id SERIAL PRIMARY KEY,
  first_name VARCHAR(30) NOT NULL,
  last_name VARCHAR(30) NOT NULL,
  address VARCHAR(255),
  city VARCHAR(80),
  telephone VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS pets (
  id SERIAL PRIMARY KEY,
  name VARCHAR(30) NOT NULL,
  birth_date DATE,
  type_id INT NOT NULL,
  owner_id INT NOT NULL,
  FOREIGN KEY (owner_id) REFERENCES owners(id),
  FOREIGN KEY (type_id) REFERENCES types(id)
);
