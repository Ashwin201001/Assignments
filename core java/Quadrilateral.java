package com.ashwin;

public abstract class Quadrilateral {
	public static void main(String[] args) {
	   protected int base;
	   protected int height;
	   // Default constructor
	   public Quadrilateral() {
	       this.base = 0;
	       this.height = 0;
	   }
	   // Parameterized constructor
	   public Quadrilateral(int base, int height) {
	       this.base = base;
	       this.height = height;
	   }
	   // Abstract method to calculate area
	   public abstract double calculateArea();
	   // Getter and setter methods
	   public int getBase() {
	       return base;
	   }
	   public void setBase(int base) {
	       this.base = base;
	   }
	   public int getHeight() {
	       return height;
	   }
	   public void setHeight(int height) {
	       this.height = height;
	   }
	}
	// Derived class Square
	class Square extends Quadrilateral {
	   public Square(int side) {
	       super(side, side);
	   }
	   @Override
	   public double calculateArea() {
	       return base * base;
	   }
	}
	// Derived class Rectangle
	class Rectangle extends Quadrilateral {
	   public Rectangle(int length, int width) {
	       super(length, width);
	   }
	   @Override
	   public double calculateArea() {
	       return base * height;
	   }
	}
	// Derived class Parallelogram
	class Parallelogram extends Quadrilateral {
	   private int side;
	   public Parallelogram(int base, int height, int side) {
	       super(base, height);
	       this.setSide(side);
	   }
	   @Override
	   public double calculateArea() {
	       return base * height;
	   }
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	}
	}
	