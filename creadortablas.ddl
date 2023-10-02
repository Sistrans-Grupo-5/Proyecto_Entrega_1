-- Generado por Oracle SQL Developer Data Modeler 23.1.0.087.0806
--   en:        2023-09-27 17:53:03 COT
--   sitio:      Oracle Database 11g
--   tipo:      Oracle Database 11g



-- predefined type, no DDL - MDSYS.SDO_GEOMETRY

-- predefined type, no DDL - XMLTYPE

CREATE TABLE administradordatos (
    usuario_usuario_id1   NUMBER NOT NULL,
    id                    NUMBER,
    administradordatos_id NUMBER NOT NULL,
    usuario_usuario_id    NUMBER NOT NULL
);

CREATE UNIQUE INDEX administradordatos__idx ON
    administradordatos (
        usuario_usuario_id
    ASC );

ALTER TABLE administradordatos ADD CONSTRAINT administradordatos_pk PRIMARY KEY ( usuario_usuario_id1 );


--  ERROR: UK name length exceeds maximum allowed length(30) 
ALTER TABLE administradordatos ADD CONSTRAINT administradordatos_administradordatos_id_usuario_usuario_id_un UNIQUE ( administradordatos_id
,
                                                                                                                      usuario_usuario_id
                                                                                                                      );

CREATE TABLE bar ( 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    serviciosgastronomicos_serviciosgastronomicos_id1 NUMBER NOT NULL,
    id                                                INTEGER,
    bar_id                                            NUMBER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    serviciosgastronomicos_serviciosgastronomicos_id  NUMBER NOT NULL
);

CREATE UNIQUE INDEX bar__idx ON
    bar (
        serviciosgastronomicos_serviciosgastronomicos_id
    ASC );

ALTER TABLE bar ADD CONSTRAINT bar_pk PRIMARY KEY ( serviciosgastronomicos_serviciosgastronomicos_id1 );


--  ERROR: UK name length exceeds maximum allowed length(30) 
ALTER TABLE bar ADD CONSTRAINT bar_bar_id_serviciosgastronomicos_serviciosgastronomicos_id_un UNIQUE ( bar_id,
                                                                                                       serviciosgastronomicos_serviciosgastronomicos_id
                                                                                                       );

CREATE TABLE cliente (
    usuario_usuario_id1              NUMBER NOT NULL,
    fechaentrada                     DATE,
    id                               NUMBER,
    fechasalida                      DATE,
    cliente_id                       NUMBER NOT NULL,
    usuario_usuario_id               NUMBER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    cuentaconsumos_cuentaconsumos_id NUMBER NOT NULL,
    numerohabitacion                 VARCHAR2(255)
);

CREATE UNIQUE INDEX cliente__idx ON
    cliente (
        usuario_usuario_id
    ASC );

CREATE UNIQUE INDEX cliente__idxv1 ON
    cliente (
        cuentaconsumos_cuentaconsumos_id
    ASC );

ALTER TABLE cliente ADD CONSTRAINT cliente_pk PRIMARY KEY ( usuario_usuario_id1 );


--  ERROR: UK name length exceeds maximum allowed length(30) 
ALTER TABLE cliente ADD CONSTRAINT cliente_cliente_id_usuario_usuario_id_un UNIQUE ( cliente_id,
                                                                                     usuario_usuario_id );

CREATE TABLE consumo (
    habitacion                       VARCHAR2(255),
    costo                            NUMBER,
    descripcion                      VARCHAR2(255),
    fecha                            DATE, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    cuentaconsumos_cuentaconsumos_id NUMBER,
    habitacion_habitacion_id         NUMBER
);

CREATE TABLE cuentaconsumos (
    total                       NUMBER,
    pazysalvo                   CHAR(1),
    cuentaconsumos_id           NUMBER NOT NULL,
    cliente_cliente_id          NUMBER NOT NULL,
    cliente_usuario_usuario_id  NUMBER NOT NULL,
    numerohabitacion            VARCHAR2(255),
    cliente_usuario_usuario_id1 NUMBER NOT NULL
);

CREATE UNIQUE INDEX cuentaconsumos__idx ON
    cuentaconsumos (
        cliente_cliente_id
    ASC );

CREATE UNIQUE INDEX cuentaconsumos__idx ON
    cuentaconsumos (
        cliente_usuario_usuario_id1
    ASC );

ALTER TABLE cuentaconsumos ADD CONSTRAINT cuentaconsumos_pk PRIMARY KEY ( cuentaconsumos_id );

CREATE TABLE doble (
    habitacion_habitacion_id1 NUMBER NOT NULL,
    id                        INTEGER,
    jacuzzi                   CHAR(1),
    doble_id                  NUMBER NOT NULL,
    habitacion_habitacion_id  NUMBER NOT NULL
);

CREATE UNIQUE INDEX doble__idx ON
    doble (
        habitacion_habitacion_id
    ASC );

ALTER TABLE doble ADD CONSTRAINT doble_pk PRIMARY KEY ( habitacion_habitacion_id1 );


--  ERROR: UK name length exceeds maximum allowed length(30) 
ALTER TABLE doble ADD CONSTRAINT doble_doble_id_habitacion_habitacion_id_un UNIQUE ( doble_id,
                                                                                     habitacion_habitacion_id );

CREATE TABLE empleado (
    usuario_usuario_id1 NUMBER NOT NULL,
    id                  NUMBER,
    empleado_id         NUMBER NOT NULL,
    usuario_usuario_id  NUMBER NOT NULL
);

CREATE UNIQUE INDEX empleado__idx ON
    empleado (
        usuario_usuario_id
    ASC );

ALTER TABLE empleado ADD CONSTRAINT empleado_pk PRIMARY KEY ( usuario_usuario_id1 );


--  ERROR: UK name length exceeds maximum allowed length(30) 
ALTER TABLE empleado ADD CONSTRAINT empleado_empleado_id_usuario_usuario_id_un UNIQUE ( empleado_id,
                                                                                        usuario_usuario_id );

CREATE TABLE familiar (
    habitacion_habitacion_id1 NUMBER NOT NULL,
    comedor                   CHAR(1),
    cocina                    CHAR(1),
    id                        INTEGER,
    familiar_id               NUMBER NOT NULL,
    habitacion_habitacion_id  NUMBER NOT NULL
);

CREATE UNIQUE INDEX familiar__idx ON
    familiar (
        habitacion_habitacion_id
    ASC );

ALTER TABLE familiar ADD CONSTRAINT familiar_pk PRIMARY KEY ( habitacion_habitacion_id1 );


--  ERROR: UK name length exceeds maximum allowed length(30) 
ALTER TABLE familiar ADD CONSTRAINT familiar_familiar_id_habitacion_habitacion_id_un UNIQUE ( familiar_id,
                                                                                              habitacion_habitacion_id );

CREATE TABLE gerente (
    usuario_usuario_id1 NUMBER NOT NULL,
    id                  NUMBER,
    gerente_id          NUMBER NOT NULL,
    usuario_usuario_id  NUMBER NOT NULL
);

CREATE UNIQUE INDEX gerente__idx ON
    gerente (
        usuario_usuario_id
    ASC );

ALTER TABLE gerente ADD CONSTRAINT gerente_pk PRIMARY KEY ( usuario_usuario_id1 );


