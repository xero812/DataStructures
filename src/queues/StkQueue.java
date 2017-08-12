package queues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;




/*


3
...
...
...
0 0 2 1
*/






public class StkQueue 
{

    private static Deque<Point> queue = new ArrayDeque<>();

    private static Map<String, Point> store = new HashMap<String, Point>();

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
        int[][] grid = new int[N][N];
	for (int i = 0; i < N; i++) 
        {
            String str = sc.next();
            for (int j = 0; j < N; j++) 
            {
		char c = str.charAt(j);
		grid[i][j] = (c == '.') ? 0 : 1;
            }
        }
	int a = sc.nextInt();
        int b = sc.nextInt();
	Point source = getCoordinates(a, b);
        int c = sc.nextInt();
	int d = sc.nextInt();
        Point destination = getCoordinates(c, d);
	queue.add(source);
	System.out.println(search(source, destination, grid));
       // System.out.println(getNeighbours(source, destination, grid));
    }

    public static int search(Point src, Point dest, int[][] grid) 
    {
        Point s = queue.poll();
	int min = -99;
	while (s != null) 
        {
            
            List<Point> neighbours = getNeighbours(s, dest, grid);
            if (s.isTraversed() == true) 
            {
		s = queue.poll();
		continue;
            }
            if (neighbours.contains(dest)) 
            {
                return s.getLength() + 1;
            } 
            if (neighbours.size() > 0) 
            {
		queue.addAll(neighbours);
		update(s, dest, neighbours);
            } 
            s.setTraversed(true);
            s = queue.poll();
        }
        return min;
    }

	public static void update(Point src, Point dest, List<Point> neighbours) 
        {

		for (Point p : neighbours) 
                {
			int a = p.getX();
			int b = p.getY();
			if (p.getLength() == 0)
				p.setLength(src.getLength() + 1);

		}

	}

	public static List<Point> getNeighbours(Point source, Point dest, int[][] grid) 
        {

		int a = source.getX();
		int b = source.getY();
		
		int N = grid.length;
		List<Point> pts = new ArrayList<>();

		int b1 = b + 1;
		while (b1 <= N - 1 && grid[a][b1] != 1) {
			Point right = getCoordinates(a, b1);
			pts.add(right);
			b1++;

		}

		b1 = b - 1;
		while (b1 >= 0 && grid[a][b1] != 1) {
			Point left = getCoordinates(a, b1);
			pts.add(left);
			b1--;

		}
		b1 = b1 + 1;

		if (b1 < b) {

		}

		int a1 = a + 1;
		while (a1 <= N - 1 && grid[a1][b] != 1) {
			Point up = getCoordinates(a1, b);
			pts.add(up);
			a1++;

		}
		a1 = a1 - 1;
		if (a1 > a) {

		}

		a1 = a - 1;
		while (a1 >= 0 && grid[a1][b] != 1) {
			Point down = getCoordinates(a1, b);
			pts.add(down);
			a1--;

		}
		a1 = a1 + 1;
		if (a1 < a) {

		}

		return pts;

	}

	
	public static Point getCoordinates(int a, int b) 
        {

		String key = a + "," + b;
		if (store.containsKey(key)) 
                {
			return store.get(key);
		} 
                else 
                {
			Point p = new Point(a, b);
			store.put(key, p);
			return p;
		}

	}

}

