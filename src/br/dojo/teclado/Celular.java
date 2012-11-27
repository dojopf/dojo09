package br.dojo.teclado;

public class Celular {
	private char[][] text = 
			{{},{},
			 {'a', 'b', 'c'},
			 {'d', 'e', 'f'}};
	
	public char getCaracter(String in){
//		String numero[] = in.split("_");
		char numero[] = in.toCharArray();
		
		return this.text
			[Integer.parseInt
			 	(String.valueOf(numero[0]))]
			[numero.length-1];
	}
	
	public String getText(String in) {
		String[] numeros = in.split("");
		String caracter = "",
				retorno = "";
		//223
		for(int i=0; i<numeros.length; i++){
//			int j = i;
//			while((numeros[j].equals(numeros[j+1])) &&
//					(j < numeros.length)){
//				caracter += numeros[j];
//				j++;
//			}
//		}
			if(i == numeros.length - 1){
				caracter += numeros[i];
				retorno += this.getCaracter(caracter);
				break;
			}
			if(i == 0 || 
				numeros[i].equals(numeros[i+1])){
				caracter += numeros[i];
				
			}else{
				if(!numeros[i].equals("_")){
					caracter += numeros[i];
					retorno += this.getCaracter(caracter);
					caracter = "";
				} else{
					caracter = "";
				}
			}
		}
		return retorno;
	}
}
