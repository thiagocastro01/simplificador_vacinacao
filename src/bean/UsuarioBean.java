package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import dao.UsuarioDao;
import entidades.Usuario;

@ManagedBean
@RequestScoped
public class UsuarioBean {
	
	private Usuario usuario = new Usuario();
	
	public void salvar() {
		UsuarioDao.salvar(usuario);
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}
