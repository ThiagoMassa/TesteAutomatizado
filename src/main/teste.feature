# language: pt

Funcionalidade: Fazer login no Gmail

	Cen�rio: Credenciais inseridos corretamente
	Dado:  Tentativa de Login no Gmail
	Quando: For enviado as informa��es corretamente
	Entao: Informar a mesnagem "Sucesso: as credenciais s�o v�lidas!!"
	
	Cen�rio: Credenciais inseridos incorretamente 
	Dado:  Tentativa de Login no Gmail
	Quando: For enviado as informa��es incorretamente
	Entao: Informar a mesnagem "Erro: As credenciais s�o inv�lidas!!"