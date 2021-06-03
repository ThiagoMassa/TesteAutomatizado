# language: pt

Funcionalidade: Fazer login no Gmail

	Cenário: Credenciais inseridos corretamente
	Dado:  Tentativa de Login no Gmail
	Quando: For enviado as informações corretamente
	Entao: Informar a mesnagem "Sucesso: as credenciais são válidas!!"
	
	Cenário: Credenciais inseridos incorretamente 
	Dado:  Tentativa de Login no Gmail
	Quando: For enviado as informações incorretamente
	Entao: Informar a mesnagem "Erro: As credenciais são inválidas!!"