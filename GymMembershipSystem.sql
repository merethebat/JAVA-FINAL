CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    username TEXT,
    password TEXT UNIQUE,
    role TEXT
);

CREATE TABLE memberships (
    id SERIAL PRIMARY KEY,
    type TEXT,
    cost INT,
    user_id INT
);

CREATE TABLE workout_classes (
    id SERIAL PRIMARY KEY,
    name TEXT,
    description TEXT,
    trainer_id INT
);

CREATE TABLE gym_merch (
    id SERIAL PRIMARY KEY,
    name TEXT,
    price INT,
    stock INT
);

--sample data example--
INSERT INTO users (username, password, role)
VALUES ('admin', 'hashedpass', 'ADMIN');

INSERT INTO gym_merch (name, price, stock)
VALUES ('Protein Shake', 3.50, 50);