--  ERROR: UK name length exceeds maximum allowed length(30) 
ALTER TABLE gerente ADD CONSTRAINT gerente_gerente_id_usuario_usuario_id_un UNIQUE ( gerente_id,
                                                                                     usuario_usuario_id );

CREATE TABLE gimnasio ( 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    serviciosrecreativos_serviciosrecreativos_id1 NUMBER NOT NULL,
    numeromaquinas                                NUMBER,
    id                                            INTEGER,
    gimnasio_id                                   NUMBER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    serviciosrecreativos_serviciosrecreativos_id  NUMBER NOT NULL
);

CREATE UNIQUE INDEX gimnasio__idx ON
    gimnasio (
        serviciosrecreativos_serviciosrecreativos_id
    ASC );

ALTER TABLE gimnasio ADD CONSTRAINT gimnasio_pk PRIMARY KEY ( serviciosrecreativos_serviciosrecreativos_id1 );


--  ERROR: UK name length exceeds maximum allowed length(30) 
ALTER TABLE gimnasio ADD CONSTRAINT gimnasio_gimnasio_id_serviciosrecreativos_serviciosrecreativos_id_un UNIQUE ( gimnasio_id,
                                                                                                                  serviciosrecreativos_serviciosrecreativos_id
                                                                                                                  );

CREATE TABLE habitacion (
    tipo                                       VARCHAR2(255),
    capacidad                                  NUMBER,
    television                                 CHAR(1),
    minibar                                    CHAR(1),
    cafeteria                                  CHAR(1),
    costonoche                                 NUMBER,
    habitacion_id                              NUMBER NOT NULL,
    hotel_hotel_id                             NUMBER NOT NULL,
    familiar_familiar_id                       NUMBER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    suitepresidencial_suitepresidencial_id     NUMBER NOT NULL,
    suite_suite_id                             NUMBER NOT NULL,
    doble_doble_id                             NUMBER NOT NULL,
    sencilla_sencilla_id                       NUMBER NOT NULL,
    reserva_reserva_id                         NUMBER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    sencilla_habitacion_habitacion_id          NUMBER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    familiar_habitacion_habitacion_id          NUMBER NOT NULL,
    doble_habitacion_habitacion_id             NUMBER NOT NULL,
    suite_habitacion_habitacion_id             NUMBER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    suitepresidencial_habitacion_habitacion_id NUMBER NOT NULL
);

CREATE UNIQUE INDEX habitacion__idx ON
    habitacion (
        familiar_familiar_id
    ASC );

CREATE UNIQUE INDEX habitacion__idxv1 ON
    habitacion (
        suitepresidencial_suitepresidencial_id
    ASC );

CREATE UNIQUE INDEX habitacion__idxv2 ON
    habitacion (
        suite_suite_id
    ASC );

CREATE UNIQUE INDEX habitacion__idxv3 ON
    habitacion (
        doble_doble_id
    ASC );

CREATE UNIQUE INDEX habitacion__idxv4 ON
    habitacion (
        sencilla_sencilla_id
    ASC );

CREATE UNIQUE INDEX habitacion__idxv5 ON
    habitacion (
        reserva_reserva_id
    ASC );

ALTER TABLE habitacion ADD CONSTRAINT habitacion_pk PRIMARY KEY ( habitacion_id );

CREATE TABLE hotel (
    nombre                                       VARCHAR2(255) NOT NULL,
    cadena                                       VARCHAR2(255) NOT NULL,
    numero                                       NUMBER NOT NULL,
    ciudad                                       VARCHAR2(255) NOT NULL,
    hotel_id                                     NUMBER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    serviciosrecreativos_serviciosrecreativos_id NUMBER NOT NULL
);

CREATE UNIQUE INDEX hotel__idx ON
    hotel (
        serviciosrecreativos_serviciosrecreativos_id
    ASC );

ALTER TABLE hotel ADD CONSTRAINT hotel_pk PRIMARY KEY ( hotel_id );

CREATE TABLE internet (
    capacidad      VARCHAR2(255),
    constoincluido CHAR(1),
    costodiario    NUMBER,
    hotel_hotel_id NUMBER
);

CREATE TABLE piscina ( 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    serviciosrecreativos_serviciosrecreativos_id1 NUMBER NOT NULL,
    profundidad                                   NUMBER,
    id                                            INTEGER,
    piscina_id                                    NUMBER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    serviciosrecreativos_serviciosrecreativos_id  NUMBER NOT NULL
);

CREATE UNIQUE INDEX piscina__idx ON
    piscina (
        serviciosrecreativos_serviciosrecreativos_id
    ASC );

ALTER TABLE piscina ADD CONSTRAINT piscina_pk PRIMARY KEY ( serviciosrecreativos_serviciosrecreativos_id1 );


--  ERROR: UK name length exceeds maximum allowed length(30) 
ALTER TABLE piscina ADD CONSTRAINT piscina_piscina_id_serviciosrecreativos_serviciosrecreativos_id_un UNIQUE ( piscina_id,
                                                                                                               serviciosrecreativos_serviciosrecreativos_id
                                                                                                               );

CREATE TABLE producto (
    nombre      VARCHAR2(255),
    costo       NUMBER,
    producto_id NUMBER NOT NULL
);

ALTER TABLE producto ADD CONSTRAINT producto_pk PRIMARY KEY ( producto_id );

CREATE TABLE recepcionista (
    usuario_usuario_id1 NUMBER NOT NULL,
    id                  NUMBER,
    recepcionista_id    NUMBER NOT NULL,
    usuario_usuario_id  NUMBER NOT NULL
);

CREATE UNIQUE INDEX recepcionista__idx ON
    recepcionista (
        usuario_usuario_id
    ASC );

ALTER TABLE recepcionista ADD CONSTRAINT recepcionista_pk PRIMARY KEY ( usuario_usuario_id1 );


--  ERROR: UK name length exceeds maximum allowed length(30) 
ALTER TABLE recepcionista ADD CONSTRAINT recepcionista_recepcionista_id_usuario_usuario_id_un UNIQUE ( recepcionista_id,
                                                                                                       usuario_usuario_id );

CREATE TABLE relation_11 (
    serviciospa_serviciospa_id NUMBER NOT NULL,
    spa_spa_id                 NUMBER NOT NULL
);

ALTER TABLE relation_11 ADD CONSTRAINT relation_11_pk PRIMARY KEY ( serviciospa_serviciospa_id,
                                                                    spa_spa_id );

CREATE TABLE relation_13 (
    tienda_tienda_id     NUMBER NOT NULL,
    producto_producto_id NUMBER NOT NULL
);

ALTER TABLE relation_13 ADD CONSTRAINT relation_13_pk PRIMARY KEY ( tienda_tienda_id,
                                                                    producto_producto_id );

CREATE TABLE relation_14 (
    producto_producto_id         NUMBER NOT NULL,
    supermercado_supermercado_id NUMBER NOT NULL
);

ALTER TABLE relation_14 ADD CONSTRAINT relation_14_pk PRIMARY KEY ( producto_producto_id,
                                                                    supermercado_supermercado_id );

