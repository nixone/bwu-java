package net.moergil.cortex;

public class HardcodedGenome extends Genome
{
	// 100 neurons, 18000 generations. Quite good.
	//private static final int[] steps = {1, 0, 3, 4, 1, 4, 0, 2, 0, 4, 3, 3, 0, 1, 4, 4, 3, 0, 3, 3, 3, 2, 0, 3, 1, 2, 0, 0, 1, 2, 4, 3, 2, 1, 1, 0, 1, 3, 1, 1, 2, 1, 0, 3, 3, 4, 4, 2, 0, 3, 4, 1, 3, 2, 0, 2, 3, 4, 0, 3, 3, 4, 4, 3, 1, 1, 1, 1, 4, 2, 3, 1, 3, 2, 3, 1, 4, 4, 3, 1, 2, 3, 0, 3, 0, 3, 0, 4, 1, 1, 2, 0, 1, 3, 3, 3, 1, 0, 1, 4};
	//private static final int[] connections = {43, 40, 31, 26, 99, 11, 0, 17, 12, 83, 1, 26, 62, 29, 71, 99, 74, 93, 1, 87, 47, 85, 52, 50, 81, 80, 2, 39, 69, 16, 66, 43, 19, 5, 31, 5, 65, 30, 70, 34, 20, 41, 25, 8, 74, 13, 63, 7, 41, 4, 50, 61, 66, 51, 5, 82, 46, 44, 3, 44, 58, 98, 69, 16, 49, 40, 24, 6, 6, 37, 7, 2, 7, 81, 7, 38, 30, 56, 79, 7, 8, 50, 58, 66, 8, 43, 55, 86, 20, 34, 90, 5, 26, 71, 83, 82, 33, 92, 9, 43, 51, 4, 35, 47, 10, 57, 10, 91, 22, 68, 97, 93, 11, 61, 32, 79, 11, 88, 20, 87, 25, 8, 29, 48, 30, 62, 10, 8, 27, 70, 94, 64, 13, 60, 16, 61, 78, 76, 37, 2, 38, 93, 78, 62, 87, 14, 80, 53, 42, 91, 7, 71, 15, 5, 74, 27, 14, 36, 47, 82, 0, 26, 88, 35, 21, 38, 86, 59, 78, 75, 17, 10, 93, 17, 24, 90, 38, 54, 63, 27, 69, 6, 67, 4, 18, 44, 18, 21, 54, 31, 74, 1, 88, 79, 48, 65, 99, 11, 56, 97, 67, 62, 20, 7, 20, 83, 93, 38, 14, 91, 33, 57, 95, 97, 10, 21, 47, 35, 32, 77, 42, 65, 78, 55, 59, 61, 27, 8, 19, 33, 96, 56, 23, 81, 34, 98, 23, 24, 5, 20, 16, 83, 88, 76, 55, 88, 88, 74, 23, 31, 89, 16, 56, 39, 77, 91, 82, 97, 83, 52, 26, 96, 31, 10, 26, 5, 31, 85, 12, 12, 76, 59, 62, 5, 69, 39, 33, 5, 27, 18, 50, 54, 91, 15, 64, 59, 91, 75, 51, 23, 51, 42, 4, 8, 41, 57, 54, 81, 31, 48, 34, 73, 32, 99, 72, 29, 79, 98, 96, 99, 55, 10, 31, 49, 53, 75, 80, 90, 41, 82, 89, 55, 42, 29, 95, 2, 31, 33, 32, 14, 30, 61, 48, 57, 34, 13, 35, 10, 29, 70, 29, 40, 55, 14, 91, 9, 99, 97, 18, 49, 4, 95, 69, 55, 35, 14, 57, 70, 35, 13, 96, 80, 73, 9, 55, 94, 36, 8, 69, 55, 29, 78, 37, 75, 23, 32, 89, 42, 56, 64, 38, 92, 47, 71, 38, 3, 79, 45, 53, 11, 33, 38, 9, 49, 15, 27, 39, 0, 40, 80, 62, 36, 4, 54, 40, 69, 43, 45, 40, 58, 61, 50, 22, 24, 53, 91, 93, 31, 25, 16, 67, 40, 24, 82, 56, 36, 1, 60, 53, 42, 77, 48, 12, 94, 31, 16, 33, 91, 43, 35, 45, 70, 34, 34, 75, 84, 44, 98, 9, 24, 23, 65, 3, 66, 45, 21, 17, 4, 53, 49, 71, 12, 46, 99, 96, 23, 84, 20, 6, 25, 7, 39, 13, 88, 41, 69, 28, 9, 64, 75, 35, 49, 0, 17, 15, 14, 88, 76, 4, 51, 42, 34, 84, 26, 40, 45, 25, 78, 20, 56, 50, 65, 87, 23, 92, 88, 50, 71, 21, 72, 34, 55, 34, 96, 8, 75, 66, 76, 12, 46, 52, 58, 75, 96, 24, 52, 20, 83, 62, 15, 53, 66, 69, 48, 31, 24, 62, 40, 20, 24, 60, 95, 12, 56, 38, 36, 51, 7, 68, 23, 81, 30, 83, 86, 19, 74, 48, 54, 31, 93, 28, 75, 93, 52, 97, 97, 88, 33, 56, 41, 65, 32, 55, 41, 96, 35, 57, 41, 34, 73, 70, 54, 27, 59, 86, 16, 42, 5, 32, 69, 59, 60, 55, 43, 19, 9, 3, 59, 46, 41, 70, 67, 43, 73, 71, 11, 60, 90, 37, 93, 61, 37, 9, 95, 70, 64, 94, 3, 5, 11, 62, 20, 84, 73, 84, 2, 62, 14, 79, 21, 22, 27, 84, 45, 89, 34, 63, 84, 55, 65, 5, 10, 31, 64, 60, 84, 10, 7, 82, 78, 41, 55, 65, 54, 95, 97, 65, 96, 29, 17, 41, 44, 88, 14, 85, 8, 41, 71, 16, 11, 74, 37, 12, 55, 12, 3, 76, 37, 1, 46, 68, 12, 25, 72, 78, 3, 48, 75, 61, 3, 32, 25, 67, 16, 98, 69, 12, 79, 25, 2, 67, 92, 70, 98, 36, 52, 1, 0, 49, 35, 45, 42, 38, 45, 71, 31, 8, 82, 20, 10, 40, 32, 71, 12, 84, 43, 40, 99, 78, 17, 73, 32, 45, 76, 49, 7, 6, 52, 80, 72, 19, 33, 51, 24, 56, 75, 74, 23, 29, 56, 75, 46, 75, 62, 45, 26, 34, 92, 95, 93, 18, 49, 22, 94, 68, 92, 92, 17, 60, 41, 76, 29, 21, 80, 17, 26, 58, 13, 78, 29, 87, 68, 78, 2, 81, 86, 57, 74, 51, 91, 3, 95, 62, 74, 14, 20, 2, 0, 26, 40, 80, 68, 62, 92, 20, 78, 80, 55, 80, 9, 81, 70, 81, 40, 75, 97, 68, 76, 19, 44, 35, 3, 46, 87, 32, 94, 82, 61, 22, 26, 6, 54, 83, 76, 50, 67, 47, 76, 64, 51, 60, 37, 28, 36, 94, 88, 5, 45, 81, 1, 57, 5, 50, 9, 6, 47, 49, 76, 98, 97, 14, 85, 69, 94, 84, 45, 64, 32, 86, 63, 87, 44, 77, 58, 45, 69, 50, 12, 9, 28, 56, 99, 93, 80, 83, 83, 25, 46, 76, 81, 37, 70, 78, 1, 78, 29, 22, 65, 89, 22, 9, 85, 47, 68, 11, 24, 25, 27, 63, 27, 34, 60, 91, 53, 86, 61, 56, 19, 91, 60, 5, 10, 41, 92, 92, 11, 19, 79, 76, 37, 24, 45, 93, 36, 20, 32, 10, 13, 69, 44, 58, 81, 48, 77, 94, 34, 83, 69, 51, 18, 64, 48, 19, 51, 84, 73, 90, 27, 26, 37, 96, 85, 96, 47, 10, 10, 94, 96, 96, 90, 35, 13, 29, 50, 53, 94, 35, 59, 14, 40, 45, 32, 72, 42, 0, 85, 52, 44, 98, 36, 99, 27, 15, 55, 54, 48, 71, 51, 99, 35};
	
	private static final int[] steps = {2, 0, 2, 4, 1, 0, 2, 2, 0, 3};
	private static final int[] connections = {2, 1, 7, 9, 1, 1, 3, 5, 2, 3, 6, 6, 9, 2, 1, 4, 1, 5, 7, 6, 8, 7, 8, 3, 5, 5, 5, 6, 2, 0, 3, 6, 4, 0, 8, 1, 7, 4, 9, 3, 4, 3, 4, 2, 8, 9, 3, 0, 1, 0, 0, 5, 5, 7, 9, 0, 5, 4, 7, 9, 5, 8, 9, 0, 2, 1, 1, 2, 3, 6, 1, 6, 4, 1, 0, 6, 4, 4, 7, 1, 3, 1, 1, 5, 1, 7, 7, 7, 2, 6, 2, 8, 7, 5, 7, 4, 5, 9, 5, 7};
	
	public HardcodedGenome()
	{
		super(steps, connections);
	}
}