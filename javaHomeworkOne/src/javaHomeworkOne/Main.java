package javaHomeworkOne;

public class Main {

	public static void main(String[] args) {
		Category category1=new Category(12, "Programlama", "Engin Demiro�");
		Egitmen egitmen1=new Egitmen(15, "Engin Demiro�", "Java/React Kodlama");
		Category[] categories= {
				category1
		};
		for (Category category : categories) {
			System.out.println(category1.CategoryName);
		}
		Egitmen[] egitmens= {
				egitmen1
		};
		for (Egitmen egitmen : egitmens) {
			System.out.println(egitmen1.ConstructorName);
		}
		
		EgitmenManager egitmenManager = new EgitmenManager();
		egitmenManager.getInfoEgitmen(egitmen1);
		
		
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.getTheCategoryInformation(category1);
		
		
		
	}

}
