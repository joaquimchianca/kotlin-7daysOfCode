# Kotlin - 7 Days of Code

## Dia 1
Implementação de uma tela (interface gráfica) utilizando o Compose Desktop. Na tela, o título de um filme, poster e também sua nota no IMDB.
As impressões foram feitas manualmente, não há acesso a API nem nada do tipo, a imagem do poster se encontra na pasta `resources`.

<img src="/images/day1-ui.png" width="50%">

## Dia 2
Implementação da mesma tela do primeiro dia, porém utilizando uma biblioteca para puxar a imagem direto de um link, sem necessidade de download.
Armazena informações num InputStream, depois armazenamos as informações da imagem num ByteArray, para convertê-lo em ImageBitmap
