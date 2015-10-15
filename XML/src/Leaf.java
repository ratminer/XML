
public class Leaf implements Element{

	private Tag tag;
	private String content;
	
	public Leaf(String tagName){
		this.tag = new Tag(tagName);
	}
	
	@Override
	public void addChild(Element e) {
	}

	@Override
	public void addTag(String tagName) {
		this.tag = new Tag(tagName);
	}

	@Override
	public void addContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		String s = "";
		s += tag.openTag();
		s += content.toString();
		s += tag.closeTag();
		return s;
	}

}
