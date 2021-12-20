package entities.enums;

import exceptions.ColorNotFoundException;

public enum Color {
	BLACK("b", "black"), WHITE("w", "white"), RED("r", "red");

	private String codigo;
	private String descricao;

	private Color(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	

	public String getCodigo() {
		return codigo;
	}


	public String getDescricao() {
		return descricao;
	}


	public static Color getEnumByCodigo(String codigo) throws ColorNotFoundException  {		
		for (Color c : Color.values()) {
			if (c.getCodigo().equals(codigo)) {
				return c;
			}
		}
	 throw new ColorNotFoundException(codigo);
	}
}
