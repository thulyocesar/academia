import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Gravador {
	
	FileWriter fw;
	BufferedWriter bw;
	
	public Gravador(String nomeArquivo){
		try {
			fw = new FileWriter(nomeArquivo+".txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		bw = new BufferedWriter(fw);
	}

	public void GravarDados(String cont) throws IOException{
		bw.write(cont);
		bw.close();
	}
}