CREATE TABLE relation_15 (
    producto_producto_id                                          NUMBER NOT NULL,
    restaurante_restaurante_id                                    NUMBER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    restaurante_serviciosgastronomicos_serviciosgastronomicos_id  NUMBER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    restaurante_serviciosgastronomicos_serviciosgastronomicos_id1 NUMBER NOT NULL
);

ALTER TABLE relation_15
    ADD CONSTRAINT relation_15_pk PRIMARY KEY ( producto_producto_id,
                                                restaurante_restaurante_id,
                                                restaurante_serviciosgastronomicos_serviciosgastronomicos_id1 );

CREATE TABLE relation_16 (
    producto_producto_id                                  NUMBER NOT NULL,
    bar_bar_id                                            NUMBER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    bar_serviciosgastronomicos_serviciosgastronomicos_id  NUMBER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    bar_serviciosgastronomicos_serviciosgastronomicos_id1 NUMBER NOT NULL
);

ALTER TABLE relation_16
    ADD CONSTRAINT relation_16_pk PRIMARY KEY ( producto_producto_id,
                                                bar_bar_id,
                                                bar_serviciosgastronomicos_serviciosgastronomicos_id1 );

CREATE TABLE reserva (
    fehcaentrada                DATE,
    fechasalida                 DATE,
    numeropersonas              NUMBER,
    plancosnumo                 VARCHAR2(255),
    reserva_id                  NUMBER NOT NULL,
    hotel_hotel_id              NUMBER,
    habitacion_habitacion_id    NUMBER NOT NULL,
    cliente_cliente_id          NUMBER NOT NULL,
    cliente_usuario_usuario_id  NUMBER NOT NULL,
    cliente_usuario_usuario_id1 NUMBER NOT NULL
);

CREATE UNIQUE INDEX reserva__idx ON
    reserva (
        habitacion_habitacion_id
    ASC );

ALTER TABLE reserva ADD CONSTRAINT reserva_pk PRIMARY KEY ( reserva_id );

CREATE TABLE reservaspa (
    dia        VARCHAR2(255),
    hora       DATE,
    spa_spa_id NUMBER
);

CREATE TABLE reservassalones (
    dia                VARCHAR2(255),
    hora               DATE,
    duracion           DATE,
    tiempoadicional    DATE,
    salones_salones_id NUMBER
);

CREATE TABLE restaurante ( 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    serviciosgastronomicos_serviciosgastronomicos_id1 NUMBER NOT NULL,
    id                                                INTEGER,
    restaurante_id                                    NUMBER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    serviciosgastronomicos_serviciosgastronomicos_id  NUMBER NOT NULL
);

CREATE UNIQUE INDEX restaurante__idx ON
    restaurante (
        serviciosgastronomicos_serviciosgastronomicos_id
    ASC );

ALTER TABLE restaurante ADD CONSTRAINT restaurante_pk PRIMARY KEY ( serviciosgastronomicos_serviciosgastronomicos_id1 );


--  ERROR: UK name length exceeds maximum allowed length(30) 
ALTER TABLE restaurante ADD CONSTRAINT restaurante_restaurante_id_serviciosgastronomicos_serviciosgastronomicos_id_un UNIQUE ( restaurante_id
,
                                                                                                                               serviciosgastronomicos_serviciosgastronomicos_id
                                                                                                                               );

CREATE TABLE salones (
    capacidad                                NUMBER,
    costo                                    NUMBER,
    salones_id                               NUMBER NOT NULL,
    hotel_hotel_id                           NUMBER, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    salonesconferencia_salonesconferencia_id NUMBER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    salonesreuniones_salonesreuniones_id     NUMBER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    salonesconferencia_salones_salones_id    NUMBER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    salonesreuniones_salones_salones_id      NUMBER NOT NULL
);

CREATE UNIQUE INDEX salones__idx ON
    salones (
        salonesconferencia_salonesconferencia_id
    ASC );

CREATE UNIQUE INDEX salones__idxv1 ON
    salones (
        salonesreuniones_salonesreuniones_id
    ASC );

ALTER TABLE salones ADD CONSTRAINT salones_pk PRIMARY KEY ( salones_id );

CREATE TABLE salonesconferencia (
    salones_salones_id1   NUMBER NOT NULL,
    id                    INTEGER,
    salonesconferencia_id NUMBER NOT NULL,
    salones_salones_id    NUMBER NOT NULL
);

CREATE UNIQUE INDEX salonesconferencia__idx ON
    salonesconferencia (
        salones_salones_id
    ASC );

ALTER TABLE salonesconferencia ADD CONSTRAINT salonesconferencia_pk PRIMARY KEY ( salones_salones_id1 );


--  ERROR: UK name length exceeds maximum allowed length(30) 
ALTER TABLE salonesconferencia ADD CONSTRAINT salonesconferencia_salonesconferencia_id_salones_salones_id_un UNIQUE ( salonesconferencia_id
,
                                                                                                                      salones_salones_id
                                                                                                                      );

CREATE TABLE salonesreuniones (
    salones_salones_id1 NUMBER NOT NULL,
    costoadicional      NUMBER,
    salonesreuniones_id NUMBER NOT NULL,
    salones_salones_id  NUMBER NOT NULL
);

CREATE UNIQUE INDEX salonesreuniones__idx ON
    salonesreuniones (
        salones_salones_id
    ASC );

ALTER TABLE salonesreuniones ADD CONSTRAINT salonesreuniones_pk PRIMARY KEY ( salones_salones_id1 );


--  ERROR: UK name length exceeds maximum allowed length(30) 
ALTER TABLE salonesreuniones ADD CONSTRAINT salonesreuniones_salonesreuniones_id_salones_salones_id_un UNIQUE ( salonesreuniones_id,
                                                                                                                salones_salones_id );

CREATE TABLE sencilla (
    habitacion_habitacion_id1 NUMBER NOT NULL,
    id                        INTEGER,
    sencilla_id               NUMBER NOT NULL,
    habitacion_habitacion_id  NUMBER NOT NULL
);

CREATE UNIQUE INDEX sencilla__idx ON
    sencilla (
        habitacion_habitacion_id
    ASC );

ALTER TABLE sencilla ADD CONSTRAINT sencilla_pk PRIMARY KEY ( habitacion_habitacion_id1 );


--  ERROR: UK name length exceeds maximum allowed length(30) 
ALTER TABLE sencilla ADD CONSTRAINT sencilla_sencilla_id_habitacion_habitacion_id_un UNIQUE ( sencilla_id,
                                                                                              habitacion_habitacion_id );

CREATE TABLE servicio (
    habitacion                       VARCHAR2(255),
    costo                            NUMBER,
    descripcion                      VARCHAR2(255),
    fecha                            DATE, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    cuentaconsumos_cuentaconsumos_id NUMBER,
    habitacion_habitacion_id         NUMBER
);

CREATE TABLE serviciosgastronomicos (
    capacidad                                                    NUMBER,
    estilo                                                       VARCHAR2(255),
    nombre                                                       VARCHAR2(255),
    serviciosgastronomicos_id                                    NUMBER NOT NULL,
    hotel_hotel_id                                               NUMBER,
    bar_bar_id                                                   NUMBER NOT NULL,
    restaurante_restaurante_id                                   NUMBER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    bar_serviciosgastronomicos_serviciosgastronomicos_id         NUMBER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    restaurante_serviciosgastronomicos_serviciosgastronomicos_id NUMBER NOT NULL
);

