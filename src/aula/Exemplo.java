package aula;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Visitante7
 */
public class Exemplo implements NewInterface {

    private int x;
    private int y;  
   
    public Exemplo(int x1, int y1) {
        this.x = x1;
        this.y = y1;
    }    
    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Exemplo{" + "x=" + x + ", y=" + y + '}';
    }
       
}
