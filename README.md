# TesteAutomatizado



Nesse projeto iremos realizar testes automatizados deautenticador das credenciais do usuário no Gmail.

Para realizarmos o projeto é necessário instalar a IDE Eclipse(<https://www.eclipse.org/downloads/>),baixar JAVA SDK (<https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html>),estar usando o Google Chrome e baixar o ChromeDrive- WebDrive da sua versão instalada(<https://sites.google.com/a/chromium.org/chromedriver/downloads>), baixar o Selenium para JAVA (<https://www.selenium.dev/downloads/>)  e subir os arquivos pelo caminho Project >Properties >Java Build Path > Add External JARs. Para o cucumber é nescessario criar um arquivo com o nome desejado (xxxx.feature) e adicionar o plugin que a IDE indica. 

 

Nesse projeto o usuário ira informar suas credenciais no sistema e por meio da automatização o sistema irá abrir a pagina especifica e preencher com os campos informados pelo usuário, em caso das informações fornecidas tenham sido invalidas ele irá informar a mensagem “Erro: As credenciais são inválidas!!", e em caso delas serem válidas irai nformar "Sucesso: as credenciais são válidas!!".