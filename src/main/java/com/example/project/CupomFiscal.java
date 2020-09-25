package com.example.project;

public class CupomFiscal {

	public static String dadosLojaParam(String nomeLoja, String logradouro, int numero, String complemento, String bairro, String municipio, String estado, String cep, String telefone, String observacao, String cnpj,String inscricaoEstadual) {
		if (nomeLoja == "") {
			throw new RuntimeException("O campo nome da loja é obrigatório");			
		}
		if (logradouro == ""){
			throw new RuntimeException("O campo logradouro do endereço é obrigatório");
		}		
		if (municipio == ""){
			throw new RuntimeException("O campo município do endereço é obrigatório");
		}
		if (estado == ""){
			throw new RuntimeException("O campo estado do endereço é obrigatório");
		} 
		if (cnpj == ""){
			throw new RuntimeException("O campo CNPJ da loja é obrigatório");
		} 
		if (inscricaoEstadual == ""){
			throw new RuntimeException("O campo inscrição estadual da loja é obrigatório");
		}

		String _NUMERO = "s/n";
		if (numero > 0){
			_NUMERO = Integer.toString(numero);
		}
		
		String _COMPLEMENTO = "";
		if (complemento != ""){
			_COMPLEMENTO = " " + complemento;
		}
	
		String _BAIRRO = "";
		if(bairro != ""){
			_BAIRRO = bairro + " - " ;
		}
	
		String _CEP = "";
		if(cep != "" && cep != null){
			_CEP = "CEP:" + cep;
		}
		
		String _TELEFONE = "";
		if(telefone != ""){
			_TELEFONE = "Tel " + telefone;

			if(cep != "" && cep != null){
				_TELEFONE = " " + _TELEFONE;
			}
		}		
	
		String _OBSERVACAO = "";
		if (observacao != ""){
			_OBSERVACAO = observacao;
		}

		String BREAK = System.lineSeparator();

		String nota = String.format("%s",nomeLoja) + BREAK;
		nota += String.format("%s, %s%s",logradouro,_NUMERO,_COMPLEMENTO) + BREAK;
		nota += String.format("%s%s - %s",_BAIRRO,municipio,estado) + BREAK;
		nota += String.format("%s%s",_CEP,_TELEFONE) + BREAK;
		nota += String.format("%s",_OBSERVACAO) + BREAK;
		nota += String.format("CNPJ: %s",cnpj) + BREAK;
		nota += String.format("IE: %s",inscricaoEstadual) + BREAK;
	
		return nota;
	}

}