CREATE UNIQUE INDEX serviciosgastronomicos__idx ON
    serviciosgastronomicos (
        bar_bar_id
    ASC );

CREATE UNIQUE INDEX serviciosgastronomicos__idxv1 ON
    serviciosgastronomicos (
        restaurante_restaurante_id
    ASC );

ALTER TABLE serviciosgastronomicos ADD CONSTRAINT serviciosgastronomicos_pk PRIMARY KEY ( serviciosgastronomicos_id );

CREATE TABLE serviciospa (
    nombre         VARCHAR2(255),
    duracion       DATE,
    costo          NUMBER,
    serviciospa_id NUMBER NOT NULL
);

ALTER TABLE serviciospa ADD CONSTRAINT serviciospa_pk PRIMARY KEY ( serviciospa_id );

CREATE TABLE serviciosrecreativos (
    capacidad                                             NUMBER,
    horaapertura                                          DATE,
    horacierre                                            DATE,
    costoincluido                                         CHAR(1),
    serviciosrecreativos_id                               NUMBER NOT NULL,
    piscina_piscina_id                                    NUMBER NOT NULL,
    gimnasio_gimnasio_id                                  NUMBER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    piscina_serviciosrecreativos_serviciosrecreativos_id  NUMBER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    gimnasio_serviciosrecreativos_serviciosrecreativos_id NUMBER NOT NULL
);

CREATE UNIQUE INDEX serviciosrecreativos__idx ON
    serviciosrecreativos (
        piscina_piscina_id
    ASC );

CREATE UNIQUE INDEX serviciosrecreativos__idxv1 ON
    serviciosrecreativos (
        gimnasio_gimnasio_id
    ASC );

ALTER TABLE serviciosrecreativos ADD CONSTRAINT serviciosrecreativos_pk PRIMARY KEY ( serviciosrecreativos_id );

CREATE TABLE spa (
    nombre         VARCHAR2(255),
    spa_id         NUMBER NOT NULL,
    hotel_hotel_id NUMBER
);

ALTER TABLE spa ADD CONSTRAINT spa_pk PRIMARY KEY ( spa_id );

CREATE TABLE suite (
    habitacion_habitacion_id1 NUMBER NOT NULL,
    id                        INTEGER,
    suite_id                  NUMBER NOT NULL,
    habitacion_habitacion_id  NUMBER NOT NULL
);

CREATE UNIQUE INDEX suite__idx ON
    suite (
        habitacion_habitacion_id
    ASC );

ALTER TABLE suite ADD CONSTRAINT suite_pk PRIMARY KEY ( habitacion_habitacion_id1 );


--  ERROR: UK name length exceeds maximum allowed length(30) 
ALTER TABLE suite ADD CONSTRAINT suite_suite_id_habitacion_habitacion_id_un UNIQUE ( suite_id,
                                                                                     habitacion_habitacion_id );

CREATE TABLE suitepresidencial (
    habitacion_habitacion_id1 NUMBER NOT NULL,
    id                        INTEGER,
    suitepresidencial_id      NUMBER NOT NULL,
    habitacion_habitacion_id  NUMBER NOT NULL
);

CREATE UNIQUE INDEX suitepresidencial__idx ON
    suitepresidencial (
        habitacion_habitacion_id
    ASC );

ALTER TABLE suitepresidencial ADD CONSTRAINT suitepresidencial_pk PRIMARY KEY ( habitacion_habitacion_id1 );


--  ERROR: UK name length exceeds maximum allowed length(30) 
ALTER TABLE suitepresidencial ADD CONSTRAINT suitepresidencial_suitepresidencial_id_habitacion_habitacion_id_un UNIQUE ( suitepresidencial_id
,
                                                                                                                         habitacion_habitacion_id
                                                                                                                         );

CREATE TABLE supermercado (
    nombre          VARCHAR2(255),
    supermercado_id NUMBER NOT NULL,
    hotel_hotel_id  NUMBER
);

ALTER TABLE supermercado ADD CONSTRAINT supermercado_pk PRIMARY KEY ( supermercado_id );

CREATE TABLE tienda (
    nombre         VARCHAR2(255),
    tienda_id      NUMBER NOT NULL,
    hotel_hotel_id NUMBER
);

ALTER TABLE tienda ADD CONSTRAINT tienda_pk PRIMARY KEY ( tienda_id );

CREATE TABLE usuario (
    tipodocumento                            VARCHAR2(255),
    numerodocumento                          VARCHAR2(255),
    nombre                                   VARCHAR2(255),
    correo                                   VARCHAR2(255),
    rol                                      VARCHAR2(255),
    usuario_id                               NUMBER NOT NULL,
    hotel_hotel_id                           NUMBER NOT NULL,
    cliente_cliente_id                       NUMBER NOT NULL,
    recepcionista_recepcionista_id           NUMBER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    administradordatos_administradordatos_id NUMBER NOT NULL,
    empleado_empleado_id                     NUMBER NOT NULL,
    gerente_gerente_id                       NUMBER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    administradordatos_usuario_usuario_id    NUMBER NOT NULL,
    cliente_usuario_usuario_id               NUMBER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    recepcionista_usuario_usuario_id         NUMBER NOT NULL,
    gerente_usuario_usuario_id               NUMBER NOT NULL,
    empleado_usuario_usuario_id              NUMBER NOT NULL
);

CREATE UNIQUE INDEX usuario__idx ON
    usuario (
        cliente_cliente_id
    ASC );

CREATE UNIQUE INDEX usuario__idxv1 ON
    usuario (
        recepcionista_recepcionista_id
    ASC );

CREATE UNIQUE INDEX usuario__idxv2 ON
    usuario (
        administradordatos_administradordatos_id
    ASC );

CREATE UNIQUE INDEX usuario__idxv3 ON
    usuario (
        empleado_empleado_id
    ASC );

CREATE UNIQUE INDEX usuario__idxv4 ON
    usuario (
        gerente_gerente_id
    ASC );

ALTER TABLE usuario ADD CONSTRAINT usuario_pk PRIMARY KEY ( usuario_id );

CREATE TABLE utensilios (
    tipo                        VARCHAR2(255),
    estado                      VARCHAR2(255),
    costo                       NUMBER,
    cliente_cliente_id          NUMBER,
    cliente_usuario_usuario_id  NUMBER,
    cliente_usuario_usuario_id1 NUMBER
);

ALTER TABLE administradordatos
    ADD CONSTRAINT administradordatos_usuario_fk FOREIGN KEY ( usuario_usuario_id )
        REFERENCES usuario ( usuario_id );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE administradordatos
    ADD CONSTRAINT administradordatos_usuario_fkv2 FOREIGN KEY ( usuario_usuario_id1 )
        REFERENCES usuario ( usuario_id );

ALTER TABLE bar
    ADD CONSTRAINT bar_serviciosgastronomicos_fk FOREIGN KEY ( serviciosgastronomicos_serviciosgastronomicos_id )
        REFERENCES serviciosgastronomicos ( serviciosgastronomicos_id );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE bar
    ADD CONSTRAINT bar_serviciosgastronomicos_fkv2 FOREIGN KEY ( serviciosgastronomicos_serviciosgastronomicos_id1 )
        REFERENCES serviciosgastronomicos ( serviciosgastronomicos_id );

