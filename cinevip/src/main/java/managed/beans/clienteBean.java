package managed.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import dao.cartaoDao;
import dao.clienteDao;
import model.cliente;
import model.cartao;

@ManagedBean
@ViewScoped
public class clienteBean {

	cliente cli  = new cliente();
	cartao  card = new cartao();
	
	public cartao getCard() {
		return card;
	}

	public void setCard(cartao card) {
		this.card = card;
	}

	public cliente clientes() {
		return this.cli;
	}
	
	public void criarCliente() {
		cli.setCard(card);
		new cartaoDao().creat(this.card);
		new clienteDao().creat(this.cli);
	}
	
	/*public String valida(String cpf, String senha){
		cliente c =  new clienteDao().ValidaCliente(cli.getCpf(), cli.getSenha());
		
		if(c == null) {
			FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário não encontrado!",
                                "Erro no Login!"));
			return null;
		}else {
			
			return "/AdmCLiente";
		}
	
		return "/AdmCLiente";
	
	}*/
}
