INSERT INTO roles (name) VALUES ('ALUM');
INSERT INTO roles (name) VALUES ('PROF');

INSERT INTO users (username, password, role_id)
VALUES ('juanperez', '{bcrypt}$2a$04$FMtH3rJzXeW2egERxo4DC.rls2eF40GosY30aIVy9fjoy5ryr92ci', 1);

INSERT INTO users (username, password, role_id)
VALUES ('mariagarcia', '{bcrypt}$2a$04$FMtH3rJzXeW2egERxo4DC.rls2eF40GosY30aIVy9fjoy5ryr92ci', 2);