README.md
Execução de uma API Java no IntelliJ IDEA
Este guia fornece as etapas necessárias para configurar e executar uma API Java utilizando o IntelliJ IDEA.

Pré-requisitos
IntelliJ IDEA: Certifique-se de ter o IntelliJ IDEA instalado em sua máquina. Você pode baixar a versão Community ou Ultimate aqui.
Java Development Kit (JDK): Instale o JDK (versão 8 ou superior). Você pode baixar a versão mais recente do JDK aqui.
Maven: Caso utilize Maven como ferramenta de build, tenha o Maven instalado. IntelliJ IDEA pode gerenciar o Maven internamente, mas também pode ser configurado externamente. Baixe-o aqui.
Passos para Configurar e Executar a API

Clone o Repositório:

git clone https://github.com/IgorSouza4489/javaAPI

Abrir o Projeto no IntelliJ IDEA:

Abra o IntelliJ IDEA.
Clique em Open e selecione a pasta do projeto clonado.
O IntelliJ IDEA irá detectar automaticamente o projeto Maven (se aplicável) e fará o download das dependências necessárias.
Configurar o JDK:

Vá para File > Project Structure > Project.
Em Project SDK, selecione o JDK instalado. Se não estiver listado, clique em New > JDK e navegue até o diretório onde o JDK está instalado.
Build do Projeto:

Vá para View > Tool Windows > Maven (se o projeto for Maven).
No painel Maven, clique em Reload All Maven Projects para garantir que todas as dependências estão corretamente configuradas.
Para outros tipos de projeto, use Build > Build Project.
Configuração de Run/Debug:

Vá para Run > Edit Configurations.
Clique no botão + e selecione Application.
Configure da seguinte forma:
Main class: Insira a classe principal que contém o método public static void main(String[] args).
Use classpath of module: Selecione o módulo principal do projeto.
Executar a API:

Após configurar a Run Configuration, clique em Run > Run 'NomeDaConfiguracao'.
O IntelliJ IDEA irá compilar e iniciar a aplicação. Verifique o console para ver as mensagens de log e assegurar que a API está funcionando corretamente.
Testar a API:

Utilize ferramentas como Postman, curl ou o seu navegador para testar os endpoints da API.
Acesse http://localhost:8080 (ou a porta configurada) para verificar se a API está respondendo como esperado.

