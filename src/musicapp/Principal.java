package musicapp;

import musicapp.modelos.MinhasPreferidas;
import musicapp.modelos.Musica;
import musicapp.modelos.PodCast;

public class Principal {
	public static void main(String[] args) {
		Musica minhaMusica = new Musica();
		minhaMusica.setTitulo("Forever");
		minhaMusica.setCantor("Kiss");
		
		for(int i = 0; i < 1000; i++) {
			minhaMusica.reproduz();
		}
		
		for (int i = 0; i < 50; i++) {
			minhaMusica.curti();
		}
		
		PodCast meuPodcast = new PodCast();
		meuPodcast.setTitulo("BolhaDev");
		meuPodcast.setApresentador("Marcus Mendes");
		
		for (int i = 0; i < 5000; i++) {
			meuPodcast.reproduz();
		}
		
		for (int i = 0; i < 1000; i++) {
			meuPodcast.curti();
		}
		MinhasPreferidas preferidas = new MinhasPreferidas();
		preferidas.inclui(meuPodcast);
		preferidas.inclui(minhaMusica);
	}

}
