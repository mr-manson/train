package by.htp.les14.train;

import java.util.Scanner;

public class TrainInfo {
	
	public static void trainInfo(Train[] train) {
		Scanner s = new Scanner(System.in);
		System.out.println("Введите номер поезда");
		int a = s.nextInt();

		for (int i = 0; i < train.length; i++) {
			if (train[i].getNumber() == a) {
				System.out.println("Направление ");
			}
		}
	}
}