ALTER TABLE cliente
    ADD CONSTRAINT cliente_usuario_fk FOREIGN KEY ( usuario_usuario_id )
        REFERENCES usuario ( usuario_id );

ALTER TABLE cliente
    ADD CONSTRAINT cliente_usuario_fkv2 FOREIGN KEY ( usuario_usuario_id1 )
        REFERENCES usuario ( usuario_id );

ALTER TABLE consumo
    ADD CONSTRAINT consumo_cuentaconsumos_fk FOREIGN KEY ( cuentaconsumos_cuentaconsumos_id )
        REFERENCES cuentaconsumos ( cuentaconsumos_id );

ALTER TABLE consumo
    ADD CONSTRAINT consumo_habitacion_fk FOREIGN KEY ( habitacion_habitacion_id )
        REFERENCES habitacion ( habitacion_id );

ALTER TABLE doble
    ADD CONSTRAINT doble_habitacion_fk FOREIGN KEY ( habitacion_habitacion_id )
        REFERENCES habitacion ( habitacion_id );

ALTER TABLE doble
    ADD CONSTRAINT doble_habitacion_fkv2 FOREIGN KEY ( habitacion_habitacion_id1 )
        REFERENCES habitacion ( habitacion_id );

ALTER TABLE empleado
    ADD CONSTRAINT empleado_usuario_fk FOREIGN KEY ( usuario_usuario_id )
        REFERENCES usuario ( usuario_id );

ALTER TABLE empleado
    ADD CONSTRAINT empleado_usuario_fkv2 FOREIGN KEY ( usuario_usuario_id1 )
        REFERENCES usuario ( usuario_id );

ALTER TABLE familiar
    ADD CONSTRAINT familiar_habitacion_fk FOREIGN KEY ( habitacion_habitacion_id )
        REFERENCES habitacion ( habitacion_id );

ALTER TABLE familiar
    ADD CONSTRAINT familiar_habitacion_fkv2 FOREIGN KEY ( habitacion_habitacion_id1 )
        REFERENCES habitacion ( habitacion_id );

ALTER TABLE gerente
    ADD CONSTRAINT gerente_usuario_fk FOREIGN KEY ( usuario_usuario_id )
        REFERENCES usuario ( usuario_id );

ALTER TABLE gerente
    ADD CONSTRAINT gerente_usuario_fkv2 FOREIGN KEY ( usuario_usuario_id1 )
        REFERENCES usuario ( usuario_id );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE gimnasio
    ADD CONSTRAINT gimnasio_serviciosrecreativos_fk FOREIGN KEY ( serviciosrecreativos_serviciosrecreativos_id )
        REFERENCES serviciosrecreativos ( serviciosrecreativos_id );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE gimnasio
    ADD CONSTRAINT gimnasio_serviciosrecreativos_fkv2 FOREIGN KEY ( serviciosrecreativos_serviciosrecreativos_id1 )
        REFERENCES serviciosrecreativos ( serviciosrecreativos_id );

ALTER TABLE habitacion
    ADD CONSTRAINT habitacion_doble_fk FOREIGN KEY ( doble_doble_id,
                                                     doble_habitacion_habitacion_id )
        REFERENCES doble ( doble_id,
                           habitacion_habitacion_id );

ALTER TABLE habitacion
    ADD CONSTRAINT habitacion_familiar_fk FOREIGN KEY ( familiar_familiar_id,
                                                        familiar_habitacion_habitacion_id )
        REFERENCES familiar ( familiar_id,
                              habitacion_habitacion_id );

ALTER TABLE habitacion
    ADD CONSTRAINT habitacion_hotel_fk FOREIGN KEY ( hotel_hotel_id )
        REFERENCES hotel ( hotel_id );

ALTER TABLE habitacion
    ADD CONSTRAINT habitacion_sencilla_fk FOREIGN KEY ( sencilla_sencilla_id,
                                                        sencilla_habitacion_habitacion_id )
        REFERENCES sencilla ( sencilla_id,
                              habitacion_habitacion_id );

ALTER TABLE habitacion
    ADD CONSTRAINT habitacion_suite_fk FOREIGN KEY ( suite_suite_id,
                                                     suite_habitacion_habitacion_id )
        REFERENCES suite ( suite_id,
                           habitacion_habitacion_id );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE habitacion
    ADD CONSTRAINT habitacion_suitepresidencial_fk FOREIGN KEY ( suitepresidencial_suitepresidencial_id,
                                                                 suitepresidencial_habitacion_habitacion_id )
        REFERENCES suitepresidencial ( suitepresidencial_id,
                                       habitacion_habitacion_id );

ALTER TABLE hotel
    ADD CONSTRAINT hotel_serviciosrecreativos_fk FOREIGN KEY ( serviciosrecreativos_serviciosrecreativos_id )
        REFERENCES serviciosrecreativos ( serviciosrecreativos_id );

ALTER TABLE internet
    ADD CONSTRAINT internet_hotel_fk FOREIGN KEY ( hotel_hotel_id )
        REFERENCES hotel ( hotel_id );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE piscina
    ADD CONSTRAINT piscina_serviciosrecreativos_fk FOREIGN KEY ( serviciosrecreativos_serviciosrecreativos_id )
        REFERENCES serviciosrecreativos ( serviciosrecreativos_id );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE piscina
    ADD CONSTRAINT piscina_serviciosrecreativos_fkv2 FOREIGN KEY ( serviciosrecreativos_serviciosrecreativos_id1 )
        REFERENCES serviciosrecreativos ( serviciosrecreativos_id );

ALTER TABLE recepcionista
    ADD CONSTRAINT recepcionista_usuario_fk FOREIGN KEY ( usuario_usuario_id )
        REFERENCES usuario ( usuario_id );

ALTER TABLE recepcionista
    ADD CONSTRAINT recepcionista_usuario_fkv2 FOREIGN KEY ( usuario_usuario_id1 )
        REFERENCES usuario ( usuario_id );

ALTER TABLE relation_11
    ADD CONSTRAINT relation_11_serviciospa_fk FOREIGN KEY ( serviciospa_serviciospa_id )
        REFERENCES serviciospa ( serviciospa_id );

ALTER TABLE relation_11
    ADD CONSTRAINT relation_11_spa_fk FOREIGN KEY ( spa_spa_id )
        REFERENCES spa ( spa_id );

ALTER TABLE relation_13
    ADD CONSTRAINT relation_13_producto_fk FOREIGN KEY ( producto_producto_id )
        REFERENCES producto ( producto_id );

ALTER TABLE relation_13
    ADD CONSTRAINT relation_13_tienda_fk FOREIGN KEY ( tienda_tienda_id )
        REFERENCES tienda ( tienda_id );

ALTER TABLE relation_14
    ADD CONSTRAINT relation_14_producto_fk FOREIGN KEY ( producto_producto_id )
        REFERENCES producto ( producto_id );

ALTER TABLE relation_14
    ADD CONSTRAINT relation_14_supermercado_fk FOREIGN KEY ( supermercado_supermercado_id )
        REFERENCES supermercado ( supermercado_id );

