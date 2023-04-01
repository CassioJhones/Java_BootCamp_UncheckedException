# Java_UncheckedException

<img src="https://user-images.githubusercontent.com/56178855/227102981-d23dc2d4-3760-4b83-9286-a677e47b972f.gif" width=500px>

> Gif da execução

Este é um código Java que trata exceções de erros de entrada de dados e erros matemáticos ao realizar uma divisão.

A classe ``UncheckedException`` possui um método main que inicia a execução do programa. O código usa um loop do-while para solicitar ao usuário que digite o numerador e o denominador da divisão e chama o método dividir, que retorna o resultado da divisão entre os dois números.

O código contém dois blocos ``try-catch``. O primeiro captura a exceção ``NumberFormatException``, que ocorre quando o usuário fornece uma entrada inválida (por exemplo, um texto em vez de um número). O segundo captura a exceção ``ArithmeticException``, que ocorre quando o denominador é igual a zero. Ambos os blocos exibem uma mensagem de erro para o usuário por meio do método ``JOptionPane.showMessageDialog`` e evitam que o programa seja interrompido.

## JOptionPane
O ``JOptionPane`` é uma classe da biblioteca padrão do Java que fornece uma maneira fácil de exibir mensagens, solicitar entradas do usuário e exibir diálogos modais em um programa Java.

O JOptionPane é muito útil quando você deseja que seu programa interaja com o usuário por meio de janelas de diálogo. Ele fornece uma maneira fácil de criar janelas de diálogo pré-configuradas para exibir informações importantes ou solicitar entrada do usuário.

Algumas das opções de diálogo fornecidas pela classe JOptionPane incluem:

- Exibição de uma mensagem para o usuário em uma janela de diálogo.
- Exibição de um painel com uma mensagem personalizada e um botão "OK".
- Exibição de um painel com uma mensagem personalizada e botões "OK" e "Cancelar".
- Exibição de uma caixa de diálogo para solicitar entrada do usuário (por exemplo, para obter uma senha).
- Exibição de uma caixa de diálogo para escolher um arquivo ou diretório.
Em resumo, o JOptionPane é uma classe útil para lidar com a entrada e saída de dados do usuário em aplicativos Java e torna mais fácil para os desenvolvedores criar interfaces de usuário amigáveis e interativas.

## Projeto
Projeto criado como parte do Bootcamp BancoPan Java Developer na plataforma DIO
