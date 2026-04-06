package core;

public final class Heuristic {
	
	// ==== Constants ====
	
	public static final int MANHATTAN_DISTANCE = 0;
	public static final int EUCLIDEAN_DISTANCE = 1;
		
	public static final double SQRT_2 = Math.sqrt(2);

	
	// ==== Static Methods ====
	
	public static final double manhattanDistance(int dx, int dy) {
		return dx + dy;
	}
	
	public static final double euclideanDistance(int dx, int dy) {		
		return Math.sqrt(dx * dx + dy * dy);
	}
	
}
