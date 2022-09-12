/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.logic;

/**
 *
 * @author thiag
 */
public class Core {
    /*
    ING - EACH PIECE WILL BE REPRESENTED BY A WHOLE NUMBER
    PT-Br CADA PEÇA SERÁ REPRESENTADA POR UM NUMERO INTEIRO,
    1 - black king      7 - white king
    2 - black queen     8 - white queen
    3 - black bishop    9 - white bishop
    4 - black horse     10 - white horse
    5 - black tower     11 - white tower
    6 - black pawn      12 - white pawn
    
    Board Chess */
    public int [][]board = new int[7][7];
    int chessPiece = 0;
    int x = 0;
    int y = 0;
    int lastX = 0;
    int lastY = 0;
    String pieceTypeSelected = "";
    
    //Constructor
    public Core() {
    
    }
    
    //Movement of pieces
    public void movement(int chessPiece, int x, int y, int lastX, int lastY) throws Exception {
        this.chessPiece = chessPiece;
        this.pieceTypeSelected = (chessPiece < 7? "white" : "black");
            
        
        if (board[x][y] == 0) {
            setBoard(chessPiece,x,y);
            this.lastX=lastX;
            this.lastY=lastY;
            setBoard(0,lastX,lastY);
           
        } else {
           throw new Exception("Não pode executar jogada nesta posição!");
        }
           
    }
    
    //Start the Board
    public void initBoard(){
        for (int l = 0; l < 8; l++) {
            for (int c = 0; c < 8; c++) {
                if (l >= 2 && l <= 5) setBoard(0,l,c);
                if (l == 1) setBoard(6,l,c);
                if (l == 6) setBoard(12,l,c);
            }
        }
        
        setBoard(7,0,0);
    }
    //Getters and Setters
    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int chessPiece, int x, int y) {
        this.chessPiece = chessPiece;
        this.x = x;
        this.y = y;
    }

    public int getChessPiece() {
        return chessPiece;
    }

    public void setChessPiece(int chessPiece) {
        this.chessPiece = chessPiece;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
