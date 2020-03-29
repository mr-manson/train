package by.htp.les14.train;

import java.util.ArrayList;
import java.util.List;

public class TestTrain {

	public static void main(String[] args) {
		List<Train> trains = new ArrayList<Train>();
		
		Train tr = new Train("Минск", 012, new Date (2020, 2, 5, 1, 30));
		trains.add(tr);
		tr = new Train("Гродно", 123, new Date (2020, 2, 10, 2, 10));
		trains.add(tr);
		tr = new Train("Гродно", 123, new Date (2020, 2, 10, 12, 30));
		trains.add(tr);
		tr = new Train("Брест", 234, new Date (2020, 2, 15, 21, 05));
		trains.add(tr);
		tr = new Train("Витебск", 345, new Date (2020, 2, 20, 14, 00));
		trains.add(tr);
		tr = new Train("Гомель", 456, new Date (2020, 2, 25, 06, 55));
		trains.add(tr);
		
		
	}

}