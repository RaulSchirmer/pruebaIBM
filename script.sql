CREATE DATABASE comercio;
commit;

CREATE TABLE comercio.proveedores  
(
id_proveedor NUMERIC (4) NOT NULL,
nombre VARCHAR (30) NOT NUll,
fecha_de_alta DATE,
id_cliente NUMERIC (4) NOT NULL,
primary key (id_proveedor, id_cliente)
);   
commit;

INSERT INTO comercio.proveedores 
VALUES 
(1, 'Coca-cola', '2020-01-24',5);

INSERT INTO comercio.proveedores 
VALUES 
(2, 'Pepsi', curdate(), 5);

INSERT INTO comercio.proveedores 
VALUES 
(3, 'Redbull', '2018-12-03', 6);
INSERT INTO comercio.proveedores 
VALUES 
(3, 'Redbull', '2018-10-03', 3);
INSERT INTO comercio.proveedores 
VALUES 
(3, 'Redbull', '2018-12-01', 2);
INSERT INTO comercio.proveedores 
VALUES 
(4, 'Mahou', '2018-12-01', 5);
INSERT INTO comercio.proveedores 
VALUES 
(4, 'Mahou', '2018-12-01', 6);

commit;
