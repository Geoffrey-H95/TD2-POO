/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td2.poo;


/**
 *
 * @author Geoffrey
 */
public class Rectangle extends Polygone {

	/**
	 * 
	 * @param sg
	 * @param id
	 */
	public Rectangle(Point sg, Point id) {            
            super(new Point[]{sg,new Point(sg.getX(),id.getY()), id,new Point(id.getX(),sg.getY())});
	}

        @Override
	public double surface() {
            return (this.getSommets()[0].distance(this.getSommets()[1]))*(this.getSommets()[0].distance(this.getSommets()[3]));   
	}

        @Override
	public String toString() {
            StringBuffer buff = new StringBuffer();
            buff.append("Rectangle à plat ");
            buff.append(this.texteSommets());
            return buff.toString();
	}

}