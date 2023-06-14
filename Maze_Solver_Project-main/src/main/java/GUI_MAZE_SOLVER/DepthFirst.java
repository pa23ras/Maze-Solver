/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_MAZE_SOLVER;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PARAS
 */
public class DepthFirst
{
    public static boolean searchPath(int[][]maze,int x,int y,List<Integer> path,List<List<Integer>>ans)
    {
            if(x<0 || y<0 || y==maze.length || x==maze[0].length)return false;
        if(maze[y][x]==9){
            //this means on destination...
            path.add(x);
            path.add(y);
            ans.add(path);
            return true;
        }
        if(maze[y][x]!=0)return false;  
        path.add(x);
        path.add(y);
        if(maze[y][x]==0)
        {
            //means safe place to go...
            //first mark the location..
            maze[y][x]=2;   /*Makred it visited*/
            int[]dy={0,0,-1,1};
            int[]dx={-1,1,0,0};
            for(int i=0;i<4;i++)
            {
                int nx=x+dx[i];
                int ny=y+dy[i];
                searchPath(maze,nx,ny,new ArrayList<>(path),ans);                
                  
            }          
        }
        maze[y][x]=0;
        return false;
    }
}
