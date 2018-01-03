package bean;

//Создать объект класса Цветок, используя классы Лепесток, Бутон
//Методы: расцветки, завять, вывести на консоль бутона
//Создать  "Ромашка" и погодать

public class Flower {

	private String title;
	private Bud bud;
	private Stam stam;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Bud getBud() {
		return bud;
	}

	public void setBud(Bud bud) {
		this.bud = bud;
	}

	public Stam getStam() {
		return stam;
	}

	public void setStam(Stam stam) {
		this.stam = stam;
	}

	public Flower(String title, int stanH, int stanW) {
		this.title = title;
		stam = new Stam(stanH, stanW);
		bud = new Bud();
	}

	public void grow(int newStanH, int newStanW, int newBudSize) {
		this.stam.setHeight(newStanH);
		this.stam.setWidth(newStanW);
		this.bud.setSize(newBudSize);
	}

	public void bloom(int newBudSize, String newBudColor) {
		this.bud.setSize(newBudSize);
		this.bud.setColor(newBudColor);
		this.bud.addFreshLeaves(7, "white", "ellipse");
	}

	public void wither(int newStemH, int newStemW, int newBudSize, String newBudColor) {
		bud.setSize(newBudSize);
		bud.setColor(newBudColor);
		this.stam.setHeight(newStemH);
		this.stam.setWidth(newStemW);
		bud.leaveLeaves(newBudColor);

	}

}
