/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maze_solver_project;

import GUI_MAZE_SOLVER.AppFrame;

/**
 *
 * @author PARAS
 */
public class NewClass 
{
    public static void main(String[]args)
    {
        //To create AppFrame we need a Maze of some length... let's create it..
        int[][]maze={ { 1,1,1,1,1,1,1,1,1,1,1,1,1},
            		{1,0,1,0,1,0,1,0,0,0,0,0,1},
            		{1,0,1,0,0,0,1,0,1,1,1,0,1}, 
            		{1,0,1,1,1,1,1,0,0,0/* */,0,0,1},
            		{1,0,0,1/**/,0,0,0,0,1,1,1,0,1}, 
            		{1,0,1,0,1,1,1,0,1/**/,0,0,0,1},
            		{1,0,1,0,1,0,0,0,1,1,1,0,1}, 
            		{1,0,1,0,1,1,1,0,1,0,1,0,1},
            		{1,0,0,0,0,0,0,0,0,0,1,9,1},
            	    {1,1,1,1,1,1,1,1,1,1,1,1,1}};
                AppFrame frame=new AppFrame(maze);  
                frame.setVisible(true);
    }
}