ALTER TABLE relation_15
    ADD CONSTRAINT relation_15_producto_fk FOREIGN KEY ( producto_producto_id )
        REFERENCES producto ( producto_id );

ALTER TABLE relation_15
    ADD CONSTRAINT relation_15_restaurante_fk FOREIGN KEY ( restaurante_restaurante_id,
                                                            restaurante_serviciosgastronomicos_serviciosgastronomicos_id )
        REFERENCES restaurante ( restaurante_id,
                                 serviciosgastronomicos_serviciosgastronomicos_id );

ALTER TABLE relation_15
    ADD CONSTRAINT relation_15_restaurante_fkv1 FOREIGN KEY ( restaurante_serviciosgastronomicos_serviciosgastronomicos_id1 )
        REFERENCES restaurante ( serviciosgastronomicos_serviciosgastronomicos_id1 );

ALTER TABLE relation_16
    ADD CONSTRAINT relation_16_bar_fk FOREIGN KEY ( bar_bar_id,
                                                    bar_serviciosgastronomicos_serviciosgastronomicos_id )
        REFERENCES bar ( bar_id,
                         serviciosgastronomicos_serviciosgastronomicos_id );

ALTER TABLE relation_16
    ADD CONSTRAINT relation_16_bar_fkv1 FOREIGN KEY ( bar_serviciosgastronomicos_serviciosgastronomicos_id1 )
        REFERENCES bar ( serviciosgastronomicos_serviciosgastronomicos_id1 );

ALTER TABLE relation_16
    ADD CONSTRAINT relation_16_producto_fk FOREIGN KEY ( producto_producto_id )
        REFERENCES producto ( producto_id );

ALTER TABLE reserva
    ADD CONSTRAINT reserva_cliente_fk FOREIGN KEY ( cliente_usuario_usuario_id1 )
        REFERENCES cliente ( cliente_id,
                             usuario_usuario_id );

ALTER TABLE reserva
    ADD CONSTRAINT reserva_hotel_fk FOREIGN KEY ( hotel_hotel_id )
        REFERENCES hotel ( hotel_id );

ALTER TABLE reservaspa
    ADD CONSTRAINT reservaspa_spa_fk FOREIGN KEY ( spa_spa_id )
        REFERENCES spa ( spa_id );

ALTER TABLE reservassalones
    ADD CONSTRAINT reservassalones_salones_fk FOREIGN KEY ( salones_salones_id )
        REFERENCES salones ( salones_id );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE restaurante
    ADD CONSTRAINT restaurante_serviciosgastronomicos_fk FOREIGN KEY ( serviciosgastronomicos_serviciosgastronomicos_id )
        REFERENCES serviciosgastronomicos ( serviciosgastronomicos_id );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE restaurante
    ADD CONSTRAINT restaurante_serviciosgastronomicos_fkv2 FOREIGN KEY ( serviciosgastronomicos_serviciosgastronomicos_id1 )
        REFERENCES serviciosgastronomicos ( serviciosgastronomicos_id );

ALTER TABLE salones
    ADD CONSTRAINT salones_hotel_fk FOREIGN KEY ( hotel_hotel_id )
        REFERENCES hotel ( hotel_id );

ALTER TABLE salones
    ADD CONSTRAINT salones_salonesconferencia_fk FOREIGN KEY ( salonesconferencia_salonesconferencia_id,
                                                               salonesconferencia_salones_salones_id )
        REFERENCES salonesconferencia ( salonesconferencia_id,
                                        salones_salones_id );

ALTER TABLE salones
    ADD CONSTRAINT salones_salonesreuniones_fk FOREIGN KEY ( salonesreuniones_salonesreuniones_id,
                                                             salonesreuniones_salones_salones_id )
        REFERENCES salonesreuniones ( salonesreuniones_id,
                                      salones_salones_id );

ALTER TABLE salonesconferencia
    ADD CONSTRAINT salonesconferencia_salones_fk FOREIGN KEY ( salones_salones_id )
        REFERENCES salones ( salones_id );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE salonesconferencia
    ADD CONSTRAINT salonesconferencia_salones_fkv2 FOREIGN KEY ( salones_salones_id1 )
        REFERENCES salones ( salones_id );

ALTER TABLE salonesreuniones
    ADD CONSTRAINT salonesreuniones_salones_fk FOREIGN KEY ( salones_salones_id )
        REFERENCES salones ( salones_id );

ALTER TABLE salonesreuniones
    ADD CONSTRAINT salonesreuniones_salones_fkv2 FOREIGN KEY ( salones_salones_id1 )
        REFERENCES salones ( salones_id );

ALTER TABLE sencilla
    ADD CONSTRAINT sencilla_habitacion_fk FOREIGN KEY ( habitacion_habitacion_id )
        REFERENCES habitacion ( habitacion_id );

ALTER TABLE sencilla
    ADD CONSTRAINT sencilla_habitacion_fkv2 FOREIGN KEY ( habitacion_habitacion_id1 )
        REFERENCES habitacion ( habitacion_id );

ALTER TABLE servicio
    ADD CONSTRAINT servicio_cuentaconsumos_fk FOREIGN KEY ( cuentaconsumos_cuentaconsumos_id )
        REFERENCES cuentaconsumos ( cuentaconsumos_id );

ALTER TABLE servicio
    ADD CONSTRAINT servicio_habitacion_fk FOREIGN KEY ( habitacion_habitacion_id )
        REFERENCES habitacion ( habitacion_id );

ALTER TABLE serviciosgastronomicos
    ADD CONSTRAINT serviciosgastronomicos_bar_fk FOREIGN KEY ( bar_bar_id,
                                                               bar_serviciosgastronomicos_serviciosgastronomicos_id )
        REFERENCES bar ( bar_id,
                         serviciosgastronomicos_serviciosgastronomicos_id );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE serviciosgastronomicos
    ADD CONSTRAINT serviciosgastronomicos_hotel_fk FOREIGN KEY ( hotel_hotel_id )
        REFERENCES hotel ( hotel_id );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE serviciosgastronomicos
    ADD CONSTRAINT serviciosgastronomicos_restaurante_fk FOREIGN KEY ( restaurante_restaurante_id,
                                                                       restaurante_serviciosgastronomicos_serviciosgastronomicos_id )
        REFERENCES restaurante ( restaurante_id,
                                 serviciosgastronomicos_serviciosgastronomicos_id );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE serviciosrecreativos
    ADD CONSTRAINT serviciosrecreativos_gimnasio_fk FOREIGN KEY ( gimnasio_gimnasio_id,
                                                                  gimnasio_serviciosrecreativos_serviciosrecreativos_id )
        REFERENCES gimnasio ( gimnasio_id,
                              serviciosrecreativos_serviciosrecreativos_id );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE serviciosrecreativos
    ADD CONSTRAINT serviciosrecreativos_piscina_fk FOREIGN KEY ( piscina_piscina_id,
                                                                 piscina_serviciosrecreativos_serviciosrecreativos_id )
        REFERENCES piscina ( piscina_id,
                             serviciosrecreativos_serviciosrecreativos_id );

ALTER TABLE spa
    ADD CONSTRAINT spa_hotel_fk FOREIGN KEY ( hotel_hotel_id )
        REFERENCES hotel ( hotel_id );

