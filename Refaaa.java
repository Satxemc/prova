package lopaquet;

public class Refaaa {
	public int sou;

	public Refaaa(int losou) {
		sou = losou;
	}

	public boolean EsBonempleat(int problemes) {
		if (problemes == 0) return true;
		else if (problemes < 3) {
			if (sou < 500) return true;
		}
		else return false;
		return false;
	}
}