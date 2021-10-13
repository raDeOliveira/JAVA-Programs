package trabalho3lista;
//IDE: IntelliJ@Jetbrains
//User: RASO Olive
//Number: @ispg2019100463
//Date: 13/11/2020
//Time: 18:08
//Course: Informatic Engineering

import static java.lang.System.*;

public class Term {

    private double coefficient; //term coefficient
    private int degree; //degree coefficient

    public Term(){} //constructor

    public Term(double coef, int deg) { //constructor with atributes
        coefficient = coef;
        degree = deg;
    }

    //setters
    public void setCoefficient(double coef){
        coefficient = coef;
    }

    public void setDegree(int deg){
        degree = deg;
    }

    //getters
    public double getCoefficient(){
        return coefficient;
    }

    public int getDegree(){
        return degree;
    }

    //print method
    public void print(){
        System.out.print(coefficient + "x^" + degree);
    }

}
