# Proyecto_Programacion_III

El proyecto consiste en una aplicación que permite controlar la asitencia a la semana de sistemas de la Facultad Multidiciplinaria Oriental.


En dicho proyecto se desarrolló utilizando el lenguaje de programación Java y se estableció la conexión a bases de datos en pgAdmin a través de Java Persistence API.

Para crear las tablas de la base de datos debe utilizar las siguientes consultas:

    CREATE TABLE tbl_estudiantes(
      id_estudiante SERIAL PRIMARY KEY,
      nombres_apellidos VARCHAR(100),
      carnet VARCHAR(50),
      annio_carrera INT
    );
    
    CREATE TABLE tbl_talleresponencias(
      id_tallerponencia SERIAL PRIMARY KEY,
      nombre VARCHAR(50),
      nombre_encargado VARCHAR(100),
      lugar VARCHAR(100),
      fecha VARCHAR(25),
      hora VARCHAR(50)
    );
    
    CREATE TABLE tbl_asistencia(
      id_asistencia SERIAL PRIMARY KEY,
      id_tallerponencia INT,
      id_estudiante INT,
      CONSTRAINT fk_asistencia_estudiante FOREIGN KEY (id_estudiante)	REFERENCES tbl_estudiantes(id_estudiante),
      CONSTRAINT fk_asistencia_tallerponencia FOREIGN KEY (id_tallerponencia) REFERENCES tbl_talleresponencias(id_tallerponencia)
    );
    
    
