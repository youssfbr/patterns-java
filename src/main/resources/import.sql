INSERT INTO tb_client (name, birth_date, created_at) VALUES ('Alisson Youssf', '1977-04-20', NOW());
INSERT INTO tb_phone (phone_type, number) VALUES ('CEL', '85 9999999999');
INSERT INTO tb_client_phone(client_id, phone_id) VALUES (1, 1);