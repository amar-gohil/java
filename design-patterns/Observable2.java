import java.util.ArrayList;

interface SportSubject {
	public void registerObserver(SportObserver o);

	public void unregisterObserver(SportObserver o);

	public void notifyObservers();
}

interface SportObserver {
	public void update(int runs, int wickets, float overs);
}

class CricketData implements SportSubject {

	int runs = 90;
	int wickets = 2;
	float overs = (float) 10.2;
	ArrayList<SportObserver> observerList = new ArrayList<>();

	@Override
	public void registerObserver(SportObserver o) {
		observerList.add(o);
	}

	@Override
	public void unregisterObserver(SportObserver o) {
		observerList.remove(o);
	}

	@Override
	public void notifyObservers() {
		observerList.stream().forEach(e -> e.update(runs, wickets, overs));
	}

	public void dataChanged() {
		notifyObservers();
	}
}

class AverageScoreDisplay implements SportObserver {

	private float runRate;
	private int predictedScore;

	public void update(int runs, int wickets, float overs) {
		this.runRate = (float) runs / overs;
		this.predictedScore = (int) (this.runRate * 50);
		display();
	}

	public void display() {
		System.out.println(
				"\nAverage Score Display: \n" + "Run Rate: " + runRate + "\nPredictedScore: " + predictedScore);
	}

}

class CurrentScoreDisplay implements SportObserver {
	private int runs, wickets;
	private float overs;

	public void update(int runs, int wickets, float overs) {
		this.runs = runs;
		this.wickets = wickets;
		this.overs = overs;
		display();
	}

	public void display() {
		System.out
				.println("\nCurrent Score Display:\n" + "Runs: " + runs + "\nWickets:" + wickets + "\nOvers: " + overs);
	}
}

public class Observable2 {
	public static void main(String[] args) {

		AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
		CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();

		CricketData cricketData = new CricketData();

		cricketData.registerObserver(averageScoreDisplay);
		cricketData.registerObserver(currentScoreDisplay);

		cricketData.dataChanged();

		cricketData.unregisterObserver(averageScoreDisplay);

		cricketData.dataChanged();
	}
}
