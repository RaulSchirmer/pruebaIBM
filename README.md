Este programa devolvera un fichero pruebaTXT.txt que contendrá un listado
de proveeedores dado un idCliente, si el cliente no tiene provedores el fichero 
contendra el siguiente mensaje: "No se encuentran proveedores para este cliente"

Priemro hay que establecer las variables de entorno JAVA_HOME y CLASSPATH

Su forma de ejecución sería:

java -jar pruebaIBM-0.0.1-SNAPSHOT.jar 1

Siendo 1 el identificador del cliente
El fichero de salida se genera en el mismo directorio donde se ejecute el jar

El acceso a la base de datos se hace mediante el usuario "administrador" con contraseña "Schirmer1979"

Dependencias:
mysql\mysql-connector-java\8.0.23\mysql-connector-java-8.0.23.jar
com\google\protobuf\protobuf-java\3.11.4\protobuf-java-3.11.4.jar
org\hibernate\hibernate-core\5.4.27.Final\hibernate-core-5.4.27.Final.jar
org\jboss\logging\jboss-logging\3.4.1.Final\jboss-logging-3.4.1.Final.jar
javax\persistence\javax.persistence-api\2.2\javax.persistence-api-2.2.jar
org\javassist\javassist\3.27.0-GA\javassist-3.27.0-GA.jar
net\bytebuddy\byte-buddy\1.10.17\byte-buddy-1.10.17.jar
antlr\antlr\2.7.7\antlr-2.7.7.jar
org\jboss\spec\javax\transaction\jboss-transaction-api_1.2_spec\1.1.1.Final\jboss-transaction-api_1.2_spec-1.1.1.Final.jar
org\jboss\jandex\2.1.3.Final\jandex-2.1.3.Final.jar
com\fasterxml\classmate\1.5.1\classmate-1.5.1.jar
javax\activation\javax.activation-api\1.2.0\javax.activation-api-1.2.0.jar
org\dom4j\dom4j\2.1.3\dom4j-2.1.3.jar
org\hibernate\common\hibernate-commons-annotations\5.1.2.Final\hibernate-commons-annotations-5.1.2.Final.jar
javax\xml\bind\jaxb-api\2.3.1\jaxb-api-2.3.1.jar
org\glassfish\jaxb\jaxb-runtime\2.3.1\jaxb-runtime-2.3.1.jar
org\glassfish\jaxb\txw2\2.3.1\txw2-2.3.1.jar
com\sun\istack\istack-commons-runtime\3.0.7\istack-commons-runtime-3.0.7.jar
org\jvnet\staxex\stax-ex\1.8\stax-ex-1.8.jar
com\sun\xml\fastinfoset\FastInfoset\1.2.15\FastInfoset-1.2.15.jar