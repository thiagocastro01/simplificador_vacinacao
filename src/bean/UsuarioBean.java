package bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.PrimeFaces;

import dao.UsuarioDao;
import entidades.Usuario;

@ManagedBean
public class UsuarioBean {
	
	private Usuario usuario = new Usuario();
	
	public String salvar() {
		UsuarioDao.salvar(usuario);
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Cadastro feito com sucesso!");
        PrimeFaces.current().dialog().showMessageDynamic(message);
		usuario = new Usuario();
		return null;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}
