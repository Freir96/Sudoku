/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blindsudoku;

/**
 *
 * @author Aspire
 */
public class SmallTemplate {
    boolean[][] sudokuTamplate;
    Orientation rectangleOrientation;

    public SmallTemplate(boolean[][] template, Orientation o) {
        rectangleOrientation = o;
        this.sudokuTamplate = template;
    }
    public boolean getPoint(int x, int y){
        return sudokuTamplate[x][y];
    }
}
