/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativavaliativa;

/**
 *
 * @author naomi
 */
import java.util.Scanner;
public class AtivAvaliativa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String prgm;
        
      System.out.println("Programas");
       System.out.print("1- GEB\n2- 0 a 999 por extenso\n3- Múltiplos ou Não?\n"
        + "4- Ordem Crescente ou Decrescente\n5- Prêmio\n6- Horário de Entrada e Saída\n"
        + "7- Média\n8- Lanchonete\n9- Soma dos N Primeiros\nX- Soma dos Primos\n");
       System.out.print("Digite o número do programa que deseja: ");
       prgm = entrada.nextLine();
       
       char pg = prgm.charAt(0);
       while (pg != 0)
       {
         switch (pg)
         {
           case '0': System.exit(0);break;
           case '1': geB();break;
           case '2': numExtenso();break;
           case '3': multiplos(); break;
           case '4': ordemCouD(); break;
           case '5': natalEmpresa();break;
           case '6': horarioEntSai(); break;
           case '7': Media(); break;
           case '8': Lanchonete(); break;
           case '9': somaN(); break;
           case 'X': somaPrimos(); break;
           default: System.out.print("erro");
         } 
         System.out.print("Digite o número do programa que deseja: ");
         prgm = entrada.nextLine();
         pg = prgm.charAt(0);
         }

    }
    
    private static void geB()
    {
        Scanner entDoub = new Scanner (System.in);
        Scanner entStr = new Scanner (System.in);
        double gebm, gebf, alt, pc, i;
        String sexo;
        
        System.out.println ("Digite o seu sexo biológico [M/F]: ");
        sexo = entStr.nextLine();
        System.out.println ("Digite o seu peso corporal em kg: ");
        pc = entDoub.nextDouble();
        System.out.println ("Digite sua altura em cm: ");
        alt = entDoub.nextDouble();
        System.out.println ("Digite a sua idade em anos: ");
        i = entDoub.nextDouble();
        
        
       if (sexo.equals("F"))
       {
       gebf = 655.1 + (9.56 * pc) + (1.85 * alt)-(4.67 * i);
       System.out.println("O Gasto Energético Basal é: "+gebf);
       }
       else
       {
          if (sexo.equals("M")) 
         {
         gebm =  66.47 + (13.75 * pc) + (5 * alt) - (6.76 * i);
         System.out.println("O Gasto Energético Basal é: "+gebm);
         }
          else
          System.out.println ("Sexo Biológico " + sexo + " Inválido! Apenas F ou M.");
        }
        System.out.print("\n");
    }
    
    private static void numExtenso()
    {
       Scanner ent = new Scanner (System.in);
       double a,c,d,u;
       
       System.out.print("Digite um número entre 0 e 999: \n");
       a = ent.nextDouble();
        if (a<0 || a>999)
        System.out.print("O número é inválido.\n");
       
       else
       {
        System.out.print("O número por extenso é: \n");
        
        if (a==0)
            System.out.print("Zero");
        
        else
        {
        c = Math.floor(a/100);
        d = Math.floor((a%100)/10);
        u = Math.floor((a%100)%10);
        
        int cii=(int)c;
        int dii=(int)d;
        int uii=(int)u;
        
        String cs,ds,us;
        cs=Double.toString(c);
        ds=Double.toString(d);
        us=Double.toString(u);
        
        char ci = cs.charAt(0);
        char di = ds.charAt(0);
        char ui = us.charAt(0);
        
          if (cii==1 && dii==0 && uii==0)
          {
            System.out.print ("Cem \n");
          }
          else
          {
          switch (ci) 
               {
                case '0': System.out.print(" "); break;
                case '1': System.out.print("Cento "); break;
                case '2': System.out.print("Duzentos ");break;
                case '3': System.out.print("Trezentos ");break;
                case '4': System.out.print("Quatrocentos"); break;  
                case '5': System.out.print("Quinhentos "); break;
                case '6': System.out.print("Seiscentos "); break;
                case '7': System.out.print("Setecentos "); break;
                case '8': System.out.print("Oitocentos "); break;
                case '9': System.out.print("Novecentos ");break;
                default: System.out.print("erro4");
                }
          
              if(uii!=0 && dii!=0 && cii!=0)
                  {System.out.print(" e ");}

               if(dii!=1)
               {
                  switch(di)
                  {
                      case '0': System.out.print("");break;
                      case '1': System.out.print("Dez");break;
                      case '2': System.out.print("Vinte ");break;
                      case '3': System.out.print("Trinta ");break;
                      case '4': System.out.print("Quarenta ");   break;
                      case '5': System.out.print("Cinquenta "); break;
                      case '6': System.out.print("Sessenta "); break;
                      case '7': System.out.print("Setenta "); break;
                      case '8': System.out.print("Oitenta "); break;
                      case '9': System.out.print("Noventa ");break;
                  }
              }
               else
               {
                switch(ui)
                {
                  case '1':System.out.print("Onze"); break;
                  case '2':System.out.print("Doze"); break;
                  case '3':System.out.print("Treze"); break;
                  case '4':System.out.print("Quatorze"); break;
                  case '5':System.out.print("Quinze"); break;
                  case '6':System.out.print("Dezesseis"); break;
                  case '7':System.out.print("Dezesete"); break;
                  case '8':System.out.print("Dezoito"); break;
                  case '9':System.out.print("Dezenove"); break;
                  default: System.out.print("erro3");
                }                   
               }
                  
                  if(((uii!=0) && (dii!=1) && cii!=0) || ((dii!=0) && (cii!=0) && (uii!=0)))
                  {
                      System.out.print(" e ");}
                  
                  if(dii!=1)
                  {                  
                  switch (ui)
                   {
                      case '0': System.out.println("");break;
                      case '1': System.out.println("Um");break;
                      case '2': System.out.println("Dois");break;
                      case '3': System.out.println("Três");break;
                      case '4': System.out.println("Quatro"); break;
                      case '5': System.out.println("Cinco"); break;
                      case '6': System.out.println("Seis"); break;
                      case '7': System.out.println("Sete"); break;
                      case '8': System.out.println("Oito"); break;
                      case '9': System.out.println("Nove");break;
                      default: System.out.println("erro2");
                   }
                  }
              }
           }
        }
        System.out.print("\n");
    }
    
    private static void multiplos()
    {
     Scanner ent = new Scanner (System.in);
        double a,b;
        
        System.out.print("Digite o primeiro valor: ");
        a = ent.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        b = ent.nextDouble();
        
        if((a % b==0)||(b % a==0))
        System.out.println(a + " e "+ b + " são Múltiplos");
        else
        System.out.println(a + " e "+ b + " não são Múltiplos");  
    }
    
    private static void ordemCouD()
    {
      Scanner entD = new Scanner (System.in);
      Scanner entI = new Scanner (System.in);
      double a,b,c;
      int i;
      
      System.out.println("Digite quatro valores, sendo i um valor inteiro e positivo\n"
              + "e os outros três quaisquer valores reais: ");
      System.out.print("i: ");
      i = entI.nextInt();
      System.out.print("a: ");
      a = entD.nextDouble();
      System.out.print("b: ");
      b = entD.nextDouble();
      System.out.print("c: ");
      c = entD.nextDouble();
      

     if(i==1)
        {
        if (a<b && a<c)
           {  
            if(b<c)
            System.out.println(" A Ordem Crescente é: "+ a +" - " + b +" - " + c);
            else{
            if(b>c)
            System.out.println("A Ordem Crescente é: "+ a +" - " + c +" - " + b);}
           }
          else
         {
           if(b<a && b<c)
           {
            if (a>c)
             System.out.println("A Ordem Crescente é: "+ b +" - " + c +" - " + a);
            else
            {
            if (a<c)
             System.out.println("A Ordem Crescente é: "+ b +" - " + a +" - " + c);
            }
           } 
           else
           {
           if (c<b && c<a)
            {
            if(b<a)
                System.out.println("A Ordem Crescente é: "+c +" - " + b +" - " + a);
            else
              {
                if(b>a)
                    System.out.println("A Ordem Crescente é: "+ c +" - " + a +" - " + b);
              }
            }
           }
         }
        }        
        else
        {
         if (i==2)
         {
           if(a>b && a>c)
           {
            if (b>c)
               System.out.println("A Ordem Decrescente é: "+ a +" - " + b +" - " + c );
            else
             {
              if(b<c)
               System.out.println("A Ordem Decrescente é: "+ a +" - " + c +" - " + b);
             }
           }
           else
           {
           if(b>a && b>c)
             {
             if (c>a)
              System.out.println("A Ordem Decrescente é: "+ b +" - " + c +" - " + a);
             else
               {
                 if (c<a)
                  System.out.println("A Ordem Decrescente é: "+ b +" - " + a +" - " + c);
               }
             }
           else
            {
            if (c>a && c>b)
              {
               if (b>a)
                System.out.println("A Ordem Decrescente é: "+ c +" - " + b +" - " + a);
               else
               {
               if(b<a)
                 System.out.println("A Ordem Decrescente é: "+ c +" - " + a +" - " + b);
               }
              }
            }
           }
         }  
        else
        System.out.println("Valor de i inválido!");
        }
    }
    
    private static void natalEmpresa()
    {
        Scanner ent = new Scanner(System.in);
        double hem, hfm, h, he, hf;
        
        System.out.print("Digite o número de horas extra em minutos: ");
        hem = ent.nextDouble();
        System.out.print("Digite o número de horas-falta em minutos: ");
        hfm = ent.nextDouble();
        
        he = hem/60; 
        hf = hfm/60;
        h = (hem) - (2/3 * hfm);
        
        System.out.printf("Número de horas extras: %3.0f",he);
        System.out.printf("\nNúmero de horas-falta: %3.0f\n",hf);
        
        if (h>2400)
        {
        System.out.print("\nPrêmio: R$ 500,00\n");
        }
        else
        {
        if(h>=1801 && h<=2400)
          {
           System.out.print("\nPrêmio: R$ 400,00\n");
          } 
        else
          {
          if(h>=1201 && h<=1800)
            {
             System.out.print("\nPrêmio: R$ 300,00\n");
            }
           else
            {
            if(h>=600 && h<=1200)
              {
                  System.out.print("\nPrêmio: R$ 200,00\n");
              }
            else
              {
              if(h<600)
                {
                 System.out.print("\nPrêmio: R$ 100,00\n");
                }
              }
            }
          }
        }
    }
    
    private static void horarioEntSai()
    {
    Scanner ent = new Scanner(System.in);
        int hent, hsaida, hsaida2;
        
        System.out.print("Digite o horário de entrada: ");
        hent = ent.nextInt();
        
        if(hent<0 || hent>24)
        System.out.println("Horário de Entrada Inválido!");
        else
        {
        hsaida = hent+6;
        if(hent>18)
         {
         hsaida2= hsaida-24;
         System.out.println("Horário de Saída: "+ hsaida2 + "h");
         }
        else
          {
           if(hsaida==24)
               System.out.println("Horário de Saída: 00h");
           else
            System.out.println("Horário de Saída: " + hsaida + "h");
          }
        }
    }
    
    private static void Media()
    {
     Scanner ent = new Scanner (System.in);
      float i, a, b;
      
      i = 0;
      a = 1;
      b = 1;
      while(b>=0)
      {
          System.out.print("Digite um número: ");
          b = ent.nextInt();
          a += b;
          i++;          
      }
      System.out.println("A Média é: " + a/(i-1));
    }
    
    private static void somaN()
    {
    Scanner ent = new Scanner (System.in);
      int n, i, soma;
      
      System.out.print("Digite um número inteiro positivo: ");
      n = ent.nextInt();
      
      i=0;
      soma = 0;
      
      while (i<=n)
      {
      soma = soma + i;
      i = i + 1;
      }
      System.out.println ("A soma dos " + n + " primeiros números é: " + soma);
    }
    
    private static void somaPrimos()
    {
    Scanner ent = new Scanner (System.in);
      int n, i,soma, a;
      a = 0;
      soma = 0;
      System.out.print("Digite um número inteiro positivo: ");
      n = ent.nextInt();

      for(i=1;i<=n+1;i++) 
       {
       if (n%i==0)
       {
        a++;
        }
       if (a==2)
       {
       soma += i;
        }
       }  
      System.out.println ("A soma dos números primos é: " + soma);
    
    }
    
    private static void Lanchonete()
    {
    Scanner ent = new Scanner (System.in);
     String cd;
     int qntd;
     double total;
     
     System.out.println("OPÇÃO   -    CÓDIGO    - PREÇO\nCachorro Quente -  c  - R$2,00\n"
             + "Refrigerante -  r   - R$2,50\nSobremesa -  s  - R$1,50\n");
     System.out.print("Digite o código do pedido: ");
     cd = ent.nextLine();
     System.out.print("Digite a quantidade do pedido: ");
     qntd = ent.nextInt();
      char c = cd.charAt(0);
      total = 0;

     
      switch (c)
       {
        case 'c': total = qntd*2; break;
        case 'r': total = qntd*2.50; break;
        case 's': total = qntd*1.50; break;
        default: System.out.print("ERRO! Código Inválido"); break;
       }
    
     System.out.println("O valor total é R$  "+ total);
    }
}
