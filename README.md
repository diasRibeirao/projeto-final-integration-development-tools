# INFORMAÇÕES DO TRABALHO 
<br />

## TURMA / DISCIPLINA / PROFESSOR
### 41SCJ / INTEGRATIONS & DEVELOPMENT TOOLS / RAFAEL THOMAZELLI MAZZUCATO
<br />

## TIPO AVALIAÇÃO
### Avaliação Total da Disciplina
<br />

## TÍTULO
#### Avaliação Final 41SCJ - Integration e Development Tools
<br />

## DESCRIÇÃO
#### Trabalho de conclusão da matéria SCJ - Integration e Development Tools.
#### Leia o arquivo em anexo (diretório doc no repositório) e realize a prova entregando o codigo fonte solicitado num arquivo txt ou word contendo as URLs do git solicitadas.
<br />


## ALUNOS 
#### Emerson Dias - 341060  
#### Marco Antonio - 341785  
<br />

## SOBRE A PROJETO
### Implementação de um Producer e um Consumer no Apache Kafka, utilizando Java com Spring Boot na versão 2.7.1 e Docker.
### O projeto possui dois serviços:
**agro-tempo-producer:** Responsável por receber e enviar os dados de um objeto drone ou uma lista de objetos drone para o serviço de consumer.<br />
**agro-tempo-consumer:** Responsável por consumir os dados enviados do producer, caso a temperatura seja maior ou igual a 35 ou menor ou igual 0, ou a umidade seja menor ou igual a 15% envia e-mail com o o id_drone e os valores capturados.
<br />

## COMO RODAR O PROJETO?
#### Primeiro clonar o respositório do GitHub
git clone https://github.com/diasRibeirao/projeto-final-integration-development-tools.git <br />
#### Será necessário rodar o docker-compose.yml para subir uma instancia local do Kafka e do Zookepper
Dentro do diretório com o arquivo *docker-compose.yml*, executar o comando *docker-compose up –d* <br />
![image](https://user-images.githubusercontent.com/29930488/180606822-a4e1b760-06b0-4124-89c4-a7a5ee400b52.png)<br />
*console com o comando docker-compose up –d*<br /><br />

![image](https://user-images.githubusercontent.com/29930488/180606890-6caebf01-a9df-4923-816d-d35bfd381e5c.png)
*Container com a imagem do zookepper e o kafka*<br /><br />

### Com o container no ar, executar o projeto localmente (agro-tempo-producer e agro-tempo-consumer), no projeto agro-tempo-producer, via OpenApi, é mostrado os dois endpoints disponíveis (*http://localhost:8081/swagger-ui/index.html*).
![image](https://user-images.githubusercontent.com/29930488/180606932-5a8b1f5e-0eb6-4a9f-9609-7c3e6029ca7f.png)<br />
*•	O método /enviar permite realizar um POST com o objeto Drone.* <br />
*•	O método /enviar/lista permite realizar um POST com uma lista de objetos Drone.* <br />

## PRINTS COM O FUNCIONAMENTO DA APLICAÇÃO