ALTER TABLE suite
    ADD CONSTRAINT suite_habitacion_fk FOREIGN KEY ( habitacion_habitacion_id )
        REFERENCES habitacion ( habitacion_id );

ALTER TABLE suite
    ADD CONSTRAINT suite_habitacion_fkv2 FOREIGN KEY ( habitacion_habitacion_id1 )
        REFERENCES habitacion ( habitacion_id );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE suitepresidencial
    ADD CONSTRAINT suitepresidencial_habitacion_fk FOREIGN KEY ( habitacion_habitacion_id )
        REFERENCES habitacion ( habitacion_id );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE suitepresidencial
    ADD CONSTRAINT suitepresidencial_habitacion_fkv2 FOREIGN KEY ( habitacion_habitacion_id1 )
        REFERENCES habitacion ( habitacion_id );

ALTER TABLE supermercado
    ADD CONSTRAINT supermercado_hotel_fk FOREIGN KEY ( hotel_hotel_id )
        REFERENCES hotel ( hotel_id );

ALTER TABLE tienda
    ADD CONSTRAINT tienda_hotel_fk FOREIGN KEY ( hotel_hotel_id )
        REFERENCES hotel ( hotel_id );

ALTER TABLE usuario
    ADD CONSTRAINT usuario_administradordatos_fk FOREIGN KEY ( administradordatos_administradordatos_id,
                                                               administradordatos_usuario_usuario_id )
        REFERENCES administradordatos ( administradordatos_id,
                                        usuario_usuario_id );

ALTER TABLE usuario
    ADD CONSTRAINT usuario_cliente_fk FOREIGN KEY ( cliente_cliente_id,
                                                    cliente_usuario_usuario_id )
        REFERENCES cliente ( cliente_id,
                             usuario_usuario_id );

ALTER TABLE usuario
    ADD CONSTRAINT usuario_empleado_fk FOREIGN KEY ( empleado_empleado_id,
                                                     empleado_usuario_usuario_id )
        REFERENCES empleado ( empleado_id,
                              usuario_usuario_id );

ALTER TABLE usuario
    ADD CONSTRAINT usuario_gerente_fk FOREIGN KEY ( gerente_gerente_id,
                                                    gerente_usuario_usuario_id )
        REFERENCES gerente ( gerente_id,
                             usuario_usuario_id );

ALTER TABLE usuario
    ADD CONSTRAINT usuario_hotel_fk FOREIGN KEY ( hotel_hotel_id )
        REFERENCES hotel ( hotel_id );

ALTER TABLE usuario
    ADD CONSTRAINT usuario_recepcionista_fk FOREIGN KEY ( recepcionista_recepcionista_id,
                                                          recepcionista_usuario_usuario_id )
        REFERENCES recepcionista ( recepcionista_id,
                                   usuario_usuario_id );

ALTER TABLE utensilios
    ADD CONSTRAINT utensilios_cliente_fk FOREIGN KEY ( cliente_usuario_usuario_id1 )
        REFERENCES cliente ( cliente_id,
                             usuario_usuario_id );

--  ERROR: No Discriminator Column found in Arc FKArc_1 - constraint trigger for Arc cannot be generated 

--  ERROR: No Discriminator Column found in Arc FKArc_1 - constraint trigger for Arc cannot be generated 

--  ERROR: No Discriminator Column found in Arc FKArc_1 - constraint trigger for Arc cannot be generated 

--  ERROR: No Discriminator Column found in Arc FKArc_1 - constraint trigger for Arc cannot be generated 

--  ERROR: No Discriminator Column found in Arc FKArc_1 - constraint trigger for Arc cannot be generated

--  ERROR: No Discriminator Column found in Arc FKArc_2 - constraint trigger for Arc cannot be generated 

--  ERROR: No Discriminator Column found in Arc FKArc_2 - constraint trigger for Arc cannot be generated

--  ERROR: No Discriminator Column found in Arc FKArc_3 - constraint trigger for Arc cannot be generated 

--  ERROR: No Discriminator Column found in Arc FKArc_3 - constraint trigger for Arc cannot be generated

--  ERROR: No Discriminator Column found in Arc FKArc_4 - constraint trigger for Arc cannot be generated 

--  ERROR: No Discriminator Column found in Arc FKArc_4 - constraint trigger for Arc cannot be generated

--  ERROR: No Discriminator Column found in Arc FKArc_5 - constraint trigger for Arc cannot be generated 

--  ERROR: No Discriminator Column found in Arc FKArc_5 - constraint trigger for Arc cannot be generated 

--  ERROR: No Discriminator Column found in Arc FKArc_5 - constraint trigger for Arc cannot be generated 

--  ERROR: No Discriminator Column found in Arc FKArc_5 - constraint trigger for Arc cannot be generated 

--  ERROR: No Discriminator Column found in Arc FKArc_5 - constraint trigger for Arc cannot be generated

CREATE SEQUENCE administradordatos_administrad START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER administradordatos_administrad BEFORE
    INSERT ON administradordatos
    FOR EACH ROW
    WHEN ( new.administradordatos_id IS NULL )
BEGIN
    :new.administradordatos_id := administradordatos_administrad.nextval;
END;
/

CREATE SEQUENCE bar_bar_id_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER bar_bar_id_trg BEFORE
    INSERT ON bar
    FOR EACH ROW
    WHEN ( new.bar_id IS NULL )
BEGIN
    :new.bar_id := bar_bar_id_seq.nextval;
END;
/

CREATE SEQUENCE cliente_cliente_id_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER cliente_cliente_id_trg BEFORE
    INSERT ON cliente
    FOR EACH ROW
    WHEN ( new.cliente_id IS NULL )
BEGIN
    :new.cliente_id := cliente_cliente_id_seq.nextval;
END;
/

CREATE SEQUENCE cuentaconsumos_cuentaconsumos_ START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER cuentaconsumos_cuentaconsumos_ BEFORE
    INSERT ON cuentaconsumos
    FOR EACH ROW
    WHEN ( new.cuentaconsumos_id IS NULL )
BEGIN
    :new.cuentaconsumos_id := cuentaconsumos_cuentaconsumos_.nextval;
END;
/

CREATE SEQUENCE doble_doble_id_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER doble_doble_id_trg BEFORE
    INSERT ON doble
    FOR EACH ROW
    WHEN ( new.doble_id IS NULL )
BEGIN
    :new.doble_id := doble_doble_id_seq.nextval;
END;
/

CREATE SEQUENCE empleado_empleado_id_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER empleado_empleado_id_trg BEFORE
    INSERT ON empleado
    FOR EACH ROW
    WHEN ( new.empleado_id IS NULL )
BEGIN
    :new.empleado_id := empleado_empleado_id_seq.nextval;
END;
/

CREATE SEQUENCE familiar_familiar_id_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER familiar_familiar_id_trg BEFORE
    INSERT ON familiar
    FOR EACH ROW
    WHEN ( new.familiar_id IS NULL )
BEGIN
    :new.familiar_id := familiar_familiar_id_seq.nextval;
END;
/

CREATE SEQUENCE gerente_gerente_id_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER gerente_gerente_id_trg BEFORE
    INSERT ON gerente
    FOR EACH ROW
    WHEN ( new.gerente_id IS NULL )
