
public class htmlConverterApp {

	public static void main(String[] args) {
		String html = "<h1>Grocery List</h1>\n" + "<ul>\n" + " <li>Eggs</li>\n" + " <li>Milk</li>\n"
				+ " <li>Butter</li>\n" + "</ul>";

		// remove all closing tags
		String removeClosingTags = html.replaceAll("\\</.*?>", "");
		// remove all opening tags and replace with asteriks
		String removeOpeningTags = removeClosingTags.replaceAll("\\<.*?>", "*");
		// delete two asteriks with StringBuilder
		StringBuilder sb = new StringBuilder(removeOpeningTags);
		sb.deleteCharAt(0);
		sb.deleteCharAt(13);

		System.out.print(sb);

	}

}
