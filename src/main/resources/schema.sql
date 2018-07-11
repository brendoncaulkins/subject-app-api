CREATE TABLE IF NOT EXISTS employees
(
  id INTEGER not null PRIMARY KEY,
  firstName VARCHAR(255) not null,
  lastName VARCHAR(255) not null,
  addressLine1 VARCHAR(255) not null,
  addressLine2 varchar(255),
  city VARCHAR(255) not null,
  state VARCHAR(2) not null,
  zipcode VARCHAR(5) not null
);

CREATE TABLE IF NOT EXISTS states
(
  name VARCHAR(255) not null,
  code VARCHAR(2) not null PRIMARY KEY,
)