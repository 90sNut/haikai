package com.mkyong;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import com.mkyong.user.bo.UserBo;

@Named
@Scope("session")
public class UserBean implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	UserBo userBo;
	
	String batata = "nao tem nada";

	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}

	public String printMsgFromSpring() {
		return userBo.getMessage() + " - " + batata;
	}
	
	public String getBatata() {
		return this.batata;
	}
	
	public void setBatata(String batata) {
		System.out.println(batata);
		this.batata = batata;
	}

	public void atualizaBatata(){
		
	}
	
	public List<Item> getLista(){
		List<Item> lista = new ArrayList<>();
		lista.add(new Item("Daniel", 1));
		lista.add(new Item("Batrakius", 5));
		lista.add(new Item("Carniel", 25));
		return lista;
	}
}