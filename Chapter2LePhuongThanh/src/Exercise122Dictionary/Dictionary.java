package Exercise122Dictionary;
/**
 * @Author: Le Phuong Thanh 
 * @Date: 07/09/2016 
 * @Version: 1.0 
 * @Create Class handling Dictionary
 *
 */
public class Dictionary implements Comparable<Dictionary> {
	private String word;
	private String meaning;
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	public Dictionary(String word, String meaning) {
		super();
		this.word = word;
		this.meaning = meaning;
	}
	public Dictionary() {
		super();
	}
	@Override
	public String toString() {
		return word+"\t"+meaning;
	}
	@Override
	public int compareTo(Dictionary o) {
		return this.word.compareTo(o.word);
	}
	
	

}
