# Spring_RestController
Ejemplo Basico de uso del RestController

Operaciones REST con JPA y dos entidades

Se realizaran las operaciones basicas con REST un CRUD básico(Insertar, eliminar, actualizar y listar) mas busqueda por id y nombre. En este caso tendremos dos entidades, Customer y Vehicle con relaciones OneToMany y ManyToOne. Los datos se crean automaticamente para una visualizacion de este ejemplo y la app esta progrda para crear la s tablas en la base de datos y al finalizar, eliminarlas. Para Cambiar ese proceso nos vamos al Property y cambiamos spring.jpa.hibernate.ddl-auto=create-drop spring.jpa.hibernate.ddl-auto=update La base de datos es MYSQL WORKBENCH Y el archivo import.sql es desde donde extrae todos los datos.
