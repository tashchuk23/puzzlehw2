package com.example.puzzlehw2;

import android.view.View;
import java.util.Random;

import java.util.ArrayList;

public class BoardController implements View.OnClickListener {

    private BoardView boardView;
    private BoardModel boardModel;
    //public Color;

    int[][] boardPositions =
            //array which holds the number of each position on the board
            //to be compared to the value of the button to determine if the
            //button is in the right spot on the board
            {
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}
            };

    int[][] randomBoard = new int[4][4];


    public BoardController(BoardView bv){
        boardView = bv;

    }

    @Override
    public void onClick(View view) {

    }

    public boolean isBoardComplete(int[][]correctBoard, int[][]currentBoard){

        for (int r = 0; r < 3; r++){
            for (int c = 0; c < 3; c++){
                if (correctBoard[r][c] != currentBoard[r][c]){
                    return false;
                }


            }
        }

        //if its true, just set the background of the game to be green
        return true;
    }


    public int[][] buildBoard(int[][] randomBoard ){
        randomBoard = new int[4][4];
        ArrayList <Integer> randArrayList = new ArrayList<Integer>();
        for (int r = 1; r < 17; r++){
            randArrayList.add(r);
        }


        for (int r = 0; r < 3; r++){
            for (int c = 0; c < 3; c++){
                int randomIndex = (int)Math.random() * randArrayList.size();
                randomBoard[r][c] = randArrayList.get(randomIndex);
                randArrayList.remove(randomIndex);
            }
        }

        return randomBoard;
    }

    //if theres a click, check the 4 surrounding sides
    //and switch the button labels with the first blank space you find
    public void move(int[][]randomBoard, int r, int c){

        if (checkAbove(r, c, randomBoard)){
            //switch the given r c with the above space's r c in randomboard
            int temp = randomBoard[r-1][c];  //hold the above spot
            randomBoard[r-1][c] = randomBoard[r][c];
            randomBoard[r][c] = temp;
        }
        else if (checkBelow(r, c, randomBoard)){
            //switch the given r c with the above space's r c in randomboard
            int temp = randomBoard[r+1][c];  //holds the below spot
            randomBoard[r+1][c] = randomBoard[r][c];
            randomBoard[r][c] = temp;
        }
        else if (checkLeft(r, c, randomBoard)){
            //switch the given r c with the above space's r c in randomboard
            int temp = randomBoard[r][c-1];  //holds the left spot
            randomBoard[r][c-1] = randomBoard[r][c];
            randomBoard[r][c] = temp;
        }
        else if (checkRight(r, c, randomBoard)){
            //switch the given r c with the above space's r c in randomboard
            int temp = randomBoard[r][c+1];  //holds the left spot
            randomBoard[r][c+1] = randomBoard[r][c];
            randomBoard[r][c] = temp;
        }
    }

    public boolean checkAbove(int r, int c, int[][]randomBoard){
        randomBoard = this.randomBoard;

        if (r == 0){ //bounds checking, return false if its top row
            return false;
        }
        return randomBoard[r + 1][c] == 16;  //return whether or not space
        //above clicked button is blank (value 16)
    }



    public boolean checkBelow(int r, int c, int[][]randomBoard){
        randomBoard = this.randomBoard;

        if (r == 3){ //bounds checking, return false if its top row
            return false;
        }
        return randomBoard[r - 1][c] == 16;  //return whether or not space
        //below clicked button is blank (value 16)
    }

    public boolean checkLeft(int r, int c, int[][]randomBoard){
        randomBoard = this.randomBoard;

        if (c == 0){ //bounds checking, return false if its top row
            return false;
        }
        return randomBoard[r][c - 1] == 16;  //return whether or not space
        //left of clicked button is blank (value 16)
    }

    public boolean checkRight(int r, int c, int[][]randomBoard){
        randomBoard = this.randomBoard;

        if (r == 3){ //bounds checking, return false if its top row
            return false;
        }
        return randomBoard[r][c + 1] == 16;  //return whether or not space
        //above clicked button is blank (value 16)
    }

}




