/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queues;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adesh Srivastava
 */
class Point 
{
	int x;
	int y;

	int length;
	boolean isTraversed; 

	List<Point> neighbours = new ArrayList<>();
	Point parent = null;

	Point(int x, int y) 
        {
            this.x = x;
            this.y = y;
	}

	public int getX() 
        {
            return x;
	}

	public int getY() 
        {
            return y;
	}

	@Override
	public int hashCode() 
        {
            final int prime = 31;
            int result = 1;
            result = prime * result + x;
            result = prime * result + y;
            return result;
	}

	@Override
	public boolean equals(Object obj)
        {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	public int getLength()
        {
		return length;
	}

    @Override
    public String toString()
    {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

        
        

	public void setLength(int length) 
        {
		this.length = length;
	}

	public boolean isTraversed() 
        {
		return isTraversed;
	}

	public void setTraversed(boolean isTraversed) 
        {
		this.isTraversed = isTraversed;
	}

	public List<Point> getNeighbours() 
        {
		return neighbours;
	}

	public void setNeighbours(List<Point> neighbours) 
        {
		this.neighbours = neighbours;
	}

	public Point getParent() 
        {
		return parent;
	}

	public void setParent(Point parent) 
        {
		this.parent = parent;
	}

}