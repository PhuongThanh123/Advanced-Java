package Exercise122Dictionary;

import java.util.TreeSet;

/**
 * @Author: Le Phuong Thanh 
 * @Date: 07/09/2016 
 * @Version: 1.0 
 * @Create Class management of Dictionary
 *
 */
public class ManagementDictionary {
	private TreeSet<Dictionary> treeSetDictionaries = new TreeSet<Dictionary>();

	public ManagementDictionary() {
		super();
	}

	public ManagementDictionary(TreeSet<Dictionary> treeSetDictionaries) {
		super();
		this.treeSetDictionaries = treeSetDictionaries;
	}

	public TreeSet<Dictionary> getTreeSetDictionaries() {
		return treeSetDictionaries;
	}

	public void setTreeSetDictionaries(TreeSet<Dictionary> treeSetDictionaries) {
		this.treeSetDictionaries = treeSetDictionaries;
	}

	@Override
	public String toString() {
		String s = "----------List Dictionary---------------\n";
		if (treeSetDictionaries.size() != 0) {

			s += "Word \t Meaning\n";
			for (Dictionary dictionary : treeSetDictionaries) {
				s+=dictionary.toString()+"\n";
				
			}
		} else {
			s += "Emtry!";
		}
		return s;
	}
	public Dictionary searchWord(String index){
		for (Dictionary dictionary : treeSetDictionaries) {
			if(dictionary.getWord().equals(index)){
				return dictionary;
			}
		}
		return null;
		
	}
	public void removeWord(Dictionary index){
		treeSetDictionaries.remove(index);
	}

}
