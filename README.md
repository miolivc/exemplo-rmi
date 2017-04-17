# Exemplo simples de Aplicação Java RMI:

> Para executar a aplicação execute os seguintes comandos: 
1. Compile os arquivos necessários:
&nbsp;
	"javac Hello.java Server.java Client.java"
&nbsp;
2. Gere os stubs das classes que implementam a interface remota:
&nbsp;
	"rmic Server.java"
&nbsp;
4. Inicie o rmiregistry na porta desejada (default: 1099)
&nbsp;
	"rmiregistry 1099 &"
&nbsp;
3. Execute a aplicação servidora passando a permissão de segurança necessária:
&nbsp; 
	"java -Djava.security.policy=policy Server &"
&nbsp;
4. Execute a aplicação cliente:
&nbsp;
	"java Client"
&nbsp;
