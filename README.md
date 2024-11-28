# Aplicaçao de exemplo de uso de datasource gerenciado pelo JBOSS EAP 7.4

Esta aplicação de exemplo foi gerada utilizando o Eclipse Foundation starter for Jakarta EE no link https://start.jakarta.ee/ com as configurações abaixo.

* Jakarta Version EE: Jakarta EE 8
* Jakarta EE profile: Web Profile
* Java SE version: Java SE 17
* Runtime: WildFly
* Docker support: No



Para executar o aplicativo, basta rodar o comando a partir do diretório onde este arquivo está localizado. Antes de começar, verifique se você tem uma implementação Java SE compatível com a versão do Jakarta EE que está utilizando (este exemplo assume [Java SE](https://adoptium.net) 17).
Não se preocupe se você não tiver o Maven instalado, pois o [Maven Wrapper](https://maven.apache.org/wrapper/) já está incluído no projeto. Se necessário, você pode primeiro rodar o comando `chmod +x mvnw` para garantir que o script do Maven Wrapper tenha permissão de execução.


Observação importante:
Antes de executar o comando abaixo, que vai utilizar o wildfly provido na aplicação, garanta que a configuração do arquivo persistence.xml aponte para o datasource do banco em memória H2.

```
<jta-data-source>java:jboss/datasources/ExampleDS</jta-data-source>
```
```
./mvnw clean package wildfly:dev
```

Once the runtime starts, you can access the project at [http://localhost:8080/jbosseap-datasource-hello](http://localhost:8080/jbosseap-datasource-hello).

