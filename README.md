 É um simples aplicativo de console em Java que utiliza a biblioteca Jsoup para fazer web scraping de dados de ações do site: https://www.fundamentus.com.br/index.php.

 Descrição
O aplicativo extrai informações financeiras detalhadas de uma ação específica e exibe-os no console.

Como Funciona
Conexão: O aplicativo se conecta à URL específica da ação no site Fundamentus.

Extração do Preço: Ele usa um seletor CSS específico (td.data.destaque.w3) para encontrar e extrair o preço atual da ação.

Extração de Detalhes: Em seguida, ele seleciona todas as linhas (tr) de uma tabela de detalhes (identificada pela classe .w728) e itera sobre elas.

Exibição: Para cada linha da tabela, ele extrai o nome do indicador (primeira coluna) e o seu valor (segunda coluna) e os imprime no console.

Tratamento de Erros: O código está envolto em um bloco try-catch para lidar com possíveis exceções durante a conexão ou o processo de scraping.

Dependências
Este projeto requer a biblioteca Jsoup. Se você estiver usando Maven, adicione a seguinte dependência ao seu pom.xml:

<dependency>
      <groupId>org.jsoup</groupId>
      <artifactId>jsoup</artifactId>
      <version>1.21.2</version>
</dependency>

Como Executar
Certifique-se de ter o Java instalado em seu sistema.

Adicione a biblioteca Jsoup ao seu projeto (seja via Maven, Gradle, ou baixando o .jar manualmente).

Compile e execute a classe App.java.

Os dados da ação serão impressos no console.
