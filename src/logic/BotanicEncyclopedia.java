package logic;

import bean.Bud;
import bean.Flower;
import bean.Leaf;

public class BotanicEncyclopedia {

	public void printFlowerIn(Flower flower) {
		if (flower != null) {
			System.out.println("title: " + flower.getTitle());
			System.out.println("bud size, color: " + flower.getBud().getSize() + ", " + flower.getBud().getColor());
			System.out.println("stem height, width: " + flower.getStam().getHeight() + ", " + flower.getStam().getWidth());

			printLeaves(flower.getBud());

		}
	}

	private void printLeaves(Bud bud) {
		Leaf[] leaves = bud.getLeaves();
		if (bud != null && leaves != null) {
			for (Leaf leaf : leaves) {
				if (leaf != null) {
					System.out.println("leaf color, shape:  " + leaf.getColor() + ", " + leaf.getShape());
				} else {
					System.out.println("The petals fell.");
				}
			}
		} else if (bud != null) {
			System.out.println("There are no petals and they have not yet appeared.");
		}
	}

}
