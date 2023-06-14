/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_MAZE_SOLVER;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author PARAS
 */
public class AppFrame extends JFrame
{
    /*In this we need maze
    * 1] That maze will have boundry 
    *where 1--> will block of rectangle you cant't pass througnt it..
    * 0---> block from which you can pass.. 
    *9--> will be your destination... 
    */ 
    int[][]maze;
    
    //we need to store dtat somewhere we'll need List..
    private List<Integer> path=new ArrayList<>();
    private List<List<Integer>>ans=new ArrayList<>();
 
    
    /*lets have the constructor initialize everything..*/
    public AppFrame(int[][]Maze)
    {
        maze=Maze;
        //we have the maze..      
        
        setTitle("Maze Solver");
        setSize(640,640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        DepthFirst.searchPath(Maze, 1, 1, path,ans);
        System.out.println(path);
        
    }
    
    @Override
    public void paint(Graphics g)
    {
        //this graphics will show top left corner let's move it from there..
        g.translate(50,50);
       
        for(int i=0;i<maze.length;i++)
        {
            for(int j=0;j<maze[0].length;j++)
            {
                Color color;
                
                switch(maze[i][j])
                {
                    case 1:
                    {
                        color=Color.BLACK;break;
                    }
                    case 9:
                    {
                        color=Color.GREEN;break;
                    }
                    
                    default: 
                    {
                        color=Color.white;
                        break;
                    }
                }
            //after getting color..
            g.setColor(color);

            //fill the color in rectangle at that location..
            g.fillRect(60*j,60*i,60,60);
            
            g.setColor(Color.red);
            g.drawRect(60*j,60*i,60,60);
            }
        }
         int min=Integer.MAX_VALUE;
       for(List<Integer> al:ans)
       {
           min=Math.min(min, al.size());
           System.out.println(al);
       }
       for(List<Integer> al: ans)
       {
           if(al.size()==min)
           {
               path=al;break;
           }
       }
      
       
        for(int i=0;i<path.size();i+=2)
        {
            int x=path.get(i);
            int y=path.get(i+1);
            System.out.println(x+" "+y);
            
            // //let's set the color as we have the 
            g.setColor(Color.yellow);
            g.fillRect(60*x, 60*y, 60, 60);
        }
    }
}
