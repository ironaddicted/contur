create table users (
  id INTEGER NOT NULL AUTO_INCREMENT,
  username varchar(45) UNIQUE ,
  password varchar(60),
  enabled boolean,
  PRIMARY KEY (id)
);

create table authorities (
  id INTEGER NOT NULL AUTO_INCREMENT,
  user_id INTEGER NOT NULL REFERENCES users(id),
  role varchar(100),
  PRIMARY KEY (id)
);