package Genrics;

public class BasicOperation<v,t> {

	private v first;
	private t second;
	
	public BasicOperation (v first,t second) {
		this.first = first;
		this.second = second;
	}
	public void setFirst(v first) {
		this.first = first;
	}
	public v getFirst() {
		return first;
	}
	public void setSecond(t second) {
		this.second = second;
	}
	public t getSecond() {
		return second;
	}
}
