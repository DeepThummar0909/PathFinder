# PathFinding Visualisation Tool

A Java Swing-based visualisation tool for exploring and comparing different pathfinding algorithms and heuristics.

## Features

- **Algorithms Supported:**
  - A* Search
  - Breadth-First Search (BFS)
  - Depth-First Search (DFS)
  - Dijkstra's Algorithm
  - Bi-directional A* and BFS

- **Heuristics:**
  - Manhattan Distance
  - Euclidean Distance

- **Grid Options:**
  - Adjustable grid size
  - Walls/obstacles (add/remove with mouse)
  - Diagonal movement (configurable)
  - Maze generation

- **Visualization:**
  - Step-by-step search animation
  - Adjustable search delay
  - Highlighted start, goal, walls, explored nodes, and solution path


### Controls

- **Start Search:** Begin the selected pathfinding algorithm.
- **Pause Search:** Pause the ongoing search.
- **Clear Walls:** Remove all obstacles from the grid.
- **Reset Grid:** Reset the grid and reposition start/goal.
- **Create Maze:** Generate a random maze.
- **Algorithm/Heuristic/Diagonals:** Select from dropdowns to change search behavior.
- **Bidirectional Search:** Toggle bi-directional search (where supported).
- **Delay Slider:** Adjust the speed of the visualization.
