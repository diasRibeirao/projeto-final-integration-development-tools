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

![image](https://user-images.githubusercontent.com/29930488/180606890-6caebf01-a9df-4923-816d-d35bfd381e5c.png)<br />
*Container com a imagem do zookepper e o kafka*<br />

### Com o container no ar, executar o projeto localmente (agro-tempo-producer e agro-tempo-consumer), no projeto agro-tempo-producer, via OpenApi, é mostrado os dois endpoints disponíveis (*http://localhost:8081/swagger-ui/index.html*).
![image](https://user-images.githubusercontent.com/29930488/180606932-5a8b1f5e-0eb6-4a9f-9609-7c3e6029ca7f.png)<br />
*•	O método /enviar permite realizar um POST com o objeto Drone.* <br />
*•	O método /enviar/lista permite realizar um POST com uma lista de objetos Drone.* <br /><br />

## PRINTS COM O FUNCIONAMENTO DA APLICAÇÃO
![image](https://user-images.githubusercontent.com/29930488/180614622-0f1caff3-7450-4595-940e-c4cb6ec7f0a2.png)
![image](https://user-images.githubusercontent.com/29930488/180614636-59fb02a2-f391-430c-91ac-14ebb5ba0ffa.png)
*Enviando um objeto drone com as informações coletadas*<br /><br />

![image](https://user-images.githubusercontent.com/29930488/180614779-3b8f5514-93a4-4b3a-a407-6dff584ce92a.png)
*Producer no ar e enviando informações coletadas do drone*<br /><br />

![image](https://user-images.githubusercontent.com/29930488/180614818-5980017f-d073-4da7-917c-1abab8d043dd.png)
*Consumer no ar e recebendo informações coletadas do drone*<br /><br />

![image](https://user-images.githubusercontent.com/29930488/180614962-9506ca42-0647-46c9-b66d-f894b3df014d.png)
*Enviando um objeto drone com as informações coletadas foram dos padrões de temperatura e umidade*<br /><br />

![image](https://user-images.githubusercontent.com/29930488/180614975-96b474c7-2a8a-4320-abb1-394c90fdae6a.png)
*Producer no ar e enviando informações coletadas do drone fora dos padões*<br /><br />

![image](https://user-images.githubusercontent.com/29930488/180615005-4384580f-102c-4b1a-92df-637513da55b6.png)
*Consumer no ar e recebendo informações coletadas do drone fora dos padrões. Informando o dado recebido e quais valores esperados*<br /><br />

![image](https://user-images.githubusercontent.com/29930488/180615102-5cde8bf2-5f1f-4b37-ae15-7c29c9bd650b.png)
![image](https://user-images.githubusercontent.com/29930488/180615123-c479d0d9-3feb-46c4-bf7e-4868ad66e658.png)
*Enviando uma lista objetos drone com as informações coletadas*<br /><br />

![image](https://user-images.githubusercontent.com/29930488/180615141-ee0ae82c-a309-4ef0-a521-717899995a5e.png)
*Producer no ar e enviando informações coletadas dos drones*<br /><br />

![image](https://user-images.githubusercontent.com/29930488/180615160-91d6f36c-965c-4b21-9bc8-a613b13dc817.png)
*Consumer no ar e recebendo informações coletadas dos drones*<br /><br />

![image](https://user-images.githubusercontent.com/29930488/180615209-466463a7-4889-4cf0-b7af-638422a894a2.png)
*Enviando uma lista objetos drone com as informações coletadas com um drone com informações fora dos padrões de temperatura e umidade*<br /><br />

![image](https://user-images.githubusercontent.com/29930488/180615307-a454d320-a840-440d-be0c-72175790874b.png)
*Producer no ar e enviando informações coletadas dos dronse*<br /><br />

![image](https://user-images.githubusercontent.com/29930488/180615255-8e69d797-7c08-4d11-aa74-ca4d141ba47a.png)
*Consumer no ar e recebendo informações coletadas dos drones, sendo que um deles de id 3 enviou dados fora dos padrões*<br /><br />



