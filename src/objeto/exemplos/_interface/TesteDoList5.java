package objeto.exemplos._interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteDoList5 {
	static List<Amigo> lista = new ArrayList<>();

	public static void main(String[] args) {
		
		Amigo a = new Amigo();
		a.setNome("Beltrano");
		a.setEmail("bel@uol.com.br");
		a.setIdade(15);
		
		Amigo b = new Amigo("Fulano", "fufu@gmail.com");
		b.setNome(b.getNome() + " de Tal");
		b.setIdade(22);
	
		Amigo c = new Amigo("Beltrano", "bel@uol.com.br", 11);
		
		lista.add(b);
		lista.add(a);
		lista.add(c);
		
		Collections.sort(lista, (amigo1, amigo2) ->  amigo2.getIdade() - amigo1.getIdade() );
		
		for (Amigo amigo : lista) {
			System.out.println(amigo);
		}

		System.out.println("\n--------------------------------\n");

		Collections.sort(lista, (amigo1, amigo2) -> {
			int resposta = amigo1.getNome().compareTo(amigo2.getNome());

			if (resposta == 0)
				resposta = amigo2.getIdade() - amigo1.getIdade();

			return resposta;
		});
		
		for (Amigo amigo : lista) {
			System.out.println(amigo);
		}

	}
}
