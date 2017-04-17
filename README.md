# Exemplo simples de Aplicação Java RMI:

> Para executar a aplicação execute os seguintes comandos: 
1. Compile os arquivos necessários:
	**"javac Hello.java Server.java Client.java"**
2. Gere os stubs das classes que implementam a interface remota:
	**"rmic Server.java"**
3. Inicie o rmiregistry na porta desejada (default: 1099)
	**"rmiregistry 1099 &"**
4. Execute a aplicação servidora passando a permissão de segurança necessária:
	**"java -Djava.security.policy=policy Server &"**
5. Execute a aplicação cliente:
	**"java Client"**
