# Curso Lambda, Streams e Optional do Java 8 (Completo)

Códigos feitos para o curso/playlist de Multithreading com Java, no canal RinaldoDev do YouTube.

* Playlist no YouTube: https://www.youtube.com/playlist?list=PLuYctAHjg89ZkhgOQo0zcTtmHY5nuRYud
* Canal no YouTube: https://www.youtube.com/rinaldodev

## Me siga para mais conteúdo gratuito!

* Twitter: https://twitter.com/rinaldodev
* LinkedIn: https://www.linkedin.com/in/rinaldodev/
* Facebook: https://www.facebook.com/rinaldodev/
* Twitch: https://www.twitch.tv/rinaldodev
* Site: https://rinaldo.dev

#####################################################################################################
-----------------------------------------------------------------------------------------------------

#stream intermediarias 
São intermediarias porque retorna outra stream podendo chamar outro metodo

skip(2):pula dois elementos.
limit(2):processa os dois primeiro elementos.
distinct:stream não permiti que processe elementos repitidos é necessario implementar equals e hashcode.
filter:filtra os elementos de acordo com a implementação
map:modifica/transforma os elementos. obs: alista original não altera os valores


#Stream Terminal
São terminais porque não retorna uma stream, então impede de chamar outro metodo.

count:retorna a quantidade da stream
min:retorna menor valor - podemos usar junto com min(comparetor.naturalOrdem()) - organiza de forma natural
max:retorna o maior valor
collect():retorna o resultado de uma forma mais personalizada.
collect(collectors.toList): retorna o resultado no formato de uma lista
collect(collectors.groupingBy):retorna o lista organizada em grupo
collect(collectors.joining(",")):metodo para string ele pode concatenar as mesma
    
#Optional:O optional tem uma vantagem de não retorna null

isPresent(): Se esta preenchido ou não
get():Pega o valor que dentro do optional
isPresent(op -> System.out.printLn(op)); Recebe uma expressão lambda mais só é executado se existir um valor dentro.
orElse(2):Se conseguir algo, se não entra no orElse que passa um valor como defaut
orElseGet():A diferença é que recebe uma lambda que podemos criar uma opração por exemplo
orElseThow():Se não consegui lança um Expetion