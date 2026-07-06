INSERT INTO tb_user (email, password) VALUES ('jonathan@gmail.com', '$2a$10$B2fi6DqY66NRuGv9WfM5busUm73knfut3k4wuKNWsJMRD33FQVRqO');
INSERT INTO tb_user (email, password) VALUES ('bob@gmail.com', '$2a$10$B2fi6DqY66NRuGv9WfM5busUm73knfut3k4wuKNWsJMRD33FQVRqO');

INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');
INSERT INTO tb_role (authority) VALUES ('ROLE_CLIENT');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);