BEGIN
    :new.gerente_id := gerente_gerente_id_seq.nextval;
END;
/

CREATE SEQUENCE gimnasio_gimnasio_id_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER gimnasio_gimnasio_id_trg BEFORE
    INSERT ON gimnasio
    FOR EACH ROW
    WHEN ( new.gimnasio_id IS NULL )
BEGIN
    :new.gimnasio_id := gimnasio_gimnasio_id_seq.nextval;
END;
/

CREATE SEQUENCE habitacion_habitacion_id_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER habitacion_habitacion_id_trg BEFORE
    INSERT ON habitacion
    FOR EACH ROW
    WHEN ( new.habitacion_id IS NULL )
BEGIN
    :new.habitacion_id := habitacion_habitacion_id_seq.nextval;
END;
/

CREATE SEQUENCE hotel_hotel_id_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER hotel_hotel_id_trg BEFORE
    INSERT ON hotel
    FOR EACH ROW
    WHEN ( new.hotel_id IS NULL )
BEGIN
    :new.hotel_id := hotel_hotel_id_seq.nextval;
END;
/

CREATE SEQUENCE piscina_piscina_id_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER piscina_piscina_id_trg BEFORE
    INSERT ON piscina
    FOR EACH ROW
    WHEN ( new.piscina_id IS NULL )
BEGIN
    :new.piscina_id := piscina_piscina_id_seq.nextval;
END;
/

CREATE SEQUENCE producto_producto_id_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER producto_producto_id_trg BEFORE
    INSERT ON producto
    FOR EACH ROW
    WHEN ( new.producto_id IS NULL )
BEGIN
    :new.producto_id := producto_producto_id_seq.nextval;
END;
/

CREATE SEQUENCE recepcionista_recepcionista_id START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER recepcionista_recepcionista_id BEFORE
    INSERT ON recepcionista
    FOR EACH ROW
    WHEN ( new.recepcionista_id IS NULL )
BEGIN
    :new.recepcionista_id := recepcionista_recepcionista_id.nextval;
END;
/

CREATE SEQUENCE reserva_reserva_id_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER reserva_reserva_id_trg BEFORE
    INSERT ON reserva
    FOR EACH ROW
    WHEN ( new.reserva_id IS NULL )
BEGIN
    :new.reserva_id := reserva_reserva_id_seq.nextval;
END;
/

CREATE SEQUENCE restaurante_restaurante_id_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER restaurante_restaurante_id_trg BEFORE
    INSERT ON restaurante
    FOR EACH ROW
    WHEN ( new.restaurante_id IS NULL )
BEGIN
    :new.restaurante_id := restaurante_restaurante_id_seq.nextval;
END;
/

CREATE SEQUENCE salones_salones_id_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER salones_salones_id_trg BEFORE
    INSERT ON salones
    FOR EACH ROW
    WHEN ( new.salones_id IS NULL )
BEGIN
    :new.salones_id := salones_salones_id_seq.nextval;
END;
/

CREATE SEQUENCE salonesconferencia_salonesconf START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER salonesconferencia_salonesconf BEFORE
    INSERT ON salonesconferencia
    FOR EACH ROW
    WHEN ( new.salonesconferencia_id IS NULL )
BEGIN
    :new.salonesconferencia_id := salonesconferencia_salonesconf.nextval;
END;
/

CREATE SEQUENCE salonesreuniones_salonesreunio START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER salonesreuniones_salonesreunio BEFORE
    INSERT ON salonesreuniones
    FOR EACH ROW
    WHEN ( new.salonesreuniones_id IS NULL )
BEGIN
    :new.salonesreuniones_id := salonesreuniones_salonesreunio.nextval;
END;
/

CREATE SEQUENCE sencilla_sencilla_id_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER sencilla_sencilla_id_trg BEFORE
    INSERT ON sencilla
    FOR EACH ROW
    WHEN ( new.sencilla_id IS NULL )
BEGIN
    :new.sencilla_id := sencilla_sencilla_id_seq.nextval;
END;
/

CREATE SEQUENCE serviciosgastronomicos_servici START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER serviciosgastronomicos_servici BEFORE
    INSERT ON serviciosgastronomicos
    FOR EACH ROW
    WHEN ( new.serviciosgastronomicos_id IS NULL )
BEGIN
    :new.serviciosgastronomicos_id := serviciosgastronomicos_servici.nextval;
END;
/

CREATE SEQUENCE serviciospa_serviciospa_id_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER serviciospa_serviciospa_id_trg BEFORE
    INSERT ON serviciospa
    FOR EACH ROW
    WHEN ( new.serviciospa_id IS NULL )
BEGIN
    :new.serviciospa_id := serviciospa_serviciospa_id_seq.nextval;
END;
/

CREATE SEQUENCE serviciosrecreativos_servicios START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER serviciosrecreativos_servicios BEFORE
    INSERT ON serviciosrecreativos
    FOR EACH ROW
    WHEN ( new.serviciosrecreativos_id IS NULL )
BEGIN
    :new.serviciosrecreativos_id := serviciosrecreativos_servicios.nextval;
END;
/

CREATE SEQUENCE spa_spa_id_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER spa_spa_id_trg BEFORE
    INSERT ON spa
    FOR EACH ROW
    WHEN ( new.spa_id IS NULL )
BEGIN
    :new.spa_id := spa_spa_id_seq.nextval;
END;
/

CREATE SEQUENCE suite_suite_id_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER suite_suite_id_trg BEFORE
    INSERT ON suite
    FOR EACH ROW
    WHEN ( new.suite_id IS NULL )
BEGIN
    :new.suite_id := suite_suite_id_seq.nextval;
END;
/

CREATE SEQUENCE suitepresidencial_suitepreside START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER suitepresidencial_suitepreside BEFORE
    INSERT ON suitepresidencial
    FOR EACH ROW
    WHEN ( new.suitepresidencial_id IS NULL )
BEGIN
    :new.suitepresidencial_id := suitepresidencial_suitepreside.nextval;
END;
/

CREATE SEQUENCE supermercado_supermercado_id START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER supermercado_supermercado_id BEFORE
    INSERT ON supermercado
    FOR EACH ROW
    WHEN ( new.supermercado_id IS NULL )
BEGIN
    :new.supermercado_id := supermercado_supermercado_id.nextval;
END;
/

CREATE SEQUENCE tienda_tienda_id_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER tienda_tienda_id_trg BEFORE
    INSERT ON tienda
    FOR EACH ROW
    WHEN ( new.tienda_id IS NULL )
BEGIN
    :new.tienda_id := tienda_tienda_id_seq.nextval;
END;
/

CREATE SEQUENCE usuario_usuario_id_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER usuario_usuario_id_trg BEFORE
    INSERT ON usuario
    FOR EACH ROW
    WHEN ( new.usuario_id IS NULL )
BEGIN
    :new.usuario_id := usuario_usuario_id_seq.nextval;
END;
/



-- Informe de Resumen de Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                            40
-- CREATE INDEX                            38
-- ALTER TABLE                            128
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                          29
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                         29
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                  79
-- WARNINGS                                 0
