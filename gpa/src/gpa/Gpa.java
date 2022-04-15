package gpa;

import java.math.BigDecimal;
import javax.swing.JOptionPane;

public class Gpa {

    public static void main(String[] args) {
       double sum=0 , co=0;
        int grade , n=1 ,i;
         String num = JOptionPane.showInputDialog("ادخل عدد المواد");
         int count = Integer.parseInt(num);
         int [] sub = new int[count];
         double [] gpa= new double [count];
         for ( i=0 ; i<count;i++){
             String g = JOptionPane.showInputDialog("ادخل درجة المادة رقم "+n);
             n++;
             co++;
             grade = Integer.parseInt(g);
             sub[i]=grade;
         }
         for (i=0 ; i<count ; i++){
             for (int g=0 ; g<count ; g++){
                if (i<count){
                     if (sub[i]>=90 && sub[i]<=100){
                 gpa [g]=4;
             }
                 else if (sub[i]>=85 && sub[i]<90){
                     gpa [g]=3.7;                     
                 }
                 else if (sub[i]>=80 && sub[i]<85){
                     gpa [g]=3.3;                     
                 }
                 else if (sub[i]>=75 && sub[i]<80){
                     gpa [g]=3;                     
                 }
                 else if (sub[i]>=70 && sub[i]<75){
                     gpa [g]=2.7;                     
                 }
                 else if (sub[i]>=65 && sub[i]<70){
                     gpa [g]=2.4;                     
                 }
                 else if (sub[i]>=60 && sub[i]<65){
                     gpa [g]=2.2;                     
                 }
                 else if (sub[i]>=50 && sub[i]<60){
                     gpa [g]=2;                     
                 }
                 else if ( sub[i]<50){
                     gpa [g]=0;                     
                 }
                     i++;
                }
             }
         }
         for (i=0 ; i<count ; i++){
             gpa [i]*=3;
         }
         for (i=0 ; i<count ; i++){
             sum +=gpa[i];
         }
         double GPA = sum/(3*co);
          BigDecimal g = new BigDecimal(GPA);
        double G = g.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
             JOptionPane.showMessageDialog(null, "GPA = "+G);        
    }    
}