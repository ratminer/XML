import java.util.ArrayList;
import java.util.List;


public class Composite implements Element{

	private Tag tag;
	private List<Element> children;
	
	public Composite(String tagName){
		tag = new Tag(tagName);
		children = new ArrayList<>();
	}
	
	@Override
	public void addChild(Element e) {
		children.add(e);
	}

	@Override
	public void addTag(String tagName) {
		tag = new Tag(tagName);
	}

	@Override
	public void addContent(String content) {
	}

	@Override
	public String toString() {
		String s = "";
		s += tag.openTag() + "\n";
		for(Element e : children){
			s += e.toString() + "\n";
		}
		s += tag.closeTag();
		return s;
	}

}
