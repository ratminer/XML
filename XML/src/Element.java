
public interface Element {
	
	public void addChild(Element e);
	
	public void addTag(String tagName);
	
	public void addContent(String content);
	
	public String toString();
}
