// service faz o processamento
package app.service;

import org.springframework.stereotype.Service;

import app.entity.Entrada;
import app.entity.Resultado;

import java.util.Collections;

@Service
public class CalculosService {

	public Resultado calcular(Entrada entrada) {

		Resultado resultado = new Resultado();
		int soma = 0;

		if (entrada.getLista() != null) {
			for (int i = 0; i < entrada.getLista().size(); i++) {
				soma = soma + entrada.getLista().get(i);
			}

			resultado.setSoma(soma);

			double media = (double) resultado.getSoma() / entrada.getLista().size();
			resultado.setMedia(media);
		    
			Collections.sort(entrada.getLista());
			resultado.setMaiorNumero(entrada.getLista().get(entrada.getLista().size()-1));
			resultado.setMenorNumero(entrada.getLista().get(0));
			resultado.setTotalNumeros(entrada.getLista().size());

			return resultado;
		} else {
			return null;
		}
	}
}
