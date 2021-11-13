# Notification Consumer

Aplicação usando Spring Web, Spring for RabbitMQ que faz consumo de mensagens do RabbitMQ.

### Pré-Requisitos

* Instalar/configurar o Java (versão 11);
* Ter alguma IDE para desenvolvimento, por exemplo, IntelliJ;
* Ter o Git e o Docker instalados.

### Download e Iniciando

As instruções abaixo possibilitará você fazer o download e configuração do projeto para sua máquina para fins de estudo, desenvolvimento, testes.

Fazer o clone do projeto do github e importar na IDE:
> git clone https://github.com/felipesm/notification-consumer.git

Executar o seguinte comando para fazer download da imagem do RabbitMQ:
> $ docker run -d --hostname localhost --name rabbitmq -p 15672:15672 -p 5672:5672 rabbitmq:3-management

Ao startar o container, você deverá ver as filas, exchanges, que foram criadas no projeto [producer](https://github.com/felipesm/notification-producer.git).

Para acessar a interface de gerenciamento do RabbitMQ utilizar a URL abaixo, digitando no seu usuário e senha **guest**.
> http://localhost:15672/

Ao startar a aplicação ela subirá na porta 8082 e deverá consumir as mensagens na fila e printar no console.
