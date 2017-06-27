/**
 * 
 */
package cs2114.mazesolver;

import java.util.Stack;

/**
 * @author Romeo
 * @version 2017/30/03 something
 */
public class Maze implements IMaze {
    private MazeCell[][] maze;
    private int size;
    private Location start;
    private Location goal;

    @Override
    public int size() {
        return this.size;
    }

    /**
     * @param size
     *            of the maze Constructor of the Maze
     */
    public Maze(int size) {
        this.size = size;
        this.maze = new MazeCell[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.maze[i][j] = MazeCell.UNEXPLORED;
            }
        }
        this.start = new Location(0, 0);
        this.goal = new Location(size - 1, size - 1);
    }

    @Override
    public ILocation getStartLocation() {
        return this.start;
    }

    @Override
    public void setStartLocation(ILocation location) {
        if (getCell(location) != MazeCell.INVALID_CELL) {
            if (getCell(location) == MazeCell.WALL) {
                maze[location.x()][location.y()] = MazeCell.UNEXPLORED;
            }
            start = (Location) location;
        }
    }

    @Override
    public ILocation getGoalLocation() {
        return this.goal;
    }

    @Override
    public void setGoalLocation(ILocation location) {
        if (getCell(location) != MazeCell.INVALID_CELL) {
            if (getCell(location) == MazeCell.WALL) {
                maze[location.x()][location.y()] = MazeCell.UNEXPLORED;
            }
            goal = (Location) location;
        }
    }

    @Override
    public MazeCell getCell(ILocation location) {
        if (location.x() >= this.size || location.y() >= this.size
                || location.x() < 0 || location.y() < 0) {
            return MazeCell.INVALID_CELL;
        }
        else {
            return maze[location.x()][location.y()];
        }
    }

    @Override
    public void setCell(ILocation location, MazeCell cell) {
        if ((!(location.equals(start) || location.equals(goal))
                || cell != MazeCell.WALL) 
                && getCell(location) != MazeCell.INVALID_CELL) {
            maze[location.x()][location.y()] = cell;
        }
        else {
            //
        }
    }

    @Override
    public String solve() {
        Stack<Location> stack = new Stack<Location>();
        stack.push(start);
        ILocation curr = stack.peek();
        this.setCell(curr, MazeCell.CURRENT_PATH);
        String x = "";
        while (!stack.peek().equals(getGoalLocation())) {
            if (this.getCell(curr.south()) == MazeCell.UNEXPLORED) {
                curr = curr.south();
                stack.push((Location) curr);
                this.setCell(curr, MazeCell.CURRENT_PATH);
            }
            else if (this.getCell(curr.east()) == MazeCell.UNEXPLORED) {
                curr = curr.east();
                stack.push((Location) curr);
                this.setCell(curr, MazeCell.CURRENT_PATH);
            }
            else if (this.getCell(curr.north()) == MazeCell.UNEXPLORED) {
                curr = curr.north();
                stack.push((Location) curr);
                this.setCell(curr, MazeCell.CURRENT_PATH);
            }
            else if (this.getCell(curr.west()) == MazeCell.UNEXPLORED) {
                curr = curr.west();
                stack.push((Location) curr);
                this.setCell(curr, MazeCell.CURRENT_PATH);
            }
            else {
                this.setCell(stack.pop(), MazeCell.FAILED_PATH);
                if (stack.size() == 0) {
                    return null;
                }
                curr = stack.peek();
            }
            stack.push((Location) curr);
            this.setCell(curr, MazeCell.CURRENT_PATH);
        }

        while (!stack.isEmpty()) {
            x = (stack.pop()).toString() + x;
        }
        return x;
    }
}
