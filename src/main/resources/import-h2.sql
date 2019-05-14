INSERT INTO USER (user_id, user_name, user_address, created_date, user_role)
VALUES
  (1, 'XYZ', 'Gurgoan', '12-02-2019', 'EMPLOYEE');
  INSERT INTO USER (user_id, user_name, user_address, created_date, role)
  VALUES
    (2, 'ABC', 'Gurgoan1', '12-03-2019', 'AFFILIATE');
    INSERT INTO USER (user_id, user_name, user_address, created_date, role)
    VALUES
      (3, 'KLM', 'New Delhi', '12-05-2019', 'EMPLOYEE');


INSERT INTO ROLE (role_id, User_role,role_description)
VALUES (1, 'EMPLOYEE','Simple Employee');
INSERT INTO ROLE (role_id, User_role,role_description)
VALUES (2, 'AFFILIATE','Long Affliate');

INSERT INTO USER_ROLE (user_id, role_id)
VALUES (1, 1);
INSERT INTO USER_ROLE (user_id, role_id)
VALUES (1, 2);
INSERT INTO USER_ROLE (user_id, role_id)
VALUES (2, 2);
INSERT INTO USER_ROLE (user_id, role_id)
VALUES (3, 2);

INSERT INTO PRODUCT (product_id, product_name, product_description,quantity, price,product_type)
VALUES (1,'Soap', 'Pears baby soap for Kids', 1, 35.75,"noGross");

INSERT INTO PRODUCT (product_id, product_name, product_description,quantity, price,product_type)
VALUES (2,'Tooth Brush', 'Signal Tooth Brushes Size in (L, M, S)', 5, 34.50,"noGross");

INSERT INTO PRODUCT (product_id, product_name, product_description,quantity, price,product_type)
VALUES (3,'Shirt', 'Casual Shirt imported from France', 3, 1500.00,"noGross");

INSERT INTO PRODUCT (product_id, product_name, product_description,quantity, price,product_type)
VALUES (4,'Bottle', 'Hot Water Bottles', 80, 450.45,"noGross");

