echo Compilando
mvn compile
::echo Ejecutando
::mvn exec:java -Dexec.mainClass="com.cursospring.main.App"  
mvn spring-boot:run