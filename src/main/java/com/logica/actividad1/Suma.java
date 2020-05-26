package com.logica.actividad1;

public class Suma {
   private int x;

   public Suma(int sum) {
       this.setX(sum);
   }
   
   public void setX(int x) {
       this.x = x;
   }

   public int getX(){
       return this.x;
   }

   public int calcSuma(){
       int suma  = 0;
       int serie = 0;
       for (int i = 1; i < this.getX(); i++) {
           serie += 3;
           suma = suma + serie;
       }
       return suma;
   }
}