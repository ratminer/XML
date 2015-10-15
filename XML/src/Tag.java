
public class Tag {
	
	private String name;
	
	public Tag(String name){
		this.name = name;
	}
	
	public String openTag(){
		return "<" + name + ">";
	}
	
	public String closeTag(){
		return "</" + name + ">";
	}
}
