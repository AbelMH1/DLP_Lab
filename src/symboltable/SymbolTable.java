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

	public void set() {
		table.add(new HashMap<>());
		scope++;
	}
	
	public void reset() {
		table.remove(scope);
		scope--;
	}
	
	public boolean insert(Definition definition) {
		Map<String,Definition> st = table.get(scope);
		boolean isPresent = st.containsKey(definition.getName());
		if (!isPresent){
			definition.setScope(scope);
			st.put(definition.getName(), definition);
		}
		return !isPresent;
	}
	
	public Definition find(String id) {
		Definition def = null;
		for (int i = scope; def == null && i >= 0 ; i--)
			def = table.get(i).get(id);
		return def;
	}

	public Definition findInCurrentScope(String id) {
		return table.get(scope).get(id);
	}
}
