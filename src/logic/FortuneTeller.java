package logic;

import bean.Flower;
import java.util.Scanner;
import bean.*;

//Создать класс Годалка и метод погадать на ромашке.
//Гадалка умеет гадать на разные события (любовь, удача, и т.д.),
//для каждого события у гадалки есть набор варианттов ( от 3-х до 11)
//для каждого варианта у ромашки гадалка отрывает лепесток.
//Последний оторванный лепесток - есть результат гадания.
//Создать цветок "Ромашка" - и погодать!

public class FortuneTeller {

	private int userInInt;

	private String nameUser;

	int attempt = 0;

	private void createDivination() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Я тебе сейчас погоадаю! ");
		System.out.println("Как имя твое \"ищущий\"?");

		nameUser = sc.nextLine();

		System.out.println("Выбирите на что гадать:");
		System.out.println("1 - Любовь");
		System.out.println("2 - Удача");
		System.out.println("3 - Деньги");
		System.out.print("Сделай свой выбор: ");

		userInInt = sc.nextInt();

		if (userInInt >= 1 && userInInt <= 3) {

			if (userInInt == 1) {
				System.out.println("Гадалка: Ты ищешь 'Любовь'!");
			} else if (userInInt == 2) {
				System.out.println("Гадалка: Ты ищешь 'Удачу'!");
			} else if (userInInt == 3) {
				System.out.println("Гадалка: Ты ищешь 'Богатство'!");
			}

		} else {
			attempt++;
			if (attempt == 5) {
				System.out.println("Гадалка: Ты издеваешься? Выбири из того, что предлагают!!! \nГадалка: Пробуй еще!!!");
				System.out.println("--------------------------------------------------------------------");
				createDivination();
			} else {
				System.out.println("Гадалка: Нет такого варианта!!! \nГадалка: Пробуй еще!!!");
				System.out.println("---------------------------------------------------------------------");
				createDivination();
			}
		}
	}

	String[][] answers = { {},
			{ "У тебя будет большая любовь", "Tебе не везет в любви", "Эмм... Ну что сказать, не будет любви у тебя" },
			{ "Скоро ты влюбишься", "Ой! Да у тебя будет бэбик =)", "Каждый день и каждый час кто-то думает о вас. " },
			{ "Ждет тебя вскоре поездка на море!", "Пряники да сладости, будет много радости.",
					"Будет у тебя всегда в доме вкусная еда." } };

	public void predictWithFlower(Flower flower) {
		int countSelectArr = 0;
		createDivination();
		Leaf[] choosePetals = flower.getBud().getLeaves();

		for (int i = 0; i < choosePetals.length; i++) {

			System.out.println(answers[userInInt][countSelectArr]);

			if (i == choosePetals.length) {
				System.out.print("\"" + nameUser + "\" вот твое предсказание: " + answers[userInInt][countSelectArr]);
			} else {
				System.out.println(choosePetals.length - i + " - " + answers[userInInt][countSelectArr]);
			}
			countSelectArr++;
			if (countSelectArr == answers[userInInt].length - 1) {
				countSelectArr = 0;
			}
		}
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

}
