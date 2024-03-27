package symboltable;

import java.util.*;
import ast.Definition;

public class SymbolTable {
	
	private int scope=0;
	private List<Map<String,Definition>> table;
	public SymbolTable()  {
		table = new ArrayList<>();
		table.add(new HashMap<>());
	}

	/**
	 * Aumenta el ámbito en que se guardarán las definiciones siguientes a uno más concreto.
	 */
	public void set() {
		table.add(new HashMap<>());
		scope++;
	}

	/**
	 * Reduce el ámbito en que se guardarán las definiciones siguientes a uno más amplio.
	 */
	public void reset() {
		table.remove(scope);
		scope--;
	}

	/**
	 * Añade la definición recibida al ámbito actual.
	 * @param definition La definición a añadir a la Tabla de Símbolos.
	 * @return True si se añade correctamente, False si ya existe una definición con el mismo nombre en dicho ámbito.
	 */
	public boolean insert(Definition definition) {
		Map<String,Definition> st = table.get(scope);
		boolean isPresent = st.containsKey(definition.getName());
		if (!isPresent){
			definition.setScope(scope);
			st.put(definition.getName(), definition);
		}
		return !isPresent;
	}

	/**
	 * Busca la definición con el nombre recibido en el ámbito actual. Si no la encuentra busca en el ámbito superior
	 * y así hasta que la encuentre o se acaben los ámbitos.
	 * @param id El nombre de la definición a encontrar a la Tabla de Símbolos.
	 * @return La Definición si la encuentra, Null en caso contrario.
	 */
	public Definition find(String id) {
		Definition def = null;
		for (int i = scope; def == null && i >= 0 ; i--)
			def = table.get(i).get(id);
		return def;
	}

	/**
	 * Busca la definición con el nombre recibido exclusivamente en el ámbito actual.
	 * @param id El nombre de la definición a encontrar a la Tabla de Símbolos.
	 * @return La Definición si la encuentra, Null en caso contrario.
	 */
	public Definition findInCurrentScope(String id) {
		return table.get(scope).get(id);
	}
}
