package managed.beans;

import dao.DiaDaSeamanaDao;
import dao.refeicaoDao;
import model.DiaDaSemana;

public class diaDaSemanaBean {

	DiaDaSemana dia = new DiaDaSemana();
	
	public void cadastrar(DiaDaSemana dia) {
		new DiaDaSeamanaDao().creat(this.dia);
	}
}
