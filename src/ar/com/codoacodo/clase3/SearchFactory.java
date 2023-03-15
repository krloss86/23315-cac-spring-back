package ar.com.codoacodo.clase3;

public class SearchFactory {

	public static ISearch getSearch(String key) {
		ISearch searchService;
		switch (key) {
			case "API":
				searchService = new ApiSearch();//Api				
				break;
			case "MYSQL":
				searchService = new MySqlSearch();			
				break;
			case "MONGO":
				searchService = new MongoSearch();//MONGO				
				break;
			case "pepeservice":
				searchService = new MongoSearch();//MONGO				
				break;
			default:
				throw new RuntimeException("NO existe implementacion para " + key);
		}
		return searchService;
	}
}
