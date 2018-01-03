INSERT INTO user (id, first_name, last_name, email, password) VALUES (1, 'Artur', 'Shabunov', 'artixd@yandex.ru', '$2a$10$83JuTaiONvJkCDV4OQAylenrKAsss4drPufrjzrQQ8y77ObyvFhn.');

INSERT INTO role (id, name) VALUES (1, 'ROLE_ADMIN');
INSERT INTO role (id, name) VALUES (2, 'ROLE_MANAGER');
INSERT INTO role (id, name) VALUES (3, 'ROLE_USER');

INSERT INTO users_roles (user_id, role_id) VALUES (1, 1);
INSERT INTO users_roles (user_id, role_id) VALUES (1, 2);