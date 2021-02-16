import java.util.Scanner;


public class main {

	private static int o;

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		
		do{
			
			System.out.println("Ingrese la opcion:");
			
			System.out.println("1=Area del circulo");
			System.out.println("2=Area del triangulo");
			System.out.println("3=Area del cuadrado");
			System.out.println("4=Area del rectangulo");
			System.out.println("5=Salir");
			
			
			
			int o=0;
			
			o=entrada.nextInt();
			
			switch(o){
				
				case 1:
					System.out.println("Ingrese el radio");
				
			        double  r=0,r2=0;
				    double pi=3.14;
					
					r=entrada.nextDouble();
				
				    circulo c=new circulo(); 
			         
			        c.ac( r,pi, r2);
			        System.out.println("El area del circulo es: "+c.ac(r,r2, pi));
			        
			        break;
				
				case 2:
					
					System.out.print("Ingrese la base");
					double b=0, h=0, A=0; 
				    b=entrada.nextInt();
				    
					System.out.println("Ingrese la altura");
				    h=entrada.nextInt();
				
				    triangulo t=new triangulo(); 
				    t.at(b,h);
				    System.out.println("El area del triangulo es: "+t.at(b,h));
				    break;
				
				case 3:
					
					System.out.println("Ingrese el lado");
					double l=0,l2=0;
				    l=entrada.nextInt();
				    
				    cuadrado cu=new cuadrado();
				    cu.acu(l,l2);
				    System.out.println("El area del cuadrado  es: "+cu.acu(l,l2));
				    break;
				    
				case 4:
					
					System.out.println("Ingrese la base");
					double l1=0, l3=0; 
				
				    l1=entrada.nextInt();
				    System.out.println("Ingrese la altura");
				    l3=entrada.nextInt();
				    
				    rectangulo re=new rectangulo();
				    re.are(l1,l3); 
				    System.out.println("El area del rectangulo es: "+re.are(l1,l3));
				    break;
				    
				    
				    
			}}while(o!=5); 
	}}
			
			
			
			
		
		
	
