package managed.beans;

import javax.faces.bean.ManagedBean;

import dao.filmesDao;
import model.filmes;

@ManagedBean
public class FilmeBean {

	private filmes filme = new filmes();

	public filmes getFilme() {
		return filme;
	}

	public void setFilme(filmes filme) {
		this.filme = filme;
	}
	
	public void salvar()
	{
		new filmesDao().create(this.filme);
	}
}
