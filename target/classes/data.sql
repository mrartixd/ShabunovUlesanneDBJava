INSERT INTO user (id, first_name, last_name, email, password) VALUES (1, 'admin', 'admin', 'admin@admin.net', '$2a$10$83JuTaiONvJkCDV4OQAylenrKAsss4drPufrjzrQQ8y77ObyvFhn.');
INSERT INTO user (id, first_name, last_name, email, password) VALUES (2, 'Artur', 'Shabunov', 'artixd@yandex.ru', '$2a$10$83JuTaiONvJkCDV4OQAylenrKAsss4drPufrjzrQQ8y77ObyvFhn.');
INSERT INTO user (id, first_name, last_name, email, password) VALUES (3, 'Ruslan', 'Kovalyov', 'RuslanKovalyov@jourrapide.com', '$2a$10$83JuTaiONvJkCDV4OQAylenrKAsss4drPufrjzrQQ8y77ObyvFhn.');


--password 1234
INSERT INTO role (id, name) VALUES (1, 'ROLE_ADMIN');
INSERT INTO role (id, name) VALUES (2, 'ROLE_USER');

INSERT INTO users_roles (user_id, role_id) VALUES (1, 1);
INSERT INTO users_roles (user_id, role_id) VALUES (1, 2);
INSERT INTO Course(id,title, code) VALUES(1,'Eesti keel','RAM9991');
INSERT INTO Course(id,title, code) VALUES(2,'Englise keel','RAM9992');
INSERT INTO COURSES_USERS(courses_id, user_id) VALUES(1,1);
INSERT INTO COURSES_USERS(courses_id, user_id) VALUES(1,2);
INSERT INTO COURSES_USERS(courses_id, user_id) VALUES(2,3);