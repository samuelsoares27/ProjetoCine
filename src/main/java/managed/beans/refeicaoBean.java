package managed.beans;

import dao.refeicaoDao;
import model.refeicao;

public class refeicaoBean {

	refeicao ref = new refeicao();
	
	public void cadastrar(refeicao ref) {
		new refeicaoDao().creat(this.ref);
	}
}
