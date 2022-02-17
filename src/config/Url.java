package config;

public class Url {

	private static String url = "https://fishingbooker:QAFBTest@qahiring.dev.fishingbooker.com/charters/view/16988";

	public Url() {

	}

	public Url(String url) {
		this.url = url;
	}

	public static String getUrl() {
		return url;
	}

}
