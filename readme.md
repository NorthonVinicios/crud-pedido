Olá, este projeto foi feito no netbeans 8.2 utilizando jdk 1.8, as dependencias e conectores utilizados estão na pasta crud-pedido/lib,
será necessario adiciona-los ao projeto.

O script para geração do banco de dados está em: crud-pedido\src\com\lanchonete\db\db.sql - ele também gera 5 clientes com ids de 1 a 5, o projeto não contem
um cadastro de clientes.

talvez seja necessario alterar os dados de conexão ao banco de dados, deixei metódos que retornam esses valores, portanto será necessario altera-los em poucos lugares

-crud-pedido\src\com\lanchonete\main\Main.java

public static String senha(){
        return "admin";
    }
public static String nome(){
    return "postgres";
}
public static String url(){
    return "jdbc:postgresql://localhost:5432/produto";
}

-crud-pedido\src\META-INF\persistence.xml
  <property name="javax.persistence.jdbc.url" value="jdbc:postgresql://localhost:5432/produto"/>
  <property name="javax.persistence.jdbc.user" value="postgres"/>
  <property name="javax.persistence.jdbc.password" value="admin"/>
  


