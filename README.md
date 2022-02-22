# Exercicios-POO-com-TDD

Atividade 1:

Exercicio 1: Seguindo o diagrama UML a seguir, implemente a classe Veiculo e seus
métodos. Após a implementação, testar cada um dos métodos via console.
Atributos:
-marca: String, 
-modelo: String, 
-placa: String,
-cor: String,
-km: float,
-isLigado: boolean,
-litrosCombustivel: int,
-velocidade: int,
-preco: double
Métodos:
acelerar(): este método acrescenta um valor de 20 no atributo
velocidade.
abastecer(int combustivel): recebe como parâmetro uma quantidade de
combustível e atribui a listrosCombustivel. OBS: O limite do tanque de
combustível é de 60 litros, validar para não ultrapassar.
frear(): a cada chamada do método diminui a velocidade em 20. Não
aceitar a chamada do método se o veiculo estiver parado.
pintar(String cor): recebe uma cor como parâmetro e altera o atributo.
ligar(): Verifica se o veículo já se encontra ligado, caso não, liga o carro.
desligar(): Verifica se o veículo já se encontra desligado, caso não, desliga
o carro. Não permitir que desligue o veículo com (velocidade > 0).
getters/setters();


Exercicio 2: Seguindo o diagrama UML a seguir, implemente as classes, interfaces e as
saídas do programa. Após a implementação, testar cada um dos métodos via
console.
Interface: Imposto: 
+calculaImposto(): double - método para calcular imposto sobre um 
produto com a seguinte regra:
• Livros:
1. Se o livro for de tema = “educativo” não se deve cobrar 
imposto, retornar 0.
2. Caso seja de qualquer outro tema, calcular imposto de 10% 
sobre o preço do livro.
• Video Game:
1. Se o vídeo game for usado, calcular imposto de 25% sobre 
o preço do videogame.
2. Se o vídeo game não for usado, calcular imposto de 45% 
sobre o preço do videogame.
Classes:
Produto(Abstrato): 
-nome: String,
-preco: double,
-qtd: int
+contrutores()
+getters/setters();
Livro(extends Produto):
-autor: String,
-tema: String,
-qtdPaginas: int
+construtores()
+getters/setters()
VideoGame(extends Produto):
-marca: String,
-modelo: String,
-isUsado: boolean
+construtores()
+getters/setters()
Loja:
-nome: String,
-cnpj: String,
-livros: List<Livro>,
-videogames: List<VideoGame>
+construtores()
+getters/setters()
+listaLivros( ): lista todos os livros que uma loja tem, caso a 
lista de livros seja vazia, mostrar no console "A loja não tem 
livros no seu estoque.".
+listaVideoGames ( ): lista todos os vídeo games que uma 
loja tem, caso a lista de vídeo games seja vazia, mostrar no 
console "A loja não tem video-games no seu estoque.".
+calculaPatrimonio( ): Soma os preços de todos produtos da 
loja e retorna este valor como double.

Exercicio 3: 
Seguindo o diagrama UML, implemente as classes:
Personagem:
-nome: string,
-vida: int,
-mana: int,
-xp: float,
-inteligencia: int,
-forca: int,
-level: int
+contrutor()
+getters/setters()
+lvlUp(), de forma que o Mago ao subir de nível possua um aumento maior nos
atributos Mana e Inteligência e o Guerreiro possua um aumento maior nos
atributos Vida e Força.
Mago(extends Personagem):
-magia: list<String>,
+contrutor()
+getters/setters()
+aprenderMagia(String): adc magia na lista de magias
+attack() de forma que siga a seguinte regra:
Mago 🧹 : ( Inteligência * Level ) + numeroRandomico( 0 até 300 ).
Guerreiro(extends Personagem):
-habilidade: list<String>,
+contrutor()
+getters/setters()
+aprenderHabilidade(String): adc habildade na lista de habildades
+attack() de forma que siga a seguinte regra:
Guerreiro ⚔: ( Força * Level ) + numeroRandomico( 0 até 300 ).

  
Exercicio 7: Considerando os conceitos de Orientação a Objetos, crie uma classe Pai de
nome Funcionário com os seguintes atributos (nome, idade e salário) e mais
três classes Filhas (Gerente, Supervisor e Vendedor). 
Na classe Funcionário deve existir um método de nome bonificação que retorna o salário, 
nas classes filhas deve existir o mesmo método bonificação porem com as
seguintes regras:
Para Gerente, o método bonificação deve retornar o salário + 10000.00;
Para Supervisor, o método bonificação deve retornar o salário + 5000.00;
Para Vendedor, o método bonificação deve retornar o salário + 3000.00;
Por fim, criar uma classe principal que instancie objetos de Gerente,
Supervisor e Vendedor e adicione no mínimo um valor para cada atributo e
imprima cada funcionário (Gerente, Supervisor e Vendedor) com suas devidas
bonificações
  
  
Atividade 2: Entre Letras:
Faça um programa que receba duas letras, e diga quantas letras há entre elas. 
As letras passadas devem estar em ordem alfabtica. 
Se não estiverem o programa deve avisar o usuário. 
Exemplo: 'a' / 'b' = 0. 'a' / 'c' = 1. 'a' / 'z' = 24.'w' / 'e' = Não está na ordem alfabética.
