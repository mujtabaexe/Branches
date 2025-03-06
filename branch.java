// Source code is decompiled from a .class file using FernFlower decompiler.
class Complex {
    private double real;
    private double imag;
 
    public Complex() {
       this.real = 0.0;
       this.imag = 0.0;
    }
 
    public Complex(double var1, double var3) {
       this.real = var1;
       this.imag = var3;
    }
 
    public Complex Add(Complex var1) {
       Complex var2 = new Complex(this.real + var1.real, this.imag + var1.imag);
       return var2;
    }
 
    public void show() {
       System.out.println(this.real + this.imag);
    }
 }
 