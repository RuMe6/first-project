public class Praktikum {
	public static void main(String[] args) {
		int freeHours = 4; //переменная с количеством часов
		CheckReading(freeHours);
	}
}

public static void CheckReading(int freeHours) {
	if (freeHours >= 2) {
		for (int i = 1; i < 4; i++) {
			System.out.println("Прочитано " + i + " глав");
			}
	} else {
		System.out.println("Сегодня ничего не читал");
		}
